package Servidor;


import DAO.ArchivoUsr;
import Datos.Usuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import Acciones.Casa;

public class ManejoDeUsuarios implements Runnable{
	
    private Socket socket;
    
    Casa cs = new Casa();
    
    public ManejoDeUsuarios(Socket socket) {
        this.socket = socket;
    }
    
    
    @Override
    public void run() {	
	try {
            // Crea los flujos de entrada y salida
            DataInputStream delCliente = new DataInputStream(socket.getInputStream());
            DataOutputStream alCliente = new DataOutputStream(socket.getOutputStream());
            
            //Se envia el objeto usuario a la clase LoginFrame del Cliente para poder cargar 
            //el panel de control personalizado
            ObjectOutputStream alClienteUsr = new ObjectOutputStream(socket.getOutputStream());
            
            String permiso;
            
            //Se cargan los datos para conceder o denegar el acceso al cliente
            ArchivoUsr archivo;
	
            HashMap<String, Usuario> registros = new HashMap<>();
	
            archivo = new ArchivoUsr();
            
            try {
                registros = archivo.leerDatosUsr();
            } catch (ClassNotFoundException ex) {}
            //<--------------------------------->
             
            // Continuamente sirve al cliente
            while (true) {
                // Recibe el usuario del cliente
                String usuario = null;
                try {
                    usuario = delCliente.readUTF();
                } catch (IOException ex) {
                    Logger.getLogger(ManejoDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Usuario logIn = registros.get(usuario);
                if (logIn != null){
                    String nombre = logIn.getNombre();
                    String nmUsur = logIn.getNombreDeUsuario();
                    String parent = logIn.getParentesco();
                    String contrs = logIn.getContrasena();
                    boolean alc1  = logIn.isPrtAlcoba1();
                    boolean alc2  = logIn.isPrtAlcoba2();
                    
                    //Se envian los datos al cliente y se carga su panel de control
                    Usuario usr = new Usuario(nombre, nmUsur, contrs, parent, alc1, alc2);
                    permiso = "concedido";
                    alCliente.writeUTF(permiso);
                    alClienteUsr.writeObject(usr);
                }else{
                    permiso = "denegado";//En caso de no estar registrado se niega el acceso
                    alCliente.writeUTF(permiso);
                }           
            }    
        }catch (IOException ex) {
            Logger.getLogger(ManejoDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
