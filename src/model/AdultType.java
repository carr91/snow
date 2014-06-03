package model;
//task 1 - state for adult human
public class AdultType implements AgeRole {

	public String toString (){
		return "Human Adult";
	}

	@Override
	public boolean isAbleToDoHeavyWork() {
		return true;
	}

}
