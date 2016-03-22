package classes;

public class Barbarian extends Role {
	
	private String rage;
	private String un;
	private String re;
	private String danger;
	private String extra;
	private String fast;
	private String feral;
	private String brutal;
	private String rel;
	private String per;
	private String in;
	private String primal;
	
	public Barbarian(){
		
	}
	
	public Barbarian(int xp){
		super(xp);
		setMy_HD(12);
		setMy_ST1("Strength");
		setMy_ST2("Constitution");
		addMy_AWPro("Light Armor");
		addMy_AWPro("Medium Armor");
		addMy_AWPro("Shields");
		addMy_AWPro("Simple Weapons");
		addMy_AWPro("Martial Weapons");
		setFeatures();
	}

	public void setFeatures() {
		// TODO Auto-generated method stub
		rage = "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you " + 
"aren’t wearing heavy armor: You have advantage on Strength checks and Strength saving throws. When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that " +
"increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table. You have resistance to bludgeoning, piercing, and slashing damage. If you are able to cast spells, you can’t cast them or " + 
"concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven’t attacked a hostile creature since your last turn " + 
"or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the " +
"Barbarian table, you must finish a long rest before you can rage again.";
		
		un = "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity m odifier + your Constitution " +
		"modifier. You can use a shield and still gain this benefit.";
		
		re = "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide " + 
"to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn.";
		
		danger = "At 2nd level, you gain an uncanny sense of when things nearby aren’t as they should be, giving you an edge when you dodge away from danger. " +
"You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you can’t be blinded, deafened, or incapacitated.";
		
		extra = "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn."; 
	
		fast = "Starting at 5th level, your speed increases by 10 feet while you aren’t w earing heavy armor.";
	
		feral = "By 7th level, your instincts are so honed that you have advantage on initiative rolls. Additionally, if you are surprised at the beginning of combat and aren’t incapacitated, you can act normally " + 
"on your first turn, but only if you enter your rage before doing anything else on that turn.";
		
		brutal = "Beginning at 9th level, you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack. This increases to two additional dice at 13th level " + 
"and three additional dice at 17th level.";
		
		rel = "Starting at 11th level, your rage can keep you fighting despite grievous w ounds. If you drop to 0 hit points while you’re raging and don’t die outright, you can make a DC 10 Constitution saving throw. If you succeed, you " + 
"drop to 1 hit point instead. Each time you use this feature after the first, the DC increases by 5. W hen you finish a short or long rest, the DC resets to 10.";
		
		per = "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
		
		in = "Beginning at 18th level, if your total for a Strength check is less than your Strength score, you can use that score in place of the total.";
		
		primal = "At 20th level, you em body the pow er of the wilds. Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24.";
		
		this.addMy_Features(rage, 1);
		this.addMy_Features(un, 1);
		this.addMy_Features(re, 2);
		this.addMy_Features(danger, 2);
		this.addMy_Features(extra, 5);
		this.addMy_Features(fast, 5);
		this.addMy_Features(feral, 7);
		this.addMy_Features(brutal, 9);
		this.addMy_Features(rel, 11);
		this.addMy_Features(per, 15);
		this.addMy_Features(in, 18);
		this.addMy_Features(primal, 20);
		
		
	}
	
	public int getRage(int lvl){
		int returner = 2;
		
		if(lvl > 2 && lvl < 6){
			returner = 3;
		} else if(lvl < 12){
			returner = 4;
		} else if(lvl < 117){
			returner = 5;
		} else if(lvl < 20){
			returner = 6;
		} else if(lvl == 20){
			returner = 88888888;
		}
		
		
		return returner;
	}

	public int getRagedmg(int lvl){
		int returner = 2;
		if(lvl < 9){
			returner = 3;
		} else if(lvl < 16){
			returner = 4;
		} 
		return returner;
	}
	
	public int getBrutal(int lvl){
		int returner = 0;
		if(lvl >= 9 && lvl < 13){
			returner = 1;
		} else if(lvl < 17){
			returner = 2;
		} else if(lvl >= 17){
			returner = 3;
		} 
		return returner;
	}
	
}
