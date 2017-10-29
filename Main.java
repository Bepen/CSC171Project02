/* Bepen Neupane
 * NetID: bneupane
 * Project 2
 * TR 11:05 - 12:20
 * TA Patrick Ferner
 * I did not collaborate with anyone on this assignment.
 */

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Club c = new Club(); //object for the different club options
		Hole h = new Hole(); //object for the different holes in courses 1 and 2
		Print p = new Print(); //object for printing the different club options
		Putter pu = new Putter(); //object for the different powers for putter
		Terms t = new Terms(); //object for returning the golf terms (Eagle, Bogey, etc.)
		Hazard ha = new Hazard(); //object for testing whether or not the ball fell into the water

		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, welcome to TTY Golf.");
		System.out.println();
		String playAgain = "yes"; //after the game ends, the user will be asked if they want to play again
		int totalStroke = 0; //totalStroke is the total amount of strokes for the whole game
		int totalPar = 0; //totalPar is the total amount necessary to get par for multiple holes
		while (playAgain.equals("yes")) { //as long as the user types that they want to play again, it will keep running
			String keepPlaying = "yes"; //this variable is used to determine whether or not the user wants to leave the hole before the game ends
			p.print(); //prints the club selection
			System.out.print("Would you like to play in Genesee Valley Park North Course (1) or The Old Course at St. Andrews (2)? ");
			int course = scan.nextInt(); //course 1 = Genesee     course 2 = St. Andrews
			if (course == 1) { //Genesee Course
				while (keepPlaying.equals("yes")) { //as long as the user wants to keep playing, this will run
					totalStroke = 0;
					totalPar = 0;
					System.out.println("You have selected the Genessee Valley Park North Course.");
					System.out.println();
					for (int i = 1; i <= 18; i++) { //this for loop will go through 18 holes
						System.out.println("Hole " + i + " -- " + h.yard(i) + " yards -- Par " + h.par(i)); //prints the hole information, h.yard(i) prints the yardage and h.par(i) prints the par amount
						System.out.println();
						totalPar += h.par(i); //in order to see the total par, I keep incrementing totalPar by the par of the hole as the for loop goes on
						int total = 0; //total is the total amount that the ball has travelled, resets every hole
						double distance = 21; //initializing distance, I needed to do it as 
						int stroke = 0; //stroke goes back to 0 every time it's a new hole
						while (distance > 1 / 3) { // if the distance is less than 1/3 , it is considered in because 1/3 of a yard is 1ft, otherwise this loop keeps running
							double hit = 0;
							stroke++; //every time that the ball is not in the hole, stroke and totalStroke will increment
							totalStroke++; //see above
							System.out.println("Stroke " + stroke);
							System.out.println();
							if (distance > 20) { //as long as distance is above 20, normal clubs will be used
								hit = c.clubHit(); //calls clubHit method in the Club class (Line 66)
							} else { //if distance is under 20, a putter will be used
								hit = pu.putterHit(); //calls putterHit method in the Putter class (Line 65)
							}
							System.out.println("You hit the golf ball " + hit + " yards.");
							System.out.println();
							total += hit; //total is incremented by the hit that way total can be compared to the total yards in the hole
							if (total > h.yard(i)) { //if the user overshoots...
								total -= 2 * (total - h.yard(i)); //then the "perspective" is flipped. For example, if the user is 3 yards away and hits 5 yards, then the user will be 2 yards away
							}
							if (ha.water(i, total) == true) { //if the method returns true, that means that the ball has landed in water
								System.out.println("You landed in water.");
								stroke++; //stroke goes up again since landing in water is a penalty
								totalStroke++; //totalStroke increments again as well
								total -= hit; //this is used to take the user back to where they hit from and negates the effect of line 60(total += hit)
							}
							distance = Math.abs(h.yard(i) - total); //returns how far you are away from the hole
							System.out.println("You are " + distance + " yards away from the hole.");
						}
						int term = stroke - h.par(i); //depending on how many strokes it took, there will be a different golf term printed for the score
						System.out.println("You ended the hole with " + stroke + " strokes (" + t.terms(term) + "). You have a total of " + totalStroke + " strokes (" + t.total(totalStroke, totalPar) + ").");
						System.out.println();
						System.out.print("Would you like to keep playing this game (yes or no)? ");
						keepPlaying = scan.next();
						if (keepPlaying.equals("no")) { //if user types no, the break statement ends the while loop at line 35
							break;
						}
					}
				}
			}
			if (course == 2) { //course 2's code is almost identical to course 1 other than the fact that course 2 also requires the official name of the hole
				while (keepPlaying.equals("yes")) { //as long as the user wants to keep playing, this will keep running
					totalStroke = 0;
					totalPar = 0;
					System.out.println("You have selected The Old Course at St. Andrews.");
					System.out.println();
					for (int i = 1; i <= 18; i++) { //this for loop goes through the 18 holes
						System.out.println("Hole " + i + ", " + h.name(i) + " -- " + h.yard2(i) + " yards -- Par " + h.par2(i)); //h.name(i) is responsible for printing the name of the hole
						System.out.println();
						totalPar += h.par2(i); //the reason that I used the par2 method was because the holes in course 2 have different pars from the holes in course 1
						int total = 0;
						double distance = 21;
						int stroke = 0;
						while (distance > 1 / 3) { //while the distance is greater than 1ft, it is not in the hole
							double hit = 0;
							stroke++; //stroke incremented
							totalStroke++; //totalStroke incremented
							System.out.println("Stroke " + stroke);
							System.out.println();
							if (distance > 20) { //if distance is greater than 20, clubs are used
								hit = c.clubHit(); //calls clubHit method in the Club class (Line 66)
							} else { //if distance is 20 or less, a putter is used
								hit = pu.putterHit(); //calls putterHit method in the Putter class (Line 65)
							}
							System.out.println("You hit the golf ball " + hit + " yards.");
							System.out.println();
							total += hit;
							if (total > h.yard2(i)) { //the reason that I used the yard2 method was because the holes in course 1 and 2 are different lengths
								total -= 2 * (total - h.yard2(i));
							}
							if (ha.water2(i, total) == true) { //the reason that I used the water2 method was because the holes in course 1 and 2 are different lengths therefore the hazards should be in different places
								System.out.println("You landed in water.");
								stroke++; //player gains an extra stroke for going into a water hazard
								totalStroke++; //same as above
								total -= hit; //player goes back to where they hit from
							}
							distance = Math.abs(h.yard2(i) - total); //if the user overshoots, this will make the user "turn around" because it is absolute value
							System.out.println("You are " + distance + " yards away from the hole.");
						}
						int term = stroke - h.par2(i); //the variable takes the value of the golf term that the user got for the hole, so par, bogey, eagle, etc.
						System.out.println("You ended the hole with " + stroke + " strokes (" + t.terms(term) + "). You have a total of " + totalStroke + " strokes (" + t.total(totalStroke, totalPar) + ").");
						System.out.println();
						System.out.print("Would you like to keep playing this game (yes or no)? ");
						keepPlaying = scan.next();
						if (keepPlaying.equals("no")) { //if user doesn't want to keep playing, the round ends and then the user is prompted if they want to play the game again
							break;
						}
					}
				}

			}
			System.out.print("Would you like to play again? ");
			playAgain = scan.next(); //after 18 holes, if the user wants to play again, they will be prompted to select a course
			System.out.println();

		}

		scan.close();
	}
}