package Acciones;

//import panamahitek.Arduino.PanamaHitek_Arduino;

public class Casa implements EstadoIluminacion, MovimientosPuerta{
	
	//PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
	
	public Casa(){
		/*try {
			arduino.arduinoTX("COM15", 9600);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	@Override
	public boolean puertaAlcoba1(boolean alcoba1) {
		/*try {
			if (alcoba1 == true){
				arduino.sendData("7");
			}else{
				arduino.sendData("8");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Puerta alcoba 1");
		return alcoba1;
	}

	@Override
	public boolean puertaAlcoba2(boolean alcoba2) {
		/*try {
			if (alcoba2 == true){
				arduino.sendData("3");
			}else{
				arduino.sendData("4");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Puerta alcoba 2");
		return alcoba2;
	}

	@Override
	public boolean puertaBano(boolean bano) {
		/*try {
			if (alcoba1 == true){
				arduino.sendData("7");
			}else{
				arduino.sendData("8");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Puerta baño");
		return bano;
	}

	@Override
	public boolean puertaPrincipal(boolean puertaPrinc) {
		/*try {
			if (alcoba1 == true){
				arduino.sendData("7");
			}else{
				arduino.sendData("8");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Puerta principal");
		return puertaPrinc;
	}

	@Override
	public boolean luzAlcoba1(boolean alcoba1) {
		/*try {
			if (alcoba1 == true){
				arduino.sendData("k");
			}else{
				arduino.sendData("l");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return alcoba1;
	}

	@Override
	public boolean luzAlcoba2(boolean alcoba2) {
		/*try {
			if (alcoba2 == true){
				arduino.sendData("d");
			}else{
				arduino.sendData("e");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return alcoba2;
	}

	@Override
	public boolean luzLavanderia(boolean lavanderia) {
		/*try {
			if (lavanderia == true){
				arduino.sendData("h");
			}else{
				arduino.sendData("j");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return lavanderia;
	}

	@Override
	public boolean luzBano(boolean bano) {
		/*try {
			if (bano == true){
				arduino.sendData("b");
			}else{
				arduino.sendData("c");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return bano;
	}

	@Override
	public boolean luzEntretenimiento(boolean entretenimiento) {
		/*try {
			if (entretenimiento == true){
				arduino.sendData("f");
			}else{
				arduino.sendData("g");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return entretenimiento;
	}

	@Override
	public boolean luzCocina(boolean cocina) {
		/*try {
			if (cocina == true){
				arduino.sendData("9");
			}else{
				arduino.sendData("a");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return cocina;
	}

	@Override
	public boolean luzSalaComedor(boolean salaComedor) {
		/*try {
			if (salaComedor == true){
				arduino.sendData("f");
			}else{
				arduino.sendData("g");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Manipulando Luz Alcoba 1");
		return salaComedor;
	}
}
