package GUI;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlFrameA extends JFrame{

	private static final long serialVersionUID = 1L;
	
	//Puertas
	private boolean prtAlcoba1 = false;
	private boolean prtAlcoba2 = false;
	private boolean prtBano = false;
	private boolean prtPrincipal = false;//Creo que deberá empezar true o cerrarse enseguida
	private boolean persiana = false;
	
	//Luces
	private boolean lzAlcoba1 = false;
	private boolean lzAlcoba2 = false;
	private boolean lzbano = false;
	private boolean lzLavanderia = false;
	private boolean lzEntretenimiento = false;
	private boolean lzCocina = false;
	private boolean lzSalaComedor = false;
	
	//Label Estado Puertas
	JLabel lblPuertaPrincipal = new JLabel("- Puerta Principal : ");
	JLabel lblPuertaAlcoba_1 = new JLabel("- Puerta Alcoba 1 : ");
	JLabel lblPuertaAlcoba_2 = new JLabel("- Puerta Alcoba 2 : ");
	JLabel lblPuertaBao = new JLabel("- Puerta Ba\u00F1o : ");
	JLabel lblPersianaSalacomedor = new JLabel("- Persiana Sala-Comedor : ");
	
	//Label Estado Iluminación
	JLabel lblIluminacionAlcoba_1 = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
	JLabel lblIluminacinAlcoba_2 = new JLabel("- Iluminaci\u00F3n Alcoba 2 : ");
	JLabel lblIluminacinLavandea = new JLabel("- Iluminaci\u00F3n Lavande\u00EDa : ");
	JLabel lblIluminacinBao = new JLabel("- Iluminaci\u00F3n Ba\u00F1o : ");
	JLabel lblIluminacinEntretenimiento = new JLabel("- Iluminaci\u00F3n Entretenimiento : ");
	JLabel lblIluminacinCocina = new JLabel("- Iluminaci\u00F3n Cocina: ");
	JLabel lblIluminacinSalacomedor = new JLabel("- Iluminaci\u00F3n Sala-Comedor: ");
	
	private String texto;
	
	public ControlFrameA() {
		//======================
		//Aqui iria el codigo que carga los usuarios
		//======================
		this.getContentPane().setLayout(null);
		this.setTitle("SmartHouse v1.0 Panel de Control");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 715, 660);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(180, 11, 234, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("<html><body>A continuación podrás controlar funciones de la casa como encender luces o abrir puertas<br>para ello, si deseas encender luces de un lugar en especifico deberás dar click en los botones con imagenes<br>de lo contrario si quieres abrir puertas  existen unos botones indicando cuales controlan</body></html>");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(34, 36, 619, 76);
		getContentPane().add(lblNewLabel_2);
		
		//Botones Iluminacion
		JButton btnLuzAlcoba_1 = new JButton("");
		btnLuzAlcoba_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzAlcoba_1.setIcon(new ImageIcon("res/alcoba_1.jpg"));
		btnLuzAlcoba_1.setBounds(67, 123, 122, 128);
		getContentPane().add(btnLuzAlcoba_1);
		//================
		JButton btnLuzAlcoba_2 = new JButton("");
		btnLuzAlcoba_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzAlcoba_2.setIcon(new ImageIcon("res/alcoba_2.jpg"));
		btnLuzAlcoba_2.setBounds(186, 278, 116, 119);
		getContentPane().add(btnLuzAlcoba_2);
		//================
		JButton btnLuzLavanderia = new JButton("");
		btnLuzLavanderia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzLavanderia.setIcon(new ImageIcon("res/lavanderia.jpg"));
		btnLuzLavanderia.setBounds(186, 123, 116, 128);
		getContentPane().add(btnLuzLavanderia);
		//================
		JButton btnLuzBanio = new JButton("");
		btnLuzBanio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzBanio.setIcon(new ImageIcon("res/ba\u00F1o.jpg"));
		btnLuzBanio.setBounds(298, 123, 116, 128);
		getContentPane().add(btnLuzBanio);
		//================
		JButton btnLuzCocina = new JButton("");
		btnLuzCocina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzCocina.setIcon(new ImageIcon("res/cocina.jpg"));
		btnLuzCocina.setBounds(408, 123, 116, 128);
		getContentPane().add(btnLuzCocina);
		//================
		JButton btnLuzSala = new JButton("");
		btnLuzSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzSala.setIcon(new ImageIcon("res/salaComedor.jpg"));
		btnLuzSala.setBounds(408, 250, 116, 119);
		getContentPane().add(btnLuzSala);
		//================
		JButton btnLuzEntrt = new JButton("");
		btnLuzEntrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuzEntrt.setIcon(new ImageIcon("res/entretenimiento.jpg"));
		btnLuzEntrt.setBounds(300, 278, 109, 119);
		getContentPane().add(btnLuzEntrt);
		//Fin Botones Iluminacion
		
		//Botones Puertas y persiana
		JButton btnPersiana = new JButton("Persiana");
		btnPersiana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (persiana == false){
					persiana = true;
					texto = "- Persiana Sala-Comedor : Abierta";
					lblPersianaSalacomedor.setText(texto);
					//llamar metodo persiana(persiana);
				}else{
					persiana = false;
					texto = "- Persiana Sala-Comedor : Cerrada";
					lblPersianaSalacomedor.setText(texto);
					//llamar metodo persiana(persiana);
				}
			}
		});
		btnPersiana.setBounds(408, 368, 116, 29);
		getContentPane().add(btnPersiana);
		//================
		JButton btnPBanio = new JButton("Puerta Ba\u00F1o");
		btnPBanio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (prtBano == false){
					prtBano = true;
					texto = "- Puerta Ba\u00F1o : Abierta";
					lblPuertaBao.setText(texto);
					//llamar metodo puertaBano(prtBano);
				}else{
					prtBano = false;
					texto = "- Puerta Ba\u00F1o : Cerrada";
					lblPuertaBao.setText(texto);
					//llamar metodo puertaBano(prtBano);
				}
			}
		});
		btnPBanio.setBounds(298, 250, 111, 29);
		getContentPane().add(btnPBanio);
		//================
		JButton btnPAlcoba_2 = new JButton("Puerta Alcoba 2");
		btnPAlcoba_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (prtAlcoba2 == false){
					prtAlcoba2 = true;
					texto = "- Puerta Alcoba 2 : Abierta";
					lblPuertaAlcoba_2.setText(texto);
					//llamar metodo puertaAlcoba2(prtAlcoba2);
				}else{
					prtAlcoba2 = false;
					texto = "- Puerta Alcoba 2 : Cerrada";
					lblPuertaAlcoba_2.setText(texto);
					//llamar metodo puertaAlcoba2(prtAlcoba2);
				}
			}
		});
		btnPAlcoba_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPAlcoba_2.setBounds(180, 250, 123, 29);
		getContentPane().add(btnPAlcoba_2);
		//================
		JButton btnPAlcoba_1 = new JButton("Puerta Alcoba 1");
		btnPAlcoba_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (prtAlcoba1 == false){
					prtAlcoba1 = true;
					texto = "- Puerta Alcoba 1 : Abierta";
					lblPuertaAlcoba_1.setText(texto);
					//llamar metodo puertaAlcoba1(prtAlcoba1);
				}else{
					prtAlcoba1 = false;
					texto = "- Puerta Alcoba 1 : Cerrada";
					lblPuertaAlcoba_1.setText(texto);
					//llamar metodo puertaAlcoba1(prtAlcoba1);
				}
			}
		});
		btnPAlcoba_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPAlcoba_1.setBounds(67, 250, 116, 29);
		getContentPane().add(btnPAlcoba_1);
		//================
		JButton btnPPrincipal = new JButton("");
		btnPPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (prtPrincipal == false){
					int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir de la casa?");
					if (opcion == JOptionPane.YES_OPTION){
						JOptionPane.showMessageDialog(null, "Que tenga un buen día");
						prtPrincipal = true;
						texto = "- Puerta Principal : Abierta";
						lblPuertaPrincipal.setText(texto);
						//llamar metodo puertaPrincipal(prtPrincipal);
						ControlFrameA.this.dispose();
					}else if (opcion == JOptionPane.NO_OPTION){
						texto = "- Puerta Principal : Cerrada";
						lblPuertaPrincipal.setText(texto);
					}
				}else{
					prtPrincipal = false;
					texto = "- Puerta Principal : Cerrada";
					lblPuertaPrincipal.setText(texto);
				}
			}
		});
		btnPPrincipal.setIcon(new ImageIcon("res/puerta.jpg"));
		btnPPrincipal.setBounds(521, 250, 57, 83);
		getContentPane().add(btnPPrincipal);
		//Fin Botones Puertas y persiana
		
		//Labels Estados de las Iluminacion (Propiedades)
		JLabel lblEstadoDeLa = new JLabel("Estado de la Iluminaci\u00F3n");
		lblEstadoDeLa.setBounds(99, 408, 139, 14);
		getContentPane().add(lblEstadoDeLa);
		
		lblIluminacionAlcoba_1.setBounds(67, 430, 224, 14);
		getContentPane().add(lblIluminacionAlcoba_1);
		
		lblIluminacinAlcoba_2.setBounds(67, 449, 224, 14);
		getContentPane().add(lblIluminacinAlcoba_2);
		
		lblIluminacinLavandea.setBounds(67, 468, 224, 14);
		getContentPane().add(lblIluminacinLavandea);
		
		lblIluminacinBao.setBounds(67, 488, 224, 14);
		getContentPane().add(lblIluminacinBao);
		
		lblIluminacinEntretenimiento.setBounds(67, 505, 235, 14);
		getContentPane().add(lblIluminacinEntretenimiento);
		
		lblIluminacinCocina.setBounds(67, 523, 194, 14);
		getContentPane().add(lblIluminacinCocina);
		
		lblIluminacinSalacomedor.setBounds(67, 542, 224, 14);
		getContentPane().add(lblIluminacinSalacomedor);
		
		//Labels Estados de las puertas (Propiedades)
		JLabel lblEstadoDeLas = new JLabel("Estado de las Puertas");
		lblEstadoDeLas.setBounds(432, 408, 160, 14);
		getContentPane().add(lblEstadoDeLas);
		
		lblPuertaPrincipal.setBounds(406, 430, 172, 14);
		getContentPane().add(lblPuertaPrincipal);
		
		lblPuertaAlcoba_1.setBounds(406, 449, 172, 14);
		getContentPane().add(lblPuertaAlcoba_1);
		
		lblPuertaAlcoba_2.setBounds(406, 468, 172, 14);
		getContentPane().add(lblPuertaAlcoba_2);
		
		lblPuertaBao.setBounds(406, 488, 172, 14);
		getContentPane().add(lblPuertaBao);
		
		//Label Estado de la persiana (Propiedades)
		JLabel lblEstadoDeLa_1 = new JLabel("Estado de la Persiana\r\n");
		lblEstadoDeLa_1.setBounds(432, 523, 133, 14);
		getContentPane().add(lblEstadoDeLa_1);
		
		lblPersianaSalacomedor.setBounds(408, 542, 234, 14);
		getContentPane().add(lblPersianaSalacomedor);
	}

}
