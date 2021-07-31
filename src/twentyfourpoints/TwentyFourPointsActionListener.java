
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Process actions event triggered by a button 
 * @author Qi Wang
 *
 */
public class TwentyFourPointsActionListener implements ActionListener{
	/**
	 * A reference to a panel
	 */
	private JPanel panel;
	
	/**
	 * Constructs an action listener with a panel.
	 * @param panel A reference to a panel
	 */
	JButton refresh;
	JButton verify;
	JTextField expr;
	public TwentyFourPointsActionListener(JPanel panel){
		this.panel = panel;
	}
	public String getText() {
		return refresh.getText();
	}
	public String getTextVerify() {
		return verify.getText();
	}
	
	/**
     * Invoked when an action occurs.
     * @param e A reference to an action event object
     */
    public void actionPerformed(ActionEvent e) {
    	if(getText().equalsIgnoreCase("Refresh")) {
    		String text  = expr.getText();
    		if(expr.equals(Character.isDigit(text.charAt(0)))) {
    			// if character is number
    			getRefresh();
    		}
    	}
    	else {
    		getVerify();
    	}
    }   		
    public JButton getRefresh() {
		refresh.setText("result");;  
    	return this.refresh;
		  
	  }
	  public JButton getVerify() {
		  return this.verify;
	  }

}
