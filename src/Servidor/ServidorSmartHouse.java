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
        // Coloca el textArea en el Frame
  		setIconImage(Toolkit.getDefaultToolkit().getImage("src/res/casa.png"));
        setLayout(new BorderLayout());
        add(new JScrollPane(texto), BorderLayout.CENTER);

        setTitle("ServidorSmartHouse (Verificador de Conexiones)");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 

        try {
        	// Crea un server Socket
        	@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(8000);
        	texto.append("ServidorSmartHouse inició " + new Date() + '\n');

        	// Enumera un cliente
        	int usuarioNo = 1;
                
        	while (true) {
        		// Esperando una nueva conexión
              	Socket socket = serverSocket.accept();

                // Muestra en numero del cliente
                texto.append("Iniciando nuevo hilo para el usuario " + usuarioNo + ". *Fecha y Hora: " + new Date() + '\n');

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
