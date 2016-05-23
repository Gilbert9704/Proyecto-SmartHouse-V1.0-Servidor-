package GUI;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfUsuario;
	private JPasswordField pfContrasena;
	
	ControlFrame cf = new ControlFrame();
	//Constructor de la interfaz de Usuario del Login
	public LoginFrame() {
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
				//cf.control(); <--- imagen diseno.jpg
				ControlFrameA cf = new ControlFrameA();
				cf.setVisible(true);
				//accederPerfil();
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
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroFrame regFrm = new RegistroFrame();//Me abre la ventana RegistroFrame
				regFrm.setVisible(true);
			}
		});
		btnRegistrarse.setBounds(298, 250, 102, 23);
		getContentPane().add(btnRegistrarse);
		
		JLabel lblnoSeEncuentra = new JLabel("\u00BFNo se encuentra registrado?");
		lblnoSeEncuentra.setBounds(271, 225, 169, 14);
		getContentPane().add(lblnoSeEncuentra);
	}
	
	public void accederPerfil(){
		//Esto falta completarlo pero se hará una vez ya hayamos completado las interfaces.
		String usuario = tfUsuario.getText();
		String pass = new String(pfContrasena.getPassword());
		
		if ("".equals(usuario) || "".equals(pass)){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos solicitados");
        }
		/*
		ControlFrame ctrlFrm = new ControlFrame();
		ctrlFrm.setVisible(true);
		LoginFrame.this.dispose();
		*/
	}

}
