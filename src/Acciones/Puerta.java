package Acciones;


public class Puerta implements MovimientosPuerta {

	@Override
	public boolean puertaAlcoba1(boolean alcoba1) {
		// Teniendo en cuenta este booleano se abrirá o cerrará la puerta	
		//Aqui se debería enviar al comando al Arduino
		return alcoba1;
	}

	@Override
	public boolean puertaAlcoba2(boolean alcoba2) {
		// Teniendo en cuenta este booleano se abrirá o cerrará la puerta	
		//Aqui se debería enviar al comando al Arduino
		return alcoba2;
	}

	@Override
	public boolean puertaBano(boolean bano) {
		// Teniendo en cuenta este booleano se abrirá o cerrará la puerta	
		//Aqui se debería enviar al comando al Arduino
		return bano;
	}

	@Override
	public boolean puertaPrincipal(boolean puertaPrinc) {
		// Teniendo en cuenta este booleano se abrirá o cerrará la puerta	
		//Aqui se debería enviar al comando al Arduino
		return puertaPrinc;
	}

	@Override
	public boolean persiana(boolean persiana) {
		// Teniendo en cuenta este booleano se abrirá o cerrará la puerta	
		//Aqui se debería enviar al comando al Arduino
		return persiana;
	}	
}
