package org.cvtc.shapes;
import javax.swing.JOptionPane;
public class MessageBox implements Dialog {
	
	/**
	 * This shows a message box.
	 */
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, 0);
		return JOptionPane.OK_OPTION;
	}	
}