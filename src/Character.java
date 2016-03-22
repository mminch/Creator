
import java.util.*;

public class Character {

	private Stats my_Stats;
	private String my_Class;
	private String my_Race;
	public String my_Name;
	private Proficiency my_Prof;
	private int my_XP;
	public int my_HP;
	public int my_HD;
	public String my_Align;
	private int my_lvl;

	
	public Character(){
		my_XP = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		my_Stats = new Stats();
		System.out.println("What is your Name?");
		my_Name = input.nextLine();
		System.out.println("What is your Alignment?");
		my_Align = input.nextLine();
		assign();
		racialBonus();
		my_Prof = new Proficiency();
		setHD();
		setHP();
	}
	

	public Character(int x){
		this();
		my_XP = x;
		setHD();
		setHP();
	}
	
	private void setHD() {
		// TODO Auto-generated method stub
		if(my_Class.equalsIgnoreCase("Bard") || my_Class.equalsIgnoreCase("Cleric") ||
				my_Class.equalsIgnoreCase("Druid") || my_Class.equalsIgnoreCase("Monk") ||
				my_Class.equalsIgnoreCase("Rogue") || my_Class.equalsIgnoreCase("Warlock")){
			my_HD = 8;
		} else if(my_Class.equalsIgnoreCase("Fighter")||my_Class.equalsIgnoreCase("Paladin")||
				my_Class.equalsIgnoreCase("Ranger")){
			my_HD = 10;
		} else if(my_Class.equalsIgnoreCase("Wizard")||my_Class.equalsIgnoreCase("Sorcerer")){
			my_HD = 6;
		} else if(my_Class.equalsIgnoreCase("Barbarian")){
			my_HD = 12;
		}
	}

	private void setHP() {
		// TODO Auto-generated method stub
		int conmod = my_Stats.getCon();
		conmod -= 10;
		conmod /= 2;
		my_HP = my_HD + conmod;
		for (int i = 0; i <= my_lvl; i++){
			Random rand = new Random();
			int hp = rand.nextInt(my_HD-1);
			my_HP += hp + 1 + conmod;
		}
	}

	

	

	public void addXP(int x){
		my_XP += x;
	}
	
 	private void assign(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("What class are you?");
		my_Class = input.nextLine();
		System.out.println("What Race are you?");
		my_Race = input.nextLine();
		int[] die = my_Stats.getDie();
		for(int i = 0; i <= 4; i++){
			while (die[4-i] > 0){
			System.out.println("You currently have " + die[4-i] +" " + (4+2-i) + 
					"'s. Where would you like to allocate them? (num of dice enter 3 letter stat)");
			int numDie = input.nextInt();
			if(numDie > die[4-i]){
				System.out.println("You entered too high a number, try again");
			} else{
				String stat = input.next();
				die[4-i] -= numDie;
				if(stat.equalsIgnoreCase("Str")){
					my_Stats.addStr(numDie*(4+2-i));
				} else if(stat.equalsIgnoreCase("Dex")){
					my_Stats.addDex(numDie*(4+2-i));
				} else if(stat.equalsIgnoreCase("Con")){
					my_Stats.addCon(numDie*(4+2-i));
				} else if(stat.equalsIgnoreCase("Int")){
					my_Stats.addInt(numDie*(4+2-i));
				} else if(stat.equalsIgnoreCase("Wis")){
					my_Stats.addWis(numDie*(4+2-i));
				} else if(stat.equalsIgnoreCase("Cha")){
					my_Stats.addCha(numDie*(4+2-i));
				} else{
					System.out.println("You entered an invalid Attribute, try again");
					die[4-i] += numDie;
				}
			}
			}
		}
			
		
	}

	private void racialBonus(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if(my_Race.contains("Elf") && !my_Race.equalsIgnoreCase("Half Elf") ||
				my_Race.equalsIgnoreCase("Drow")){ //elves
			my_Stats.addDex(2);
			if(my_Race.equalsIgnoreCase("High Elf")){
				my_Stats.addInt(1);
			} else if(my_Race.equalsIgnoreCase("Wood Elf")){
				my_Stats.addWis(1);
			} else if(my_Race.equalsIgnoreCase("Drow")){
				my_Stats.addCha(1);
			}
		} else if(my_Race.contains("Gnome")){ //gnomes
			my_Stats.addInt(2);
			if(my_Race.equalsIgnoreCase("Rock Gnome")){
				my_Stats.addCon(1);
			} else if(my_Race.equalsIgnoreCase("Forest Gnome")){
				my_Stats.addDex(1);
			}
		} else if(my_Race.contains("Halfling")){//halflings
			my_Stats.addDex(2);
			if(my_Race.equalsIgnoreCase("Stout Halfling")){
				my_Stats.addCon(1);
			} else if(my_Race.equalsIgnoreCase("Lightfoot Halfling")){
				my_Stats.addCha(1);
			}
		} else if(my_Race.contains("Dwarf")){//Dwarfs
			my_Stats.addCon(2);
			if(my_Race.equalsIgnoreCase("Mountain Dwarf")){
				my_Stats.addStr(2);
			} else if(my_Race.equalsIgnoreCase("Hill Dwarf")){
				my_Stats.addWis(1);
			}
		} else if(my_Race.equalsIgnoreCase("Dragonborn")){//dragonborn
			my_Stats.addStr(2);
			my_Stats.addCha(1);
		} else if(my_Race.equalsIgnoreCase("Tiefling")){//tiefling
			my_Stats.addInt(1);
			my_Stats.addCha(2);
		} else if(my_Race.equalsIgnoreCase("Half-orc")){
			my_Stats.addStr(2);
			my_Stats.addCon(1);
		} else if(my_Race.equalsIgnoreCase("Half-Elf")){
			my_Stats.addCha(2);
			System.out.println("Which 2 ability scores would you like to increase by 1? (Ability enter Ability)");
			String ability = input.next();
			statIncrease(ability.substring(0, 3));
			ability = input.next();
			statIncrease(ability.substring(0, 3));
		} else if(my_Race.equalsIgnoreCase("Human")){
			System.out.println("Are you a normal human or a Variant human? (n for normal v for variant");
			String type = input.next();
			if(type.equalsIgnoreCase("n")){
				plus1AllStats();
			}else{
				System.out.println("Which 2 ability scores would you like to increase by 1? (Ability enter Ability)");
				String ability = input.next();
				statIncrease(ability.substring(0, 3));
				ability = input.next();
				statIncrease(ability.substring(0, 3));
			}
		}
	}

	private void statIncrease(String stat){
		if(stat.equalsIgnoreCase("Str")){
			my_Stats.addStr(1);
		} else if(stat.equalsIgnoreCase("Dex")){
			my_Stats.addDex(1);
		} else if(stat.equalsIgnoreCase("Con")){
			my_Stats.addCon(1);
		} else if(stat.equalsIgnoreCase("Int")){
			my_Stats.addInt(1);
		} else if(stat.equalsIgnoreCase("Wis")){
			my_Stats.addWis(1);
		} else if(stat.equalsIgnoreCase("Cha")){
			my_Stats.addCha(1);
		}
	}
	
	private void plus1AllStats(){
		my_Stats.addCha(1);
		my_Stats.addCon(1);
		my_Stats.addDex(1);
		my_Stats.addInt(1);
		my_Stats.addStr(1);
		my_Stats.addWis(1);
	}
	
	public String toString(){
		String returner = "Name = " + my_Name + "\t Race = " + my_Race + "\t Class = " +
	my_Class + "\tLevel " + my_lvl + "\tExperience = " + my_XP + "\r\nAttributes: \r\n" + my_Stats.toString() + "\r\nProficiencies:\r\n" + my_Prof.toString();
	
		
		return returner;
	}
	
	public Stats getStat(){
		return my_Stats;
	}
	
	public String getmyClass(){
		return my_Class;
	}
	
	public String getRace(){
		return my_Race;
	}
	
	public String getName(){
		return my_Name;
	}
	
	public Proficiency getPro(){
		return my_Prof;
	}
	
	public int getXP(){
		return my_XP;
	}
	
	public int getlvl(){
		return my_lvl;
	}


}
