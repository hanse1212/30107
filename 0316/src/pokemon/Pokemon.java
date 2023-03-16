package pokemon;

public class Pokemon {
	String pokeName;
	int legs;
	String skill;
	
	public Pokemon() {}
	public Pokemon(String pokeName, int legs, String skill) {
		this.pokeName = pokeName;
		this.legs = legs;
		this.skill = skill;
	}
	
	public void showInfomation() {
		System.out.println("이름 : " + pokeName);
		System.out.println("다리 : " + legs);
		System.out.println("기술 : " + skill);
	}
	
}
