/* Bepen Neupane
 * NetID: bneupane
 * Project 2
 * TR 11:05 - 12:20
 * TA Patrick Ferner
 * I did not collaborate with anyone on this assignment.
 */

public class Hole {

	public Hole() { // constructor
	}

	public double yard(int i) { // i is the hole number, depending on what the hole number is, the total yards change
		if (i == 1) {
			return 530;

		} else if (i == 2) {
			return 305;

		} else if (i == 3) {
			return 331;

		} else if (i == 4) {
			return 201;

		} else if (i == 5) {
			return 500;

		} else if (i == 6) {
			return 226;

		} else if (i == 7) {
			return 409;

		} else if (i == 8) {
			return 410;

		} else if (i == 9) {
			return 229;

		} else if (i == 10) {
			return 433;

		} else if (i == 11) {
			return 363;

		} else if (i == 12) {
			return 174;

		} else if (i == 13) {
			return 545;

		} else if (i == 14) {
			return 419;

		} else if (i == 15) {
			return 512;

		} else if (i == 16) {
			return 410;

		} else if (i == 17) {
			return 320;

		} else {
			return 170;
		}

	}

	public int par(int i) { // i is the hole number, depending on what the hole number is, the par changes
		if (i == 1) {
			return 5;

		} else if (i == 2) {
			return 4;

		} else if (i == 3) {
			return 4;

		} else if (i == 4) {
			return 3;

		} else if (i == 5) {
			return 5;

		} else if (i == 6) {
			return 3;

		} else if (i == 7) {
			return 4;

		} else if (i == 8) {
			return 4;

		} else if (i == 9) {
			return 3;

		} else if (i == 10) {
			return 4;

		} else if (i == 11) {
			return 4;

		} else if (i == 12) {
			return 3;

		} else if (i == 13) {
			return 5;

		} else if (i == 14) {
			return 4;

		} else if (i == 15) {
			return 5;

		} else if (i == 16) {
			return 4;

		} else if (i == 17) {
			return 4;

		} else {
			return 3;
		}

	}

	// COURSE 2-------------
	public String name(int i) { // this is for course 2, when the hole number changes, the name changes
		if (i == 1) {
			return "Burn";

		} else if (i == 2) {
			return "Dyke";

		} else if (i == 3) {
			return "Cartgate (Out)";

		} else if (i == 4) {
			return "Ginger Beer";

		} else if (i == 5) {
			return "Hole O'Cross (Out)";

		} else if (i == 6) {
			return "Heathery (Out)";

		} else if (i == 7) {
			return "High (Out)";

		} else if (i == 8) {
			return "Short";

		} else if (i == 9) {
			return "End";

		} else if (i == 10) {
			return "Bobby Jones";

		} else if (i == 11) {
			return "High(In)";

		} else if (i == 12) {
			return "Heathery (In)";

		} else if (i == 13) {
			return "Hole O'Cross (In)";

		} else if (i == 14) {
			return "Long";

		} else if (i == 15) {
			return "Cartgate (In)";

		} else if (i == 16) {
			return "Corner of the Dyke";

		} else if (i == 17) {
			return "Road";

		} else {
			return "Tom Morris";
		}
	}

	public double yard2(int i) {    // i is the hole number, depending on what the hole number is, the yards change for course 2
		if (i == 1) {
			return 376;

		} else if (i == 2) {
			return 453;

		} else if (i == 3) {
			return 397;

		} else if (i == 4) {
			return 480;

		} else if (i == 5) {
			return 568;

		} else if (i == 6) {
			return 412;

		} else if (i == 7) {
			return 371;

		} else if (i == 8) {
			return 175;

		} else if (i == 9) {
			return 352;

		} else if (i == 10) {
			return 386;

		} else if (i == 11) {
			return 174;

		} else if (i == 12) {
			return 348;

		} else if (i == 13) {
			return 465;

		} else if (i == 14) {
			return 618;

		} else if (i == 15) {
			return 455;

		} else if (i == 16) {
			return 423;

		} else if (i == 17) {
			return 495;

		} else {
			return 357;
		}

	}

	public int par2(int i) {// i is the hole number, depending on what the hole
							// number is, the par changes for course 2
		if (i == 1) {
			return 4;

		} else if (i == 2) {
			return 4;

		} else if (i == 3) {
			return 4;

		} else if (i == 4) {
			return 4;

		} else if (i == 5) {
			return 5;

		} else if (i == 6) {
			return 4;

		} else if (i == 7) {
			return 4;

		} else if (i == 8) {
			return 3;

		} else if (i == 9) {
			return 4;

		} else if (i == 10) {
			return 4;

		} else if (i == 11) {
			return 3;

		} else if (i == 12) {
			return 4;

		} else if (i == 13) {
			return 4;

		} else if (i == 14) {
			return 5;

		} else if (i == 15) {
			return 4;

		} else if (i == 16) {
			return 4;

		} else if (i == 17) {
			return 4;

		} else {
			return 4;
		}
	}
}