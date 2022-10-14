package org.rgit.lesson1;

 class Sample {
	
	// method overloading:  same method with different parameters.
	
	public void add(int a, int b) {
System.out.println("addition parent "+ (a+b));
	}
 }
 
 class child extends Sample{
	
	public void add(int a, int b) {
		super.add(100, 13);
		System.out.println("addition childn "+ (a+b));	
	}
	
	
}

public class poly extends Sample{
	public static void main(String[] args) {
		child obj1=new child();
		obj1.add(1, 2);
	
		
	}

}
