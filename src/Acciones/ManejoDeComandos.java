
package Acciones;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ManejoDeComandos implements Runnable {
    
    private Socket socket;
    
    Casa casita = new Casa();
    
    public ManejoDeComandos(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {	
	try {
            // Create data input and output streams
            DataInputStream delCliente = new DataInputStream(socket.getInputStream());
            
            int numeroPrt;
            boolean estadoPuerta;
            
            // Continuously serve the client
            while (true) {
                // Receive el numero y puerta
                numeroPrt = delCliente.readInt();
                estadoPuerta = delCliente.readBoolean();

                System.out.println(numeroPrt);
                System.out.println(estadoPuerta);
            
                if (numeroPrt != 0){
                    switch(numeroPrt){
                        case 1:
                            casita.puertaAlcoba1(estadoPuerta);
                            break;
                        case 2:
                            casita.puertaAlcoba2(estadoPuerta);
                            break;
                        case 3:
                            casita.puertaBano(estadoPuerta);
                            break;
                        case 4:
                            casita.puertaPrincipal(estadoPuerta);
                            break;
                    }
                }
                
                
            }    
        }catch (IOException ex) {}
    }
    
}
