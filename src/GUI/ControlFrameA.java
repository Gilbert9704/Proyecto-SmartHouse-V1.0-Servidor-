package GUI;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ControlFrameA extends JFrame {

	private static final long serialVersionUID = 1L;

	public ControlFrameA() {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 660);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(180, 11, 234, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("<html><body>A continuación podrás controlar funciones de la casa como encender luces o abrir puertas<br>para ello, si deseas encender luces de un lugar en especifico deberás dar click en los botones con imagenes<br>de lo contrario si quieres abrir puertas  existen unos botones indicando cuales controlan</body></html>");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(34, 36, 619, 76);
		add(lblNewLabel_2);
		
		JButton btnLuzAlcoba_1 = new JButton("");
		btnLuzAlcoba_1.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\alcoba_1.jpg"));
		btnLuzAlcoba_1.setBounds(67, 123, 122, 128);
		add(btnLuzAlcoba_1);
		
		JButton btnLuzLavanderia = new JButton("");
		btnLuzLavanderia.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\lavanderia.jpg"));
		btnLuzLavanderia.setBounds(186, 123, 116, 128);
		add(btnLuzLavanderia);
		
		JButton btnLuzBanio = new JButton("");
		btnLuzBanio.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\ba\u00F1o.jpg"));
		btnLuzBanio.setBounds(298, 123, 116, 128);
		add(btnLuzBanio);
		
		JButton btnLuzCocina = new JButton("");
		btnLuzCocina.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\cocina.jpg"));

		btnLuzCocina.setBounds(408, 123, 116, 128);
		add(btnLuzCocina);
		
		JButton btnPPrincipal = new JButton("");
		btnPPrincipal.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\puerta.jpg"));
		btnPPrincipal.setBounds(521, 250, 57, 83);
		add(btnPPrincipal);
		
		JButton btnLuzAlcoba_2 = new JButton("");
		btnLuzAlcoba_2.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\alcoba_2.jpg"));
		btnLuzAlcoba_2.setBounds(186, 278, 116, 119);
		add(btnLuzAlcoba_2);
		
		JButton btnPersiana = new JButton("Persiana");
		btnPersiana.setBounds(408, 368, 116, 29);
		add(btnPersiana);
		
		JButton btnPBanio = new JButton("Puerta Ba\u00F1o");
		btnPBanio.setBounds(298, 250, 111, 29);
		add(btnPBanio);
		
		JButton btnLuzSala = new JButton("");
		btnLuzSala.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\salaComedor.jpg"));
		btnLuzSala.setBounds(408, 250, 116, 119);
		add(btnLuzSala);
		
		JButton btnPAlcoba_2 = new JButton("Puerta Alcoba 2");
		btnPAlcoba_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPAlcoba_2.setBounds(180, 250, 123, 29);
		add(btnPAlcoba_2);
		
		JButton btnPAlcoba_1 = new JButton("Puerta Alcoba 1");
		btnPAlcoba_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPAlcoba_1.setBounds(67, 250, 116, 29);
		add(btnPAlcoba_1);
		
		JButton btnLuzEntrt = new JButton("");
		btnLuzEntrt.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Proyecto SmartHouse V1.0\\entretenimiento.jpg"));
		btnLuzEntrt.setBounds(300, 278, 109, 119);
		add(btnLuzEntrt);
		
		JLabel lblEstadoDeLa = new JLabel("Estado de la Iluminaci\u00F3n");
		lblEstadoDeLa.setBounds(99, 408, 139, 14);
		add(lblEstadoDeLa);
		
		JLabel lblIluminacinAlcoba = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		lblIluminacinAlcoba.setBounds(67, 430, 194, 14);
		add(lblIluminacinAlcoba);
		
		JLabel label = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		label.setBounds(67, 449, 194, 14);
		add(label);
		
		JLabel label_1 = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		label_1.setBounds(67, 468, 194, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		label_2.setBounds(67, 488, 194, 14);
		add(label_2);
		
		JLabel label_3 = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		label_3.setBounds(67, 505, 194, 14);
		add(label_3);
		
		JLabel label_4 = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		label_4.setBounds(67, 523, 194, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("- Iluminaci\u00F3n Alcoba 1 : ");
		label_5.setBounds(67, 542, 194, 14);
		add(label_5);
		
		JLabel lblEstadoDeLas = new JLabel("Estado de las Puertas");
		lblEstadoDeLas.setBounds(432, 408, 160, 14);
		add(lblEstadoDeLas);
		
		JLabel lblPuertaPrincipal = new JLabel("- Puerta Principal : ");
		lblPuertaPrincipal.setBounds(406, 430, 172, 14);
		add(lblPuertaPrincipal);
		
		JLabel lblPuertaAlcoba = new JLabel("- Puerta Alcoba 1 : ");
		lblPuertaAlcoba.setBounds(406, 449, 172, 14);
		add(lblPuertaAlcoba);
		
		JLabel lblPuertaAlcoba_1 = new JLabel("- Puerta Alcoba 2 : ");
		lblPuertaAlcoba_1.setBounds(406, 468, 172, 14);
		add(lblPuertaAlcoba_1);
		
		JLabel lblPuertaBao = new JLabel("- Puerta Ba\u00F1o : ");
		lblPuertaBao.setBounds(406, 488, 172, 14);
		add(lblPuertaBao);
		
		JLabel lblEstadoDeLa_1 = new JLabel("Estado de la Persiana\r\n");
		lblEstadoDeLa_1.setBounds(432, 523, 133, 14);
		add(lblEstadoDeLa_1);
		
		JLabel lblPersianaSalacomedor = new JLabel("- Persiana Sala-Comedor : ");
		lblPersianaSalacomedor.setBounds(408, 542, 204, 14);
		add(lblPersianaSalacomedor);
	}

}
