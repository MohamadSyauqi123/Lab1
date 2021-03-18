package humanWeight.demo;

import java.util.Scanner;

public class calculateWeight {
	
	private double weight;
	private double weightOnMars;
	
	
	public double setWeight()
	{
		return weight;
	}
	public void getWeight(double weight)
	{
		this.weight = weight;
	}
	public double setWeightOnMars()
	{
		return weightOnMars;
	}
	public void getWeightOnMars(double weightOnMars)
	{
		this.weightOnMars = (weight/9.81)*3.711; 
	}
	
	
	/*public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight on earth: "); 
		Double weight = input.nextDouble();
	
		System.out.print("Your weight on Mars is " + getMarsWeight(weight));
	
	}*/
	
	

}
