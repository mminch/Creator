import java.util.ArrayList;
import java.util.Scanner;

public class Proficiency {
	private ArrayList<String> my_Prof;
	private Scanner input = new Scanner(System.in);
	
	public Proficiency(){
		my_Prof = new ArrayList<String>();
		setProficiency();
	}
	
	private void setProficiency(){
		System.out.println("Are you proficient in Strength saving Throws?(True or False)");
		helper(0,input.nextLine());
		System.out.println("Are you proficient in Dexterity saving Throws?(True or False)");
		helper(1,input.nextLine());
		System.out.println("Are you proficient in Constitution saving Throws?(True or False)");
		helper(2,input.nextLine());
		System.out.println("Are you proficient in Intelligence saving Throws?(True or False)");
		helper(3,input.nextLine());
		System.out.println("Are you proficient in Wisdom saving Throws?(True or False)");
		helper(4,input.nextLine());
		System.out.println("Are you proficient in Charisma saving Throws?(True or False)");
		helper(5,input.nextLine());
		System.out.println("Are you proficient in Acrobatics(Dex)?(True or False)");
		helper(6,input.nextLine());
		System.out.println("Are you proficient in Animal Handling(Wis)?(True or False)");
		helper(7,input.nextLine());
		System.out.println("Are you proficient in Arcana(Int)?(True or False)");
		helper(8,input.nextLine());
		System.out.println("Are you proficient in Athletics(Str)?(True or False)");
		helper(9,input.nextLine());
		System.out.println("Are you proficient in Deception(Cha)?(True or False)");
		helper(10,input.nextLine());
		System.out.println("Are you proficient in History(Int)?(True or False)");
		helper(11,input.nextLine());
		System.out.println("Are you proficient in Insight(Wis)?(True or False)");
		helper(12,input.nextLine());
		System.out.println("Are you proficient in Intimidation(Cha)?(True or False)");
		helper(13,input.nextLine());
		System.out.println("Are you proficient in Investigation(Int)?(True or False)");
		helper(14,input.nextLine());
		System.out.println("Are you proficient in Medicine(Wis)?(True or False)");
		helper(15,input.nextLine());
		System.out.println("Are you proficient in Nature(Int)?(True or False)");
		helper(16,input.nextLine());
		System.out.println("Are you proficient in Perception(Wis)?(True or False)");
		helper(17,input.nextLine());
		System.out.println("Are you proficient in Performance(Cha)?(True or False)");
		helper(18,input.nextLine());
		System.out.println("Are you proficient in Persuasion(Cha)?(True or False)");
		helper(19,input.nextLine());
		System.out.println("Are you proficient in Religion(Int)?(True or False)");
		helper(20,input.nextLine());
		System.out.println("Are you proficient in Sleight of Hand(Dex)?(True or False)");
		helper(21,input.nextLine());
		System.out.println("Are you proficient in Stealth(Dex)?(True or False)");
		helper(22,input.nextLine());
		System.out.println("Are you proficient in Survival(Wis)?(True or False)");
		helper(23,input.nextLine());
	}
	
	private void helper(int x, String y){
		my_Prof.add(y);
		
	}
	
	public ArrayList<String> getProf(){
		return my_Prof;
	}
	
	public String SDCtoString(){
		String returner = "Str= " + my_Prof.get(0) + "  Dex= " + my_Prof.get(1) + "  Con= " + my_Prof.get(2) +
				"  Int= " + my_Prof.get(3) + "  Wis= " + my_Prof.get(4) + "  Cha= " + my_Prof.get(5);
		
		return returner;
	}
	
	public String SkilltoString(){
		String returner = "Acrobatics = " +	my_Prof.get(6) + "  Animal Handling = " + my_Prof.get(7) + "  Arcana = " + my_Prof.get(8) +
				"  Athletics = " + my_Prof.get(9);
		return returner;
	}
	
	public String SkilltoStringtwo(){
		String returner = "Deception = " + my_Prof.get(10) + "  History = " + my_Prof.get(11) +	"  Insight = " + my_Prof.get(12) + "  Intimidation = " +
				my_Prof.get(13);
		return returner;
	}
	
	public String SkilltoStringthree(){
		String returner = "Investigation = " + my_Prof.get(14) + "  Medicine = " + my_Prof.get(15) + "  Nature = " + my_Prof.get(16) + "  Perception = " + my_Prof.get(17);
		return returner;
	}
	
	public String SkilltoStringfour(){
		String returner ="Performance = " + my_Prof.get(18) + "  Persuasion = " + my_Prof.get(19) + "  Religion = " + my_Prof.get(20) + 
				"  Sleight of Hand = " + my_Prof.get(21);
		return returner;
	}
	
	public String SkilltoStringlast(){
		String returner = "Stealth = " + my_Prof.get(22) + "  Survival = " + my_Prof.get(23);
		return returner;
	}
	
	public String toString(){
		String returner = "Saving Throws:\r\nStrength = " + my_Prof.get(0) + "\t" +
				"Dexterity = " + my_Prof.get(1) + "\t" + "Constitution = " + my_Prof.get(2) + "\t" +
				"Intelligence = " + my_Prof.get(3) + "\r\n" + "Wisdom = " + my_Prof.get(4) + "\t" +
				"Charisma = " + my_Prof.get(5) + "\r\nSkills:\r\nAcrobatics = " +
				my_Prof.get(6) + "\tAnimal Handling = " + my_Prof.get(7) + "\tArcana = " + my_Prof.get(8) +
				"\tAthletics = " + my_Prof.get(9) + "\r\nDeception = " + my_Prof.get(10) + "\tHistory = " + my_Prof.get(11) +
				"\tInsight = " + my_Prof.get(12) + "\tIntimidation = " + my_Prof.get(13) + "\r\nInvestigation = " + my_Prof.get(14) +
				"\tMedicine = " + my_Prof.get(15) + "\tNature = " + my_Prof.get(16) + "\tPerception = " + my_Prof.get(17) + 
				"\r\nPerformance = " + my_Prof.get(18) + "\tPersuasion = " + my_Prof.get(19) + "\tReligion = " + my_Prof.get(20) + 
				"\tSleight of Hand = " + my_Prof.get(21) + "\r\nStealth = " + my_Prof.get(22) + "\tSurvival = " + my_Prof.get(23);
		
		return returner;
	}
}
