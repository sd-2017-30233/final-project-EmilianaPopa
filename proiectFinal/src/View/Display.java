package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Display {

	private JFrame frame;
	private JTextArea textArea;
	public JFrame getFrame()
	{
		return this.frame;
	}
	
	public JTextArea getTextArea()
	{
		return this.textArea;
	}

	/**
	 * Create the application.
	 */
	public Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 13, 638, 398);
		frame.getContentPane().add(textArea);
	}
}
