package org.tnsif.acc.c2tc.manager;

class Human{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(26);
        obj.setName("Manu");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setAge(22);
        obj.setName("Harshith");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
	    
	    
	    

	}

}
