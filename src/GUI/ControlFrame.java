package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import panelsSoloemergencia.*;

public class ControlFrame{

	public void control(){
		JFrame ctrlFrame = new JFrame();
		
		ctrlFrame.setTitle("SmartHouse v1.0 Panel De Control");
		ctrlFrame.setSize(new Dimension(800,700));
		ctrlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ctrlFrame.setResizable(false);
		ctrlFrame.setLayout(new BorderLayout());
		
		//Panel en donde se puede visualizar la maqueta
		//ImageIcon icon = new ImageIcon(ctrlFrame.getClass().getResource(""));
		//PanelMaqueta maqueta = new PanelMaqueta(icon.getImage());
		//ctrlFrame.add(maqueta, BorderLayout.NORTH);
		//Fin Panel maqueta
		
		//Panel boton en donde se encuentran los botones con las funciones
		PanelBotones pb = new PanelBotones();
		ctrlFrame.add(pb, BorderLayout.CENTER);
		//Fin PanelBotones
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		ctrlFrame.setLocation(dim.width/2-ctrlFrame.getSize().width/2, dim.height/2-ctrlFrame.getSize().height/2);
		ctrlFrame.setVisible(true);	
	}
}
