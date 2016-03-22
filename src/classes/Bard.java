package classes;

import java.util.ArrayList;

public class Bard extends Role {

	private ArrayList<Integer> spellSlots;
	private int spellsKnown;
	private int cantrips;
	
	
	public Bard(int xp){
		super(xp);
		setMy_HD(8);
		setMy_ST1("Dexterity");
		setMy_ST2("Charisma");
		addMy_AWPro("Light Armor");
		addMy_AWPro("Hand Crossbows");
		addMy_AWPro("Longswords");
		addMy_AWPro("Shortswords");
		addMy_AWPro("Simple Weapons");
		addMy_AWPro("Rapiers");
		setFeatures();
		setSpells();
	}

	private void setSpells(){
		int lvl = getMy_lvl();
		//cantrips
		if(lvl < 5){
			setCantrips(2);
		}else if(lvl < 10){
			setCantrips(3);
		}else if(lvl >= 10){
			setCantrips(4);
		}
		//spells known
		if(lvl < 10){
			setSpellsKnown(lvl+3);
		}else if(lvl < 12){
			setSpellsKnown(lvl+4);
		}else if(lvl < 14){
			setSpellsKnown(lvl + 3);
		}else if(lvl < 16){
			setSpellsKnown(lvl+4);
		}else if(lvl < 18){
			setSpellsKnown(lvl+3);
		}else if(lvl >= 18){
			setSpellsKnown(22);
		}
		//spell slots
		spellSlots.add(2); //1
		if(lvl<1){
			spellSlots.set(0, 3);
		}
		if(lvl<2){
			spellSlots.set(0, 4);
			spellSlots.add(2);//2
		}
		if(lvl<3){
			spellSlots.set(1, 3);
		}
		if(lvl<4){
			spellSlots.add(2);//3
		}
		if(lvl<5){
			spellSlots.set(2, 3);
			spellSlots.add(2);//4
		}
		if(lvl<6){
			spellSlots.add(1);//5
		}
		if(lvl<7){
			spellSlots.set(4, 2);
		}
		if(lvl<8){
			spellSlots.set(4, 3);
			spellSlots.add(1);//6
		}
		if(lvl<10){
			spellSlots.add(1);//7
		}
		if(lvl<14){
			spellSlots.add(1);//8
		}
		if(lvl<16){
			spellSlots.add(1);//9
		}
		if(lvl<17){
			spellSlots.set(4, 3);
		}
		if(lvl<18){
			spellSlots.set(5, 2);
		}
		if(lvl<19){
			spellSlots.set(6, 2);
		}
		
		
		
		
	}
	
	
	
	private void setFeatures() {
		// TODO Auto-generated method stub
		
	}

	public int getSpellsKnown() {
		return spellsKnown;
	}

	public void setSpellsKnown(int spellsKnown) {
		this.spellsKnown = spellsKnown;
	}

	
	public int getCantrips() {
		return cantrips;
	}

	
	public void setCantrips(int cantrips) {
		this.cantrips = cantrips;
	}
	
	
	
	
	
}
