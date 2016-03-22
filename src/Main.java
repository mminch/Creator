import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {


	private static Character cha;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		cha = new Character(140000);
		//BufferedWriter writer = new BufferedWriter(new FileWriter(cha.my_Name+".txt"));
		//writer.write(cha.toString());
		//writer.close();
		//System.out.println("Your Character Sheet is named " + cha.my_Name+".txt and is located at" +
		//System.getProperty("user.dir"));
		start();
		
	}

	
	public static void start(){
		 JFrame frame = new JFrame("D and D Character Creation");
		 JPanel vpanel = new JPanel();
		 
		 //name
		 JLabel name = new JLabel("Name: " + cha.getName());
		 vpanel.setLayout(new GridBagLayout());
		 GridBagConstraints grid = new GridBagConstraints();
		 grid.fill = GridBagConstraints.PAGE_START;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 0;
		 vpanel.add(name, grid);
		 
		//race
		 JLabel race = new JLabel("Race: " + cha.getRace());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 1;
		 vpanel.add(race, grid);
		 
		//HP
		 JLabel HP = new JLabel("HP: " + cha.my_HP);
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 1;
		 grid.gridy = 1;
		 vpanel.add(HP, grid); 
		 
		//HD
		 JLabel HD = new JLabel("  Hit Dice: " + cha.my_HD);
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 2;
		 grid.gridy = 1;
		 vpanel.add(HD, grid);

		//Class
		 JLabel myclass = new JLabel("  Class: " + cha.getmyClass());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 3;
		 grid.gridy = 1;
		 vpanel.add(myclass, grid);

		//Align
		 JLabel myalign = new JLabel("  Alignment: " + cha.my_Align);
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 4;
		 grid.gridy = 1;
		 vpanel.add(myalign, grid);
				 
		//Attributes
		 JLabel attributes = new JLabel("Attributes: ");
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 2;
		 vpanel.add(attributes, grid);
		 
		//Dex/Str/Con
		 JLabel dsc = new JLabel(cha.getStat().toString());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 3;
		 vpanel.add(dsc, grid);
		 
		 //profs
		 JLabel prof = new JLabel("Proficiency:  ");
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 4;
		 vpanel.add(prof, grid);
		 
		//profs
		 JLabel prof1 = new JLabel("Saving Throws:  " + cha.getPro().SDCtoString());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 5;
		 vpanel.add(prof1, grid);
		 JLabel skills = new JLabel("Skills:");
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 6;
		 vpanel.add(skills, grid);
		 JLabel skills1 = new JLabel(cha.getPro().SkilltoString());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 7;
		 vpanel.add(skills1, grid);
		 JLabel skills2 = new JLabel(cha.getPro().SkilltoStringtwo());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 8;
		 vpanel.add(skills2, grid);
		 JLabel skills3 = new JLabel(cha.getPro().SkilltoStringthree());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 9;
		 vpanel.add(skills3, grid);
		 JLabel skills4 = new JLabel(cha.getPro().SkilltoStringfour());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 10;
		 vpanel.add(skills4, grid);
		 JLabel skills5 = new JLabel(cha.getPro().SkilltoStringlast());
		 grid.fill = GridBagConstraints.HORIZONTAL;
		 grid.weightx = 0;
		 grid.gridx = 0;
		 grid.gridy = 11;
		 vpanel.add(skills5, grid);
		 
		 
		 
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(vpanel);
		 frame.pack();
		 frame.setVisible(true);
	}
}
