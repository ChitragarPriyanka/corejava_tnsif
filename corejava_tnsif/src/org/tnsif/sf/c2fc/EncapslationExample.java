package org.tnsif.sf.c2fc;

class Human{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapslationExample {

	
	
	
		public static void main(String[] args) {
			Human obj = new Human();
			obj.setAge(26);
			obj.setName("Priya");
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
			
			obj.setAge(16);
			obj.setName("Varma");
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
			
			
			
		}

	}

