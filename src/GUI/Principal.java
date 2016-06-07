package GUI;

import Servidor.ServidorSmartHouse;

public class Principal {

	public static void main(String[] args) {
		
		LoginFrame logFr = new LoginFrame();
		logFr.setLocationRelativeTo(null);
		logFr.setResizable(false);
		logFr.setVisible(true);
		
		ServidorSmartHouse svdmh = new ServidorSmartHouse();
		svdmh.servidor();
        
		/*
		 *En cuanto a detalles tecnicos: 
		 *1)Hay que hacer si considere la contraseña para el acceso tanto para servidor como cliente
		 *2)Lograr que el cliente controle la casa a distancia
		 *3)Incorporar más acciones, como control de sonido, ilumiancion, reintegrar la persiana, etc.
		 *4)Colocar un JComboBox en Parentesco del RegistroFrame
		 *
		 *En cuanto a detalles esteticos:
		 *1)Hay que colocarle imagenes a los JOptionPane
		 *2)Cambiar la Carpeta res por un paquete dentro del Codigo Fuente
		 */
		
		/*
		RegistroFrame regFr = new RegistroFrame();
		regFr.setTitle("SmartHouse v1.0");
		regFr.setLocationRelativeTo(null);
		regFr.setVisible(true);
		*/
		/*
		ControlFrame ctlFr = new ControlFrame();
		ctlFr.setTitle("SmartHouse v1.0");
		ctlFr.setLocationRelativeTo(null);
		ctlFr.setVisible(true);
		*/
	}
}
