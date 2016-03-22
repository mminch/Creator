package classes;

public class TotemWarrior extends Barbarian {

	private String ss;
	private String ts;
	private String aotb;
	private String sw;
	private String ta;
	
	public TotemWarrior(){
		super();
		this.setFeatures();
	}
	
	public void setFeatures(){
		super.setFeatures();
		
		ss = "Yours is a path that seeks attunement with the natural world, giving you a kinship with beasts. At 3rd level when "+ 
"you adopt this path, you gain the ability to cast the beast sense and speak with animals spells, but only as rituals, as described in chapter 10.";
		
		ts = "At 3rd level, when you adopt this path, you choose a totem spirit and gain its feature. You must make or acquire a physical totem object- an amulet or similar " + 
"adornment�that incorporates fur or feathers, claws, teeth, or bones of the totem animal. At your option, you also gain minor physical attributes that are reminiscent " + 
"of your totem spirit. For example, if you have a bear totem spirit, you might be unusually hairy and thick-skinned, or if your totem is the eagle, your eyes turn bright yellow." +
"Your totem animal might be an animal related to those listed here but m ore appropriate to your homeland. For example, you could choose a hawk or vulture in place o f an eagle. " +
"Bear. While raging, you have resistance to all damage except psychic damage. The spirit of the bear makes you tough enough to stand up to any punishment. Eagle. While you're raging and aren�t wearing "+
"heavy armor, other creatures have disadvantage on opportunity attack rolls against you, and you can use the Dash action as a bonus action on your turn. The spirit of the eagle makes you into a predator who can weave " + 
"through the fray with ease. Wolf, While you're raging, your friends have advantage on melee attack rolls against any creature within 5 feet of you that is hostile to you. The spirit of " + 
"the wolf makes you a leader of hunters.";
		
		aotb = "At 6th level, you gain a m agical benefit based on the totem animal of your choice. You can choose the same animal you selected at 3rd level or a different one. " +
"Bear. You gain the might of a bear. Your carrying capacity (including maximum load and maximum lift) is doubled, and you have advantage on Strength checks made to push, pull, lift, or break objects. "+
"Eagle. You gain the eyesight of an eagle. You can see up to 1 mile away with no difficulty, able to discern even fine details as though looking at something no more than 100 feet away from you. Additionally, dim light doesn't im pose disadvantage on your Wisdom (Perception) checks. " +
"Wolf, You gain the hunting sensibilities of a wolf. You can track other creatures while traveling at a fast pace, and you can move stealthily while traveling at a normal pace (see chapter 8 for rules on travel pace).";
		
		sw = "At 10th level, you can cast the commune with nature spell, but only as a ritual. When you do so, a spiritual version of one of the animals you chose for Totem Spirit "+ 
"or Aspect of the Beast appears to you to convey the information you seek.";
		
		ta = "At 14th level, you gain a magical benefit based on a totem animal of your choice. You can choose the same animal you selected previously or a different one. Bear, While you�re raging, any creature within 5 feet "+ 
"of you that�s hostile to you has disadvantage on attack rolls against targets other than you or another character with this feature. An enemy is immune to this effect if it can�t see or hear you or if it can�t be frightened. "+
"Eagle. While raging, you have a flying speed equal to your current walking speed. This benefit works only in short bursts; you fall if you end your turn in the air and nothing else is holding you aloft. Wolf. While you�re raging, you can use a bonus action "+
"on your turn to knock a Large or smaller creature prone when you hit it with m elee weapon attack.";
		
		super.addMy_Features(ss, 3);
		super.addMy_Features(ts, 3);
		super.addMy_Features(aotb, 6);
		super.addMy_Features(sw, 10);
		super.addMy_Features(ta, 14);
		
	}
	
	
	
}
