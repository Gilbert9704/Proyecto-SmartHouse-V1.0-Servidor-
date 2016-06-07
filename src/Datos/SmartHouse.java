package Datos;

import java.io.IOException;
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
	
	int auxInt;
	
	public HashMap <String, Usuario> usuarios = new HashMap<>();
	
	Usuario regstUsr = new Usuario(name, userName, password, relationship, doorA, doorB);
	ArchivoUsr archUsr = new ArchivoUsr();
	
	public SmartHouse(HashMap <String, Usuario> u){
		usuarios = u;
	}
	
	public SmartHouse(){}
	
	public void registrarUsuario(boolean a, boolean b) throws IOException{
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
			//La idea de tener cada CheckBox como atributo es que antes de cargar la interfaz de control
			//se verificarán las restricciones y los botones de esas funciones restringidas se bloquearán
			if ("".equals(name) || "".equals(userName) || "".equals(password) || "".equals(relationship)){
                throw new IllegalArgumentException("Aún faltan datos por completar");
            }else if (isNumeric(name) || isNumeric(relationship)){
                throw new IllegalArgumentException("El formato del nombre es incorrecto");
            }else{

                if (usuarios.containsKey(userName)){
                    JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe, ingrese uno distinto");
                }else{
                    usuarios.put(userName, new Usuario(name, userName, password, relationship, doorA, doorB));
                    JOptionPane.showMessageDialog(null, "¡¡Registro Exitoso!!");
                    JOptionPane.showMessageDialog(null, toString(),"Información", JOptionPane.PLAIN_MESSAGE);
                    archUsr.almacenarDatosUsr(usuarios);
                    auxInt = 1;
                }
                
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
				+ "\nAcceso a la Alcoba 1: " + accAlcoba1 + "\nAcceso a la Alcoba 2: " + accAlcoba2;
	}
	
	public int paraCerrar(){
		if (auxInt == 1){
			return 1;
		}else{
			return 0;
		}
	}
}
