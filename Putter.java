/* Bepen Neupane
 * NetID: bneupane
 * Project 2
 * TR 11:05 - 12:20
 * TA Patrick Ferner
 * I did not collaborate with anyone on this assignment.
 */

import java.util.Random; //importing Random so I can get a random gaussian value
import java.util.Scanner;

public class Putter {
	public Putter() { // constructor
	}

	Random rand = new Random();

	public double mean(int power) { //depending on the power level, there will be different means
		if (power == 1) {
			return 1;
		} else if (power == 2) {
			return 2;
		} else if (power == 3) {
			return 4;
		} else if (power == 4) {
			return 8;
		} else if (power == 5) {
			return 12;
		} else if (power == 6) {
			return 16;
		} else if (power == 7) {
			return 20;
		} else if (power == 8) {
			return 25;
		} else if (power == 9) {
			return 30;
		} else {
			return 40;
		}
	}

	public double stddev(int power) { //depending on the power level, there will be different standard deviations
		if (power == 1) {
			return 1;
		} else if (power == 2) {
			return 1;
		} else if (power == 3) {
			return 2;
		} else if (power == 4) {
			return 2;
		} else if (power == 5) {
			return 3;
		} else if (power == 6) {
			return 3;
		} else if (power == 7) {
			return 4;
		} else if (power == 8) {
			return 4;
		} else if (power == 9) {
			return 5;
		} else {
			return 5;
		}
	}
	public double putterHit(){
		Scanner scan = new Scanner(System.in); 
		System.out.print("Select power for putter (1-10): ");
		int power = scan.nextInt(); //power level
		double mean = mean(power); //depending on the power, the mean changes
		double stddev = stddev(power); //depending on the power, the standard deviation changes
		return nextDistance(mean, stddev); //the nextDistance method is called then computed then returned
	}
	
	public double nextDistance(double mean, double stddev) { //this is used to compute the distance of the putt by taking in mean and standard deviation. Since there is only one type of putter, the "power" variable acts as the differentiator for different standard deviations and means for the putter
		double val = Math.abs(rand.nextGaussian() * (stddev / 3) + (mean / 3)); //I divided standard deviation and mean by three because those values are in feet and there are three feet in a yard
		return (int) val; //casts val as an int then returns it
	}
}