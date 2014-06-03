package model;

import java.util.Random;


public class Human extends Slave{
	AgeRole age;
	private Random randomGenerator = new Random();
	
	public Human(String realName, String slaveName, Integer yearOfBirth) {
		super(realName, slaveName, yearOfBirth);
		boolean heavyWorkAbility = (yearOfBirth-2014<= 14)?true:false;
		if (heavyWorkAbility == true) {
			age = new AdultType();
		}
		else {

			age = new ChildType();
		}
		
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
	//task 1 - new functionality to check if slave is able to do heavy work
	public boolean isAbleToDoHeavyWork() {
		return age.isAbleToDoHeavyWork();
	}
	public String toString () {
		return age.toString();
	}

}
