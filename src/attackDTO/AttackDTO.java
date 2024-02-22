package attackDTO;

public class AttackDTO {
private int damage_A,damage_B,damage_C,boss;
			//A찌르기 B올려치기 C스킬데미지
private int defence;

public int getDefence() {
	return defence;
}

public void setDefence(int defence) {
	this.defence = defence;
}

public int getDamage_A() {
	return damage_A;
}

public void setDamage_A(int damage_A) {
	this.damage_A = damage_A;
}

public int getDmage_B() {
	return damage_B;
}

public void setDmage_B(int damage_B) {
	this.damage_B = damage_B;
}

public int getDamage_C() {
	return damage_C;
}

public void setDamage_C(int damage_C) {
	this.damage_C = damage_C;
}

public int getBoss() {
	if(boss<0) {
		boss=0;
	}
	return boss;
}

public void setBoss(int boss) {
	this.boss = boss;
}



}
