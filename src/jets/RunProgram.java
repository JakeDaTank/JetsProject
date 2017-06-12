package jets;

import java.util.Scanner;

public class RunProgram {
	Scanner kb = new Scanner(System.in);
	Aircraft AircraftArry[] = new Aircraft[10];

	public RunProgram() {
		Boe747 jet1 = new Boe747("Boeing 747-8", 614, 6_089, 357_000_000);
		Boe787 jet2 = new Boe787("Boeing 787-1", 593, 9_438.6, 224_000_000);
		Boe787 jet3 = new Boe787("Boeing 787-1", 593, 9_438.6, 224_000_000);
		F22Raptor jet4 = new F22Raptor("F-22 Raptor", 1_498, 1_839, 339_000_000);
		A10Warthog jet5 = new A10Warthog("A-10 Warthog", 439, 800, 18_000_000);

		// Creating an Array of Aircraft to load my prebuilt aircraft into.

		AircraftArry[0] = jet1;
		AircraftArry[1] = jet2;
		AircraftArry[2] = jet3;
		AircraftArry[3] = jet4;
		AircraftArry[4] = jet5;

		System.out.println("\t Option Menu");
		System.out.println("1) List fleet");
		System.out.println("2) List View fastest jet");
		System.out.println("3) View jet with longest range");
		System.out.println("4) Add a jet to Fleet");
		System.out.println("5) quit");
		int x = kb.nextInt();

		while (x != 5) {
			// List Fleet
			if (x == 1) {
				for (int i = 0; i < AircraftArry.length; i++) {
					if (AircraftArry[i] != null)
						System.out.println(AircraftArry[i].toString());
					System.out.println();
				}

			}
			// View the fastest jet
			else if (x == 2) {
				Aircraft temp1 = AircraftArry[0];
				for (int i = 0; i < AircraftArry.length; i++) {
					if (AircraftArry[i] != null) {
						if (temp1.getAirSpeed() < AircraftArry[i].getAirSpeed()) {
							temp1 = AircraftArry[i];
						}
					}

				}
				System.out.println(temp1.toString() + "\nWith an airspeed of Mach " + temp1.getAirSpeed() + "\n");
			// View jet with the longest range.
			} else if (x == 3) {
				Aircraft temp1 = AircraftArry[0];
				for (int i = 0; i < AircraftArry.length; i++) {
					if (AircraftArry[i] != null) {
						if (temp1.getRange() < AircraftArry[i].getRange()) {
							temp1 = AircraftArry[i];
						}
					}

				}
				System.out.println(temp1.toString());
			} else if (x == 4) {
			} else {
				System.out.println("Please enter a valid selection from 1-5");
				x = kb.nextInt();
			}
			System.out.println("\t Option Menu");
			System.out.println("1) List fleet");
			System.out.println("2) List View fastest jet");
			System.out.println("3) View jet with longest range");
			System.out.println("4) Add a jet to Fleet");
			System.out.println("5) quit");
			x = kb.nextInt();
		}
	}
}
