package entities;

public class Champion {
	
private String name;
private int life;
private int attack;
private int armor;

public Champion() {
}

public Champion(String name, int life, int attack, int armor) {
	
	this.name = name;
	this.life = life;
	this.attack = attack;
	this.armor = armor;
}

public String getName() {
	return name;
}


public int getLife() {
	return life;
}

public void setLife(int life) {
	this.life = life;
}

public int getAttack() {
	return attack;
}


public int getArmor() {
	return armor;
}

public static void takeDamage (Champion c1, Champion c2 ) {
	
	if(c1.armor>c2.attack) {
		c1.life -= 1;	
	}
	else {
		c1.life = (c1.life + c1.armor) - c2.attack ;	
	}
	
	if(c1.life < 0) {
		c1.life = 0;
	}
	
	if(c2.armor>c1.attack) {
		c2.life -= 1;	
	}
	else {
		c2.life = (c2.life+ c2.armor)- c1.attack ;
	}
	
	if(c1.life < 0) {
		c1.life = 0;
	}
	
}


public static String status(String name, int life) {

	if (life == 0) {
		return String.format("%s: %d de vida ",name,life)
			+ "(morreu)";
	}
	else {
		return String.format("%s: %d de vida ",name,life);
	}

	

	   
	/* return  String.format("Resultado do turno %d: ",i)
		    + String.format("%s: %d de vida ",c1.name,c1.life)
		    + String.format("%s: %d de vida ",c2.name,c2.life); */
} 
	

}
