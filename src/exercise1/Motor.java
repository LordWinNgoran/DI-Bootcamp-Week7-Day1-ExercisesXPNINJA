//Exercise 1 : Implement Hierarchical Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 06/02/2023
*/
package exercise1;

public abstract class Motor {
	protected String model, fabiricant, fuel;
	protected int year;

	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motor(String model, String fabiricant, String fuel, int year) {
		super();
		this.model = model;
		this.fabiricant = fabiricant;
		this.fuel = fuel;
		this.year = year;
	}

	abstract void run();
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFabiricant() {
		return fabiricant;
	}

	public void setFabiricant(String fabiricant) {
		this.fabiricant = fabiricant;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Motor [model=" + model + ", fabiricant=" + fabiricant + ", fuel=" + fuel + ", year=" + year + "]";
	}
	

}
