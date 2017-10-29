/* Bepen Neupane
 * NetID: bneupane
 * Project 2
 * TR 11:05 - 12:20
 * TA Patrick Ferner
 * I did not collaborate with anyone on this assignment.
 */

public class Terms {
	public Terms() { //constructor
	}

	public String terms(int strokes) { //these terms are all for after the hole ends. Albatross is the best (-3) and Over Triple-Bogey is the worst (3+)
		if (strokes == -3) {			// strokes represents the total strokes that the player took to make it into the hole. Depending on the amount of strokes, one of these golf terms will be printed
			return "Albatross";
		} else if (strokes == -2) {
			return "Eagle";
		} else if (strokes == -1) {
			return "Birdie";
		} else if (strokes == 0) {
			return "Par";
		} else if (strokes == 1) {
			return "Bogey";
		} else if (strokes == 2) {
			return "Double-Bogey";
		} else if (strokes == 3) {
			return "Triple-Bogey";
		} else {
			return "Over Triple-Bogey";
		}
	}

	public String total(int tStroke, int tPar) { //this is the same as as the terms method but instead it is for the player's total score. The way it works is it takes two arguments,
		if ((tStroke - tPar) == -3) {			//tStroke and tPar, tStroke is the total strokes for all holes up to that point and tPar is the total for pars for all holes up to that point.
			return "Albatross";			//then to find out how well the user is doing, I did a-b and if it negative, the player is under par but if it is positive,
		} else if ((tStroke - tPar) == -2) {		//the user is over par
			return "Eagle";
		} else if ((tStroke - tPar) == -1) {
			return "Birdie";
		} else if ((tStroke - tPar) == 0) {
			return "Par";
		} else if ((tStroke - tPar) == 1) {
			return "Bogey";
		} else if ((tStroke - tPar) == 2) {
			return "Double-Bogey";
		} else if ((tStroke - tPar) == 3) {
			return "Triple-Bogey";
		} else {
			return "Over Triple-Bogey";
		}
	}

}
