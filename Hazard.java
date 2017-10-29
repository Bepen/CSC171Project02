/* Bepen Neupane
 * NetID: bneupane
 * Project 2
 * TR 11:05 - 12:20
 * TA Patrick Ferner
 * I did not collaborate with anyone on this assignment.
 */

public class Hazard { 	//this class holds two methods which are used to dictate where the water hazards are and whether or not the user landed on the hazard
	public Hazard() { //constructor
	}
	public boolean water(int hole, double ballLocation) { //this is the method for course 1, hole is the hole number and ballLocation is the location of the golf ball
		if (hole == 1) {						//if the golf ball is between the two yardages, it is considered in the water
			if ((80 < ballLocation) && (ballLocation < 100)) {	//if the golf ball is between the two yardages, the boolean true is returned and if not, false is returned
				return true;
			} else {
				return false;
			}

		} else if (hole == 2) {
			if ((140 < ballLocation) && (ballLocation < 150)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 3) {
			if ((201 < ballLocation) && (ballLocation < 210)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 4) {
			if ((140 < ballLocation) && (ballLocation < 170)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 5) {
			if ((300 < ballLocation) && (ballLocation < 310)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 6) {
			if ((105 < ballLocation) && (ballLocation < 110)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 7) {
			if ((380 < ballLocation) && (ballLocation < 388)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 8) {
			if ((200 < ballLocation) && (ballLocation < 230)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 9) {
			if ((101 < ballLocation) && (ballLocation < 111)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 10) {
			if ((130 < ballLocation) && (ballLocation < 190)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 11) {
			if ((80 < ballLocation) && (ballLocation < 110)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 12) {
			if ((50 < ballLocation) && (ballLocation < 75)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 13) {
			if ((300 < ballLocation) && (ballLocation < 320)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 14) {
			if ((220 < ballLocation) && (ballLocation < 250)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 15) {
			if ((100 < ballLocation) && (ballLocation < 150)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 16) {
			if ((100 < ballLocation) && (ballLocation < 200)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 17) {
			if ((200 < ballLocation) && (ballLocation < 210)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 18) {
			if ((120 < ballLocation) && (ballLocation < 125)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	public boolean water2(int hole, double ballLocation) { //this is the method for course 2, and it is the same as the method for course 1 except for the fact that
		if (hole == 1) {						//the water is in different places since course 2 is an entirely different course but it still works the same as the first method
			if ((200 < ballLocation) && (ballLocation < 210)) {
				return true;
			} else {
				return false;
			}

		} else if (hole == 2) {
			if ((300 < ballLocation) && (ballLocation < 325)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 3) {
			if ((190 < ballLocation) && (ballLocation < 210)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 4) {
			if ((420 < ballLocation) && (ballLocation < 445)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 5) {
			if ((360 < ballLocation) && (ballLocation < 390)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 6) {
			if ((160 < ballLocation) && (ballLocation < 190)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 7) {
			if ((250 < ballLocation) && (ballLocation < 260)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 8) {
			if ((100 < ballLocation) && (ballLocation < 110)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 9) {
			if ((200 < ballLocation) && (ballLocation < 205)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 10) {
			if ((100 < ballLocation) && (ballLocation < 190)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 11) {
			if ((110 < ballLocation) && (ballLocation < 120)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 12) {
			if ((190 < ballLocation) && (ballLocation < 200)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 13) {
			if ((200 < ballLocation) && (ballLocation < 240)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 14) {
			if ((400 < ballLocation) && (ballLocation < 420)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 15) {
			if ((390 < ballLocation) && (ballLocation < 410)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 16) {
			if ((100 < ballLocation) && (ballLocation < 120)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 17) {
			if ((190 < ballLocation) && (ballLocation < 210)) {
				return true;
			} else {
				return false;
			}
		} else if (hole == 18) {
			if ((130 < ballLocation) && (ballLocation < 160)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}
