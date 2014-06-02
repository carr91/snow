package model;

import java.util.Random;


public abstract class Human extends Slave {
	
	private Random randomGenerator = new Random();

	public Human(String realName, String slaveName, Integer yearOfBirth) {
		super(realName, slaveName, yearOfBirth);
	}

	@Override
	protected void batheFeet() {
		System.out.println("  " + getSlaveName() + " is bathing and powdering the Tyrant's feet");
	}

	@Override
	protected void burnIncence() {
		System.out.println("  " + getSlaveName() + " is burning Agarbatti");
	}

	@Override
	protected void singPraises() {
		System.out.println("  " + getSlaveName() + " chants: praises to the almighty tyrant!");

	}

	private Boolean isHungry(){
		return randomGenerator.nextBoolean();
	}
	
	private Boolean dessert(){
		return randomGenerator.nextBoolean();
	}
	
	@Override
	public void eat(){
		String returnString = "";
		if (isHungry() || isTimeToEat()){
			returnString = getSlaveName() + " is eating.";
			if (dessert()){
				returnString += " Also time for dessert!";
			}
		} else returnString = getSlaveName() + " is not hungry or it is not time to eat.";

		System.out.println(returnString);
	}
	
	@Override
	public void respondToMovement() {
		System.out.println("  " + getSlaveName() + ": Behold! The Majesty of Majesties is coming!");
	}
	
	public abstract Boolean isAbleToDoHeavyWork();

}
