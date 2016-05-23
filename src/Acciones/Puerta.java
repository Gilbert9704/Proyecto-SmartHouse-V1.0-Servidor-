package Acciones;

import javax.swing.JOptionPane;

public class Puerta implements MovimientosPuerta {

	@Override
	public boolean puertaAlcoba1(boolean alcoba1) {
		boolean prtAlcoba1 = alcoba1;
		// Teniendo en cuenta este booleano se abrirá o cerrará la puerta
		if (prtAlcoba1 == true){
		JOptionPane.showMessageDialog(null, "Puerta de la Alcoba 1 Abierta");
		}else{
			JOptionPane.showMessageDialog(null, "Puerta de la Alcoba 1 Cerrada");
		}
		return prtAlcoba1;
	}

	@Override
	public boolean puertaAlcoba2(boolean alcoba2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puertaBano(boolean bano) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puertaPrincipal(boolean puertaPrinc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean persiana(boolean persiana) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	public boolean estado;
	
	public Puerta(boolean estado){
		this.estado = estado;
	}
	*/
	
	
}
