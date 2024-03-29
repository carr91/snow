package model;

public abstract class HuntingType implements WeaponInterface{

	private Weapon weapon;
	
	public HuntingType(){
		setWeapon();
	}
	
	protected void setWeapon(){
		this.weapon = this.createWeapon();
	}
	
	public String weaponName(){
		return weapon.toString();
	}
	public abstract void hunt();
}
