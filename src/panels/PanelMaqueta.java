package panels;

//import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelMaqueta extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public PanelMaqueta(){
		setBorder(new TitledBorder(null, "Visualización de la Maqueta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(new JLabel("Hola Mundo , aqui va la maqueta"));
	}
	
}
