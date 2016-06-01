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
                // Create a server socket
                ServerSocket serverSocket = new ServerSocket(8000);
                texto.append("ServidorSmartHouse inici� " + new Date() + '\n');

                // Number a client
                int usuarioNo = 1;
                
                while (true) {
                    // Listen for a new connection request
                    Socket socket = serverSocket.accept();

                    // Display the client number
                    texto.append("Iniciando nuevo hilo para el usuario " + usuarioNo + " a las " + new Date() + '\n');

                    // Find the client's host name, and IP address
                    InetAddress inetAddress = socket.getInetAddress();
                    texto.append("Direccion IP del Usuario " + usuarioNo + inetAddress.getHostAddress() + "\n");

                    // Create a new thread for the connection
                    ManejoDeUsuarios tarea = new ManejoDeUsuarios(socket);
                    
                    // Start the new thread 
                    new Thread(tarea).start();
                    
                    /*
                    //Crea un nuevo Hilo para los comandos del cliente<-------->
                    RecibirComandoCliente reccmcl = new RecibirComandoCliente(socket);                   
                    //Inicia un nuevo hilo
                    new Thread(reccmcl).start();
                    //<----------->
                    */
                    
                    // Increment clientNo
                    usuarioNo++;
                }
            }catch(IOException ex) {
                System.err.println(ex);
            }
        }

	 
	
	
	
}
