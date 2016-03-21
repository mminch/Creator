import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Character cha = new Character();
		//System.out.println(cha.toString());
		//BufferedWriter writer = new BufferedWriter(new FileWriter(cha.my_Name+".txt"));
		//writer.write(cha.toString());
		//writer.close();
		//System.out.println("Your Character Sheet is named " + cha.my_Name+".txt and is located at" +
		//System.getProperty("user.dir"));
		 JFrame frame = new JFrame();
		 GridBagConstraints c = new GridBagConstraints();
		 c.fill = GridBagConstraints.HORIZONTAL;
		    frame.setLayout(new GridBagLayout());
		    JPanel panel = new JPanel();
		    JLabel name = new JLabel("Matt");
		    c.weightx =.5;
		    c.gridx = 3;
		    c.gridy = 0;
		    panel.add(name);
		    JLabel myclass = new JLabel("Monk");
		    c.gridx = 1;
		    c.gridy = 0;
		    panel.add(myclass);
		    JLabel race = new JLabel("Wood Elf");
		    c.gridx = 2;
		    c.gridy = 0;
		    panel.add(race);
		    panel.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
		    frame.add(panel, new GridBagConstraints());
		    frame.setSize(400, 400);
		    frame.setLocationRelativeTo(null);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
	}

}
