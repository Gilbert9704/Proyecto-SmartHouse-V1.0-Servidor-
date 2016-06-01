package Acciones;

import panamahitek.Arduino.PanamaHitek_Arduino;

public class Puerta implements MovimientosPuerta {

	@Override
	public boolean puertaAlcoba1(boolean alcoba1) {
		// Teniendo en cuenta este booleano se abrir� o cerrar� la puerta	
		//Aqui se deber�a enviar al comando al Arduino
		System.out.println("He manipulado la puerta Alcoba 1");
		return alcoba1;
	}

	@Override
	public boolean puertaAlcoba2(boolean alcoba2) {
		// Teniendo en cuenta este booleano se abrir� o cerrar� la puerta	
		//Aqui se deber�a enviar al comando al Arduino
        //Aqui se deber�a enviar al comando al Arduino
        System.out.println("He manipulado la puerta Alcoba 2");
		return alcoba2;
	}
        //Test<--------<-<-<-<-<-<-<
	@Override
	public boolean puertaBano(boolean bano) {
		// Teniendo en cuenta este booleano se abrir� o cerrar� la puerta	
		//Aqui se deber�a enviar al comando al Arduino
        System.out.println("He manipulado la puerta Bano");
		return bano;
	}

	@Override
	public boolean puertaPrincipal(boolean puertaPrinc) {
		// Teniendo en cuenta este booleano se abrir� o cerrar� la puerta	
		//Aqui se deber�a enviar al comando al Arduino
        System.out.println("He manipulado la puerta Principal1");
		return puertaPrinc;
	}
}
