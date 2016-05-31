package Servidor;

import DAO.ArchivoUsr;
import Datos.SmartHouse;
import Datos.Usuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoDeUsuarios implements Runnable{
	
    private Socket socket;
	
    public ManejoDeUsuarios(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {	
	try {
            // Create data input and output streams
            DataInputStream delCliente = new DataInputStream(socket.getInputStream());
            DataOutputStream alCliente = new DataOutputStream(socket.getOutputStream());
            
            String permiso;
            //Se cargan los datos para conceder o denegar el acceso al cliente
            
            SmartHouse smhs;
            ArchivoUsr archivo;
	
            HashMap<String, Usuario> registros = new HashMap<>();
	
            archivo = new ArchivoUsr();
		
            try {
                registros = archivo.leerDatosUsr();
            } catch (ClassNotFoundException ex) {}
                smhs = new SmartHouse(registros);
            //<--------------------------------->
            
            // Continuously serve the client
            while (true) {
                // Receive el usuario del cliente
                String usuario = null;
                try {
                    usuario = delCliente.readUTF();
                } catch (IOException ex) {
                    Logger.getLogger(ManejoDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Usuario logIn = registros.get(usuario);
                if (logIn != null){
                    permiso = "concedido";
                    alCliente.writeUTF(permiso);
                }else{
                    permiso = "denegado";
                    alCliente.writeUTF(permiso);
                }
            }    
        }catch (IOException ex) {
            Logger.getLogger(ManejoDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
