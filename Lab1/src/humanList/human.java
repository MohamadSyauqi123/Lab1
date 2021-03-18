package humanList;


import humanWeight.demo.calculateWeight;
import java.util.ArrayList;
import java.util.Scanner;

public class human{
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		calculateWeight human1 = new weight(60);
		calculateWeight human2 = new weight(75);
		calculateWeight human3 = new weight(80);
		
		ArrayList<Double> weightOnMars = new ArrayList<Double>();
		
		weightOnMars.add(human1.getWeightOnMars(human1.getWeight()));
		weightOnMars.add(human2.getWeightOnMars(human2.getWeight()));
		weightOnMars.add(human3.getWeightOnMars(human3.getWeight()));
		
		for (Double i : weightOnMars) {
		      System.out.println(i);
		}
	}
}