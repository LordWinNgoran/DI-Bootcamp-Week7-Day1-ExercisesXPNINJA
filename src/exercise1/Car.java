//Exercise 1 : Implement Hierarchical Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 02/02/2023
*/
package exercise1;

public class Car  extends Motor{

	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String fabiricant, String fuel, int year) {
		super(model, fabiricant, fuel, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		System.out.println(" Car .... running....running.....brummmmmmmmmh");
		
	}

}
