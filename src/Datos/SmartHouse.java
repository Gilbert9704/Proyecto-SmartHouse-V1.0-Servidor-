package Datos;

import java.util.*;
import javax.swing.JOptionPane;

import DAO.ArchivoUsr;
import GUI.RegistroFrame;

public class SmartHouse {
	
	String name = null;
	String userName = null;
	String password = null;
	String relationship = null;
	boolean doorA = false;
	boolean doorB = false;
	boolean blind = false;
	
	//Estas variables me avisan el acceso sea concedido o denegado a los usuarios registrados
	String accAlcoba1;
	String accAlcoba2;
	String accPersiana;
	
	public HashMap <String, Usuario> usuarios = new HashMap<>();
	
	Usuario regstUsr = new Usuario(name, userName, password, relationship, doorA, doorB, blind);
	ArchivoUsr archUsr = new ArchivoUsr();
	
	public void registrarUsuario(boolean a, boolean b, boolean c){
		try{	
			name = RegistroFrame.txfdNombre.getText();
			regstUsr.setNombre(name);
			userName = RegistroFrame.txfdNombreUsr.getText();
			regstUsr.setNombreDeUsuario(userName);
			password = RegistroFrame.txfdContrasena.getText();
			regstUsr.setContrasena(password);
			relationship = RegistroFrame.txfdParentesco.getText();
			regstUsr.setParentesco(relationship);
			doorA = a;
			regstUsr.setPrtAlcoba1(doorA);
			doorB = b;
			regstUsr.setPrtAlcoba2(doorB);
			blind = c;
			regstUsr.setPersiana(blind);
			
			if (doorA == true){
				accAlcoba1 = "Concedido";
			}else{
				accAlcoba1 = "Denegado";
			}
			
			if (doorB == true){
				accAlcoba2 = "Concedido";
			}else{
				accAlcoba2 = "Denegado";
			}
			
			if (blind == true){
				accPersiana = "Condedido";
			}else{
				accPersiana = "Denegado";
			}
			//La idea de tener cada CheckBox como atributo es que antes de cargar la interfaz de control
			//se verificarán las restricciones y los botones de esas funciones restringidas se bloquearán
			if ("".equals(name) || "".equals(userName) || "".equals(password) || "".equals(relationship)){
                throw new IllegalArgumentException("Aún faltan datos por completar");
            }else if (isNumeric(name) || isNumeric(relationship)){
                throw new IllegalArgumentException("El formato del nombre es incorrecto");
            }else{
            	JOptionPane.showMessageDialog(null, "Registro Exitoso");
            	JOptionPane.showMessageDialog(null, toString(),"Información", JOptionPane.PLAIN_MESSAGE);
            	/*//Aqui guardo los objetos tipo usuario pero esto se mirará luego
                if (usuarios.containsKey(userName)){
                    JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe, ingrese uno distinto");
                }else{
                    usuarios.put(userName, new Usuario(name, userName, password, relationship, doorA, doorB, blind));
                    JOptionPane.showMessageDialog(null, "¡¡Registro Exitoso!!");
                    //mostrarDatos();
                    //arch.almacenarDatosUsr(usuarios);
                }
                */
            }
		}catch(IllegalArgumentException iae){
			JOptionPane.showMessageDialog(null, iae.getMessage());
		}
	}
	
	private boolean isNumeric(String nombre) {  //Determina si existe algun numero en el nombre o parentesco
    	String numeros = "1234567890";			//de haberlo este formato sería incorrecto
    	for(int i = 0; i < nombre.length(); i++){
    	      if (numeros.indexOf(nombre.charAt(i), 0)!= -1){
    	         return true;
    	      }
    	}
    	return false;
    }

	@Override
	public String toString() {
		return "DATOS DEL USUARIO" + "\nNombre: " + name  + "\nNombre de Usuario: " + userName + "\nParentesco: "+ relationship 
				+ "\nAcceso a la Alcoba 1: " + accAlcoba1 + "\nAcceso a la Alcoba 2: " + accAlcoba2 + "\nAcceso a la Persiana: " + accPersiana;
	}
	
	
}
