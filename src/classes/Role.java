package classes;
import java.util.ArrayList;

public class Role {


	private int my_HD;
	private String my_ST1;
	private String my_ST2;
	private ArrayList<String> my_AWPro;
	private ArrayList<String> my_Features;
	private ArrayList<Integer> my_Featlvl;
	private int my_XP;
	private ArrayList<Integer> my_lvlChart = new ArrayList<Integer>();
	private int my_lvl;
	
	public Role(){
		setlvlchart();
		setlvl();
	}
	
	public Role(int xp){
		
	}
	
	private void setlvlchart() {
		// TODO Auto-generated method stub
		my_lvlChart.add(0);
		my_lvlChart.add(300);
		my_lvlChart.add(900);
		my_lvlChart.add(2700);
		my_lvlChart.add(6500);
		my_lvlChart.add(14000);
		my_lvlChart.add(23000);
		my_lvlChart.add(34000);
		my_lvlChart.add(48000);
		my_lvlChart.add(64000);
		my_lvlChart.add(85000);
		my_lvlChart.add(100000);
		my_lvlChart.add(120000);
		my_lvlChart.add(140000);
		my_lvlChart.add(165000);
		my_lvlChart.add(195000);
		my_lvlChart.add(225000);
		my_lvlChart.add(265000);
		my_lvlChart.add(305000);
		my_lvlChart.add(355000);
	}

	public int getMy_HD() {
		return my_HD;
	}

	public void setMy_HD(int my_HD) {
		this.my_HD = my_HD;
	}

	public String getMy_ST1() {
		return my_ST1;
	}

	public void setMy_ST1(String my_ST1) {
		this.my_ST1 = my_ST1;
	}

	public String getMy_ST2() {
		return my_ST2;
	}

	public void setMy_ST2(String my_ST2) {
		this.my_ST2 = my_ST2;
	}

	private void setlvl() {
		// TODO Auto-generated method stub
		Boolean cancel = false;
		int i = 0;
		while(!cancel){
			if(my_XP < my_lvlChart.get(i)){
				setMy_lvl(i-1);
				cancel = true;
			} else if(my_XP == my_lvlChart.get(i)){
				setMy_lvl(i);
				cancel = true;
			}
			i++;
		}
	}

	public ArrayList<String> getMy_AWPro() {
		return my_AWPro;
	}
	
	public void addMy_AWPro(String my_AWPro) {
		this.my_AWPro.add(my_AWPro);
	}
	
	public ArrayList<String> getMy_Features() {
		return my_Features;
	}
	
	public ArrayList<Integer> getMy_Featlvl(){
		return my_Featlvl;
	}
	
	public void addMy_Features(String my_Features, Integer lvl) {
		this.my_Features.add(my_Features);
		this.my_Featlvl.add(lvl);
	}

	
	public int getMy_lvl() {
		return my_lvl;
	}

	
	public void setMy_lvl(int my_lvl) {
		this.my_lvl = my_lvl;
	}
	
	
	
	
}
