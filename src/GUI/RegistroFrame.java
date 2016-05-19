package GUI;


import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Datos.SmartHouse;


public class RegistroFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JTextField txfdNombre;
	public static JTextField txfdNombreUsr;
	public static JTextField txfdContrasena;
	public static JTextField txfdParentesco;
	public static JCheckBox chckbxAlcoba_1;
	public static JCheckBox chckbxAlcoba_2;
	public static JCheckBox chckbxPersiana;
	
	//===================================
	public boolean estadoAlcoba1;
	public boolean estadoAlcoba2;
	public boolean estadoPersiana;
	
	SmartHouse smhs;
	
	public RegistroFrame() {
		smhs = new SmartHouse();
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("cuaderno.png"));
		setTitle("SmartHouse v1.0 Registo");
		setBounds(100, 100, 520, 470);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(215, 24, 63, 26);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(89, 82, 101, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setBounds(99, 132, 111, 14);
		getContentPane().add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setBounds(95, 185, 91, 14);
		getContentPane().add(lblContrasea);
		
		txfdNombre = new JTextField();
		txfdNombre.setBounds(247, 79, 140, 20);
		txfdNombre.setColumns(10);
		getContentPane().add(txfdNombre);
		
		txfdNombreUsr = new JTextField();
		txfdNombreUsr.setBounds(247, 129, 140, 20);
		txfdNombreUsr.setColumns(10);
		getContentPane().add(txfdNombreUsr);
		
		txfdContrasena = new JTextField();
		txfdContrasena.setBounds(247, 182, 140, 20);
		txfdContrasena.setColumns(10);
		getContentPane().add(txfdContrasena);
		
		JLabel lblParentesco = new JLabel("Parentesco");
		lblParentesco.setHorizontalAlignment(SwingConstants.CENTER);
		lblParentesco.setBounds(95, 230, 91, 14);
		getContentPane().add(lblParentesco);
		
		txfdParentesco = new JTextField();
		txfdParentesco.setBounds(247, 227, 140, 20);
		getContentPane().add(txfdParentesco);
		
		JLabel lblDeclareLaRestricciones = new JLabel("Elija los elementos que este usuario podr\u00E1 controlar");
		lblDeclareLaRestricciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDeclareLaRestricciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeclareLaRestricciones.setBounds(65, 277, 368, 14);
		getContentPane().add(lblDeclareLaRestricciones);
		
		//Estos CheckBox va a ser quienes declaren las restricciones para cada usuario
		JCheckBox chckbxAlcoba_1 = new JCheckBox("Puerta Alcoba 1");
		chckbxAlcoba_1.setBounds(65, 305, 121, 23);
		getContentPane().add(chckbxAlcoba_1);
		
		JCheckBox chckbxAlcoba_2 = new JCheckBox("Puerta Alcoba 2");	
		chckbxAlcoba_2.setBounds(203, 305, 121, 23);
		getContentPane().add(chckbxAlcoba_2);
		
		JCheckBox chckbxPersiana = new JCheckBox("Persiana");
		chckbxPersiana.setBounds(351, 305, 97, 23);
		getContentPane().add(chckbxPersiana);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroFrame.this.dispose();
			}
		});
		btnRegresar.setBounds(65, 383, 89, 23);
		getContentPane().add(btnRegresar);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxAlcoba_1.isSelected() == true){
					estadoAlcoba1 = true;
				}else{
					estadoAlcoba1 = false;
				}
				if (chckbxAlcoba_2.isSelected() == true){
					estadoAlcoba2 = true;
				}else{
					estadoAlcoba2 = false;
				}
				if (chckbxPersiana.isSelected() == true){
					estadoPersiana = true;
				}else{
					estadoPersiana = false;
				}
				smhs.registrarUsuario(estadoAlcoba1, estadoAlcoba2, estadoPersiana);
			}
		});
		btnRegistrar.setBounds(336, 383, 89, 23);
		getContentPane().add(btnRegistrar);
		
		JLabel lblADemsEste = new JLabel("A dem\u00E1s este usuario podr\u00E1 controlar otras funciones de la casa");
		lblADemsEste.setHorizontalAlignment(SwingConstants.CENTER);
		lblADemsEste.setBounds(65, 345, 368, 14);
		getContentPane().add(lblADemsEste);
	}	
}
