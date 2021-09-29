package test;


import java.util.Random;

public class Weihnachtsbaum {
	static int breite = 43;
	static int leerzeichen = breite / 2;
	static int blaetter = 1;
	static Random wuerfel = new Random();
	static int zufallszahl;
	static double luftstamm = breite / 2.1;
	static double breitestamm = breite / 14;

	public static void zeichneBaum() {
		while (blaetter <= breite) {
			zeichneLeerzeichen();
			zeichneBlaetter();
			leerzeichen--;
			blaetter = blaetter + 2;
		}
		zeichneStamm();

	}

	public static void zeichneLeerzeichen() {
		for (int i = 0; i < leerzeichen; i++) {
			System.out.print(" ");
		}

	}

	public static void zeichneBlaetter() {
		for (int i = 0; i < blaetter; i++) {
			zufallszahl = wuerfel.nextInt(9);
			if (zufallszahl == 0) {
				System.out.print("O");
			} else {
				if (zufallszahl == 2) {
					System.out.print("x");
				} else {
					System.out.print("1");
				}
			}
		}

		System.out.println();

	}

	public static void zeichneStamm() {
		for (int a = 0; a < breite / 8; a++) {
			for (int i = 0; i < luftstamm; i++) {
				System.out.print(" ");
			}
			for (int b = 0; b < breitestamm; b++) {
				System.out.print("H");
			}
			System.out.println();
		}
			

	}

	public static void main(String[] args) {
		zeichneBaum();

	}

}
