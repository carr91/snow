package model;

public class MachineGunHuntingType extends HuntingType {

	@Override
	public void hunt() {
		System.out.println("  firing: " + weaponName());
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new MachineGun();
	}

}
