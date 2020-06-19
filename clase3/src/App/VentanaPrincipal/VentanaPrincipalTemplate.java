package App.VentanaPrincipal;
/***
 * 
 * @author diego
 *
 */
import javax.swing.JFrame;

public class VentanaPrincipalTemplate extends JFrame {

	public VentanaPrincipalTemplate() {

		super("Vista Principal");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(this);
		setLayout(null);
		setVisible(true);

	}

}
