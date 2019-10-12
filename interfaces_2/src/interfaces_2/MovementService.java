package interfaces_2;

import java.util.ArrayList;

public class MovementService {

	public static void makeItMove(Movable item) {
		item.move();
	}

	public static void makeItMove(ArrayList<Movable> movalbeArray) {
		for (Movable item : movalbeArray) {
			item.move();
		}
	}
}
