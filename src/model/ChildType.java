package model;
//task 1 - state for Child human


public class ChildType implements AgeRole  {
	
	
	public String toString (){
		return "Human Child";
	}

	@Override
	public boolean isAbleToDoHeavyWork() {
		return false;
	}
}
