import java.util.ArrayList;
import java.util.Random;

public class Stats {

	private int my_Str;
	private int my_Dex;
	private int my_Con;
	private int my_Int;
	private int my_Wis;
	private int my_Cha;	
	private ArrayList<Integer> my_Stat = new ArrayList<Integer>();
	int[] my_Die;
	
	public Stats(){
		my_Die = rollCha();
	}
	
	public ArrayList<Integer> getStats(){
		my_Stat.add(my_Str);
		my_Stat.add(my_Dex);
		my_Stat.add(my_Con);
		my_Stat.add(my_Int);
		my_Stat.add(my_Wis);
		my_Stat.add(my_Cha);
		return my_Stat;
	}
	
	
	/**
	 * Rolls 18 dice to get Starting attributes.
	 * @return int[] with number of rolls 0-4 (2-6)
	 */
	public int[] rollCha(){
		int[] die = new int[5];
		for(int i = 0; i < 18; i++){
			Random rand = new Random();
			int randInt = rand.nextInt(5);
			die[randInt]++;
		}
		System.out.println("You have");
		System.out.println((die[0]) + " 2's" );
		System.out.println((die[1]) + " 3's" );
		System.out.println((die[2]) + " 4's" );
		System.out.println((die[3]) + " 5's" );
		System.out.println((die[4]) + " 6's" );
		
		return die;
	}

	public int[] getDie(){
		return my_Die;
	}
	
 	public int getStr(){
		return my_Str;
	}
	
	public void addStr(int x){
		my_Str += x;
	}
	
	public int getDex(){
		return my_Dex;
	}
	
	public void addDex(int x){
		my_Dex += x;
	}

	public int getCon(){
		return my_Con;
	}
	
	public void addCon(int x){
		my_Con += x;
	}

	public int getInt(){
		return my_Int;
	}

	public void addInt(int x){
		my_Int += x;
	}
	
	public int getWis(){
		return my_Wis;
	}
	
	public void addWis(int x){
		my_Wis += x;
	}

	public int getCha(){
		return my_Cha;
	}
	
	public void addCha(int x){
		my_Cha += x;
	}
	
	public String toString(){
		String returner = "Strength = " + my_Str + "\t" +
				"Dexterity = " + my_Dex + "\t" + "Constitution = " + my_Con + "\t" +
				"Intelligence = " + my_Int + "\t" + "Wisdom = " + my_Wis + "\r\n" +
				"Charisma = " + my_Cha;
		
		return returner;
	}
	
}
