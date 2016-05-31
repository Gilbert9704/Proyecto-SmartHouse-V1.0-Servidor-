package GUI;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

import DAO.ArchivoUsr;
import Datos.SmartHouse;
import Datos.Usuario;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfUsuario;
	private JPasswordField pfContrasena;
	
	SmartHouse smtHouse = new SmartHouse();
	ArchivoUsr archvUsr = new ArchivoUsr();
	
	//Constructor de la interfaz de Usuario del Login
	public LoginFrame() {
		inicializarComponentes();
	}
	
	//Inicializa Cada Componente del Frame
	public void inicializarComponentes(){
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("res/casa.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 340);
		
		String texto = "<html><body>Para poder abrir la puerta principal<br>debe ingresar los campos requeridos</body></html>";
		JLabel lblAviso = new JLabel(texto);
		lblAviso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAviso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAviso.setBounds(135, 25, 206, 43);
		getContentPane().add(lblAviso);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setBounds(94, 96, 46, 14);
		getContentPane().add(lblUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(175, 94, 140, 20);
		getContentPane().add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContrasena.setBounds(94, 142, 75, 14);
		getContentPane().add(lblContrasena);
		
		pfContrasena = new JPasswordField();
		pfContrasena.setBounds(175, 140, 140, 20);
		getContentPane().add(pfContrasena);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accederCasa();
			}
		});
		btnAcceder.setBounds(200, 179, 89, 23);
		getContentPane().add(btnAcceder);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(51, 250, 89, 23);
		getContentPane().add(btnSalir);
		
		JButton btnRegistrarse = new JButton("Registrar Usuario");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroFrame regFrm = new RegistroFrame();//Me abre la ventana RegistroFrame
				regFrm.setVisible(true);
			}
		});
		btnRegistrarse.setBounds(281, 250, 140, 23);
		getContentPane().add(btnRegistrarse);
		
		JLabel lblnoSeEncuentra = new JLabel("\u00BFNo se encuentra registrado?");
		lblnoSeEncuentra.setBounds(271, 225, 169, 14);
		getContentPane().add(lblnoSeEncuentra);
	}//Fin M�todo inicializarComponentes();
	
	//Carga y verifica los datos del usuario, una vez verificados los datos se cargar� el panel de control
	public void accederCasa(){//
		String usuario = tfUsuario.getText();
		String pass = new String(pfContrasena.getPassword());
		
		if ("".equals(usuario) || "".equals(pass)){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos solicitados");
        }
        else {
            HashMap<String, Usuario> registros = new HashMap<>();
            try {
                registros = archvUsr.leerDatosUsr();
            } catch (ClassNotFoundException ex) {
            	JOptionPane.showMessageDialog(null, "�Error!");
            }
            
            Usuario logIn = registros.get(usuario);
            if (logIn != null){
            	
            	JOptionPane.showMessageDialog(null, "�Ha Iniciado Sesi�n!");
            	String nm = logIn.getNombre();
           	boolean alc1 = logIn.isPrtAlcoba1();
           	boolean alc2 = logIn.isPrtAlcoba2();
           	boolean pers = logIn.isPersiana();
            		
           		LoginFrame.this.dispose();
           		ControlFrame contfrm = new ControlFrame(nm, alc1, alc2, pers);
           		contfrm.setVisible(true);
           		contfrm.setLocationRelativeTo(null);
            	
            }else{
                JOptionPane.showMessageDialog(null, "�El Usuario no existe!");
            }
        } 
	}//Fin Metodo accederCasa
}
