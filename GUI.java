import java.awt.*;
import javax.swing.*;

public class GUI extends JPanel{
	
	public GUI() {
		

	}

	public void start() {
		JPanel conference= new JPanel();
		conference.setLayout(new BorderLayout());
		JLabel logolabel = new JLabel(); 
		JLabel titlelabel = new JLabel();
		JPanel logopanel = new JPanel();
		JPanel titlepanel = new JPanel();
		logopanel.add(logolabel);
		titlepanel.add(titlelabel);
		conference.add(titlepanel, BorderLayout.NORTH);
		conference.add(logopanel, BorderLayout.CENTER); 
		final JPanel dropdowns = new JPanel(new GridLayout());
		final JComboBox conferencechooser = new JComboBox();
		final JComboBox userchooser = new JComboBox();
		final JComboBox rolechooser = new JComboBox();
		final ImageIcon submiticon = new ImageIcon("submit.jpg");
		final JLabel submit = new JLabel(submiticon);
		submit.setVisible(false);
	}
	
}
