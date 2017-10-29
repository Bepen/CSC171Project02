/* Bepen Neupane
 * NetID: bneupane
 * Project 2
 * TR 11:05 - 12:20
 * TA Patrick Ferner
 * I did not collaborate with anyone on this assignment.
 */

import java.util.Random; //importing Random so I can get a random gaussian value
import java.util.Scanner;

public class Club {
	public Club() { //constructor
	}
	
	Random rand = new Random();
								   //this class is used to find the mean and standard deviation of 
	public double mean(int club) { //depending on which club the user chooses, different if statements will run. The reason is because different clubs have different means
		if (club == 1) {
			return 230;
		} else if (club == 2) {
			return 215;
		} else if (club == 3) {
			return 180;
		} else if (club == 4) {
			return 170;
		} else if (club == 5) {
			return 155;
		} else if (club == 6) {
			return 145;
		} else if (club == 7) {
			return 135;
		} else if (club == 8) {
			return 125;
		} else if (club == 9) {
			return 110;
		} else {
			return 50;
		}

	}

	public double stddev(int club) { //once again, depending on the club, different if statements will run because not all of the clubs have the same standard deviation
		if (club == 1) {
			return 30;
		} else if (club == 2) {
			return 20;
		} else if (club == 3) {
			return 20;
		} else if (club == 4) {
			return 17;
		} else if (club == 5) {
			return 15;
		} else if (club == 6) {
			return 15;
		} else if (club == 7) {
			return 15;
		} else if (club == 8) {
			return 15;
		} else if (club == 9) {
			return 10;
		} else {
			return 10;
		}
	}
	public double clubHit(){ //this method will return the distance that the ball was hit
	Scanner scan = new Scanner(System.in);
	System.out.print("Choose a club (1-10): ");
	int club = scan.nextInt(); //user chooses a club
	System.out.print("Select power (1-10): ");
	int power = scan.nextInt(); //user chooses a power level
	double mean = mean(club); // the variable mean is assigned to the mean of the club that the user chose
	double stddev = stddev(club); //the variable stddev is assigned to the standard deviation of the club that the user chose
	return nextDistance(mean, stddev, power); //the method nextDistance is called and then the value that it returns is returned to the main method where it is then assigned to the variable "hit"
	}
	
	public int nextDistance(double mean, double stddev, int power) { //this calculates the distance that the ball will travel. it takes three inputs, mean, standard deviation, and power. Mean and standard deviation are taken from the previous methods while power is inputted from the user
		double mean_adj = mean * power / 10.0; //in order to account for the variations in power, mean is divided by 10
		double stddev_adj = stddev * power / 10.0; //in order to account for the variations in power standard deviation is divided by 10
		double val = Math.abs(rand.nextGaussian() * stddev_adj + mean_adj); //this is the actual value of the hit which is being returned
		return (int) val; //the casting forces the value of val to be an int
	}
}
