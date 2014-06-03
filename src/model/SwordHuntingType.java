package model;

public class SwordHuntingType extends HuntingType {

	@Override
	public void hunt() {
		System.out.println("  brandishing a " + weaponName());

	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

}
