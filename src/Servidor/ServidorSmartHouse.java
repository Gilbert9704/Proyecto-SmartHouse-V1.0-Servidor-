package Servidor;

//import Acciones.RecibirComandoCliente;
import javax.swing.JFrame;
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ServidorSmartHouse extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextArea texto = new JTextArea();

  	public void servidor() {
  		new ServidorSmartHouse();
  	}

  	public ServidorSmartHouse() {
            // Place text area on the frame
            setLayout(new BorderLayout());
            add(new JScrollPane(texto), BorderLayout.CENTER);

            setTitle("ServidorSmartHouse (Verificador de Conexiones)");
            setSize(500, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true); // It is necessary to show the frame here!

            try {
                // Crea un server Socket
                ServerSocket serverSocket = new ServerSocket(8000);
                texto.append("ServidorSmartHouse inició " + new Date() + '\n');

                // Number a client
                int usuarioNo = 1;
                
                while (true) {
                    // Esperando una nueva conexión
                	//Debemos cambiar este serverSocket, para colocarlo arriba 
                    Socket socket = serverSocket.accept();

                    // Muestra en numero del cliente
                    texto.append("Iniciando nuevo hilo para el usuario " + usuarioNo + " a las " + new Date() + '\n');

                    // Encuentra y muestra la IP del usuario
                    InetAddress inetAddress = socket.getInetAddress();
                    texto.append("Direccion IP del Usuario " + usuarioNo + ": " + inetAddress.getHostAddress() + "\n");

                    // Crea un nuevo Hilo para la conexion
                    ManejoDeUsuarios tarea = new ManejoDeUsuarios(socket);
                    
                    // Inicia un nuevo Hijo 
                    new Thread(tarea).start();
                    
                    // Incrementa en numero del cliente
                    usuarioNo++;
                }
            }catch(IOException ex) {
                System.err.println(ex);
            }
        }

	 
	
	
	
}
