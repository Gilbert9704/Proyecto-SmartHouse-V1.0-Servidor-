
package Acciones;

//import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecibirComandoCliente{
    
    @SuppressWarnings("unused")
	private final String host = "localhost";
    
    @SuppressWarnings("resource")
	public RecibirComandoCliente(){
        // Crea un nuevo ser
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8500);
            System.out.println("El server socket de comandoCliente");
        } catch (IOException ex) {
            Logger.getLogger(RecibirComandoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Number a client
        //int usuarioNo = 1;
                
        while (true) {
        // Listen for a new connection request
        Socket socket = null;
            try {
                socket = serverSocket.accept();
            } catch (IOException ex) {
                Logger.getLogger(RecibirComandoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        // Create a new thread for the connection
         ManejoDeComandos comando = new ManejoDeComandos(socket);
                    
        // Start the new thread 
        new Thread(comando).start();
            
        }
    } 
}
