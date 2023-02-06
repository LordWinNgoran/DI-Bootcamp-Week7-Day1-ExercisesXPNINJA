//Exercise 1 : Implement Hierarchical Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 06/02/2023
*/
package exercise1;

public class Plane  extends Motor{

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(String model, String fabiricant, String fuel, int year) {
		super(model, fabiricant, fuel, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		System.out.println(" Plane .... flying....flying.....flusssssssssssssssh");
		
	}

}
