import javax.swing.JFrame;

/**
 * Displays 24-point game. 
 * @author Qi Wang
 * @version 1.0
 */
public class TwentyFourPointsFrame extends JFrame{
	/**
	 * Constructs an interface of 24-point game. 
	 */
	public TwentyFourPointsFrame(){
		TwentyFourPointsPanel p = new TwentyFourPointsPanel();
		p.getPanel();
                this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
	}
}
