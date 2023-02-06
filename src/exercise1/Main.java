//Exercise 1 : Implement Hierarchical Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 06/02/2023
*/
package exercise1;

public class Main {

	public static void main(String[] args) {
		System.out.println("####### Car #############");
		Car car = new Car(" Aventador","Lamborghini" , "Gasoline", 2021);
		System.out.println(car.toString());
		car.run();
		
		System.out.println("####### Plane ############# \n");
		Plane plane = new Plane("MP560","BOUYGUES" , "Kerozen", 2022);
		System.out.println(plane.toString());
		plane.run();

	}

}
