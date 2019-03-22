/*
 * Ahmad, Atif
 * CS A170
 * September 16, 2015
 * 
 * Project: IC06_BasalMetabolicRatePartDeux
 */
import java.util.Scanner;

public class BasalMetabolicRatePartDeux {

	public static void main(String[] args) {
		double weight;
		double height;
		double age;
		double bMRMan;
		double bMRWoman;
		double bMRMultiplier = 0;
		double chocolateBarMan;
		double chocolateBarWoman;
		char gender;
		int response;
		
		Scanner consoleScanner = new Scanner (System.in);
		System.out.println("Are you a female or a male? Please enter with either F or M:");
		gender = consoleScanner.next().toUpperCase().charAt(0);
		if (gender == 'F')
		{
			System.out.println("Select your activity level by entering a number associated with it.");
			System.out.println("1. Sedentary (not active)");
			System.out.println("2. Somewhat active (exercise occasionally)");
			System.out.println("3. Active (exercise 3-4 times per week)");
			System.out.println("4. Highly Active (exercise every day)");
			response = consoleScanner.nextInt();
			switch(response)
			{
			case 1:
				bMRMultiplier = 1.2;//increase the calculated BMR by 20%
				break;
			case 2:
				bMRMultiplier = 1.3;//increase the calculated BMR by 30%
				break;
			case 3:
				bMRMultiplier = 1.4;//increase the calculated BMR by 40%
				break;
			case 4:
				bMRMultiplier = 1.5;//increase the calculated BMR by 50%
				break;
			default:
					System.out.println("Error. Must input a number associated with activity level.");
					consoleScanner.close();
					return;
			}
			
			System.out.println("Please enter weight in lbs: ");
			weight = consoleScanner.nextDouble();
			System.out.println("Please enter height in inches: ");
			height = consoleScanner.nextDouble();
			System.out.println("Please enter age in years: ");
			age = consoleScanner.nextInt();
			bMRWoman = bMRMultiplier * (655 + (4.35*weight) + (4.7*height) - (4.7*age));
			System.out.println("The woman needs " + String.format("%.1f", bMRWoman) + " calories to maintain her weight for this weight, height, age, and activity level.");
			chocolateBarWoman = bMRWoman/230;
			System.out.println("The woman needs to eat " + String.format("%.0f", Math.ceil(chocolateBarWoman)) + " chocolate bars to maintain this amount of calories for this weight, height,"
					+ " age, and activity level.");
			consoleScanner.close();
			
		}
		else // gender is male
		{
			System.out.println("Select your activity level by entering a number associated with it.");
			System.out.println("1. Sedentary (not active)");
			System.out.println("2. Somewhat active (exercise occasionally)");
			System.out.println("3. Active (exercise 3-4 times per week)");
			System.out.println("4. Highly Active (exercise every day)");
			response = consoleScanner.nextInt();
			switch(response)
			{
			case 1:
				bMRMultiplier = 1.2;//increase the calculated BMR by 20%
				break;
			case 2:
				bMRMultiplier = 1.3;//increase the calculated BMR by 30%
				break;
			case 3:
				bMRMultiplier = 1.4;//increase the calculated BMR by 40%
				break;
			case 4:
				bMRMultiplier = 1.5;//increase the calculated BMR by 50%
				break;
			default:
					System.out.println("Error. Must input a number associated with activity level.");
					consoleScanner.close();
					return;
			}
			
			System.out.println("Please enter weight in lbs: ");
			weight = consoleScanner.nextDouble();
			System.out.println("Please enter height in inches: ");
			height = consoleScanner.nextDouble();
			System.out.println("Please enter age in years: ");
			age = consoleScanner.nextInt();
			bMRMan = bMRMultiplier * (66 + (6.23*weight) + (12.7*height) - (6.8*age));
			System.out.println("The man needs " + String.format("%.1f",bMRMan) + " calories to maintain his weight for this weight, height, age, and activity level.");
			chocolateBarMan = bMRMan/230;
			System.out.println("The man needs to eat " + String.format("%.0f", Math.ceil(chocolateBarMan)) + " chocolate bars to maintain this amount of calories for this weight, height,"
					+ " age, and activity level.");
			consoleScanner.close();
		}
		
			
	}

}
