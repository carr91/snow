package model;

import java.util.HashSet;
import java.util.Set;

public class SupremacistTyrant {
	private String realName;
	private String embellishedName;
	private Set <Slave>movementSlaves = new HashSet<Slave>();

	//task 2: lazy instantion used - only creates the turant when it is first created. 
	private static SupremacistTyrant instance = null;
	
	protected SupremacistTyrant(){}; //used to stop instantiation

	//new initialization
	public static SupremacistTyrant getInstance(){
		if(instance == null) {
	         instance = new SupremacistTyrant();//note that new SupremacistTyrant(Jane Smith, Snow White); could be used instead of name
	      }
		return instance;
	}
	//new way to name the tyrant
	public void name(String rName, String eName) {
		realName = rName;
		embellishedName = eName;
	}
	public String getRealName(){
		return realName;
	}
	
	public String getEmbellishedName(){
		return embellishedName;
	}
	
	public void move(){
		System.out.println(getEmbellishedName() + " is moving!");
		notifyMovementSlaves();
	}
	
	public void notifyMovementSlaves(){
		for (Slave slave: movementSlaves){
			slave.respondToMovement();
		}
	}
	
	public void addSlave(Slave slave){
		movementSlaves.add(slave);
	}
	
	public void removeSlave(Slave slave){
		movementSlaves.remove(slave);
	}
	
	public String toString(){
		return this.getClass() + "; realName: " + getRealName() + ", embellished name: " + getEmbellishedName();
	}
}
