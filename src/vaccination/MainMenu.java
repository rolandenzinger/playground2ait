package vaccination;

// String = UserInterface.AskForString(String);
// void UserInterface.SaySomething();

public class MainMenu {
	public static void main(String[] args) {
		// Main UI
		boolean quit = false;
		String InterfaceOutput = "Welcome to VacManager:\n" + "------------------------\n"
				+ "Standortverwaltung    [ort]\n" + "Impf-Zeitfenster      [zeit]\n"
				+ "Terminvergabe         [termin]\n" + "Personalverwaltung    [person]\n"
				+ "Über diese Applikation[about]\n" + "Beenden               [Beenden]";

		do {
			switch (UserInterface.AskForString(InterfaceOutput)) {
			case "ort":
				location();
				break;

			case "zeit":
				timeSlot();
				break;

			case "termin":
				schedule();
				break;

			case "person":
				personal();
				break;

			case "about":
				about();
				break;

			case "beenden":
				quit = true;
				break;
			default:
				UserInterface.SaySomething("Kein Eintrag unter diesem Namen");
				break;
			}
		} while (!quit);
		UserInterface.SaySomething("Programm beendet");
	}

	public static void timeSlot() {
		TimeSlots slot = new TimeSlots();
		// Impfzeitfenster mit TimeSlot
		// public TimeSlots(int id, String TimeStart, String TimeEnd, String date,
		// boolean scheduled)
		// public boolean DeleteUnscheduledSlot(int slotId)
		// public int AddScheduledSlotForPerson(int locationId, int personId, int
		// slotId)
		// public boolean DeleteScheduledSlotForPerson(int scheduleId)
		// public int[] getAllUnscheduledSlotsForStation(int locationId)
		boolean quit = false;
		String InterfaceOutput = "Willkommen bei Impfzeitfenster\n" + "------------------------\n"
				+ "Geben Sie (hinzufügen) ein umx ein Freies Impfenster anzulegen.\n"
				+ "Geben Sie (entfernen) um einen Impfzeitfenster zu löschen.";

		try {
			// String userInput = Integer.parseInt(UserInterface.AskForString());
		} catch (NumberFormatException e) {
			UserInterface.SaySomething("Bitte geben sie hinzufügen oder entfernen ein.");
		}
		switch (InterfaceOutput) {
		case "hinzufügen":
			slot.AddScheduledSlotForPerson(saveInt("Geben sie die location ein"),

					saveInt("Geben sie eine PeronID"),

					saveInt("Geben sie eine SlotID"));
			break;
		case "entfernen":
			slot.DeleteUnscheduledSlot(saveInt("Geben sie die SlotID ein"));

			// boolean bool = saveBoolean("geben Sie war oder falsch für löschen an")) //
			// löscht der Termin weg
			UserInterface.SaySomething("*Ungebuchtes Impf-Zeitfenster gelöscht*");
			break;
		case "zurück":
			quit = true;
		default:
			UserInterface.SaySomething("Falsche Eingabe");
			break;
		}
		while (!quit)
			;

	}

	public static void personal() { // Personenverwaltung mit Person
		Person person = new Person();
		boolean quit = false;
		String InterfaceOutput = "Willkommen bei Personenverwaltung\n" + "------------------------\n"
				+ "Geben Sie (anlegem) um eine neue Person anzulegen.\n"
				+ "Geben Sie (löschen) um eine Person zu löschen.\n"
				+ "Geben Sie (auflisten) ein um Alle Personen zu listen";
		String InterfaceInput = UserInterface.AskForString(InterfaceOutput);
		do {
			switch (InterfaceInput) {
			case "hinzufügen":
				String personID = UserInterface.AskForString("Please enter PersonID");
				String firstName = UserInterface.AskForString("Please enter first Name");
				String lastName = UserInterface.AskForString("Please enter last Name");
				String socialSecurityNumber = UserInterface.AskForString("Please enter Social Security number");
				String street = UserInterface.AskForString("Please enter street");
				String zip = UserInterface.AskForString("Please enter ZIP");
				String city = UserInterface.AskForString("Please enter City");
				String country = UserInterface.AskForString("Please enter Country");
				String birthday = UserInterface.AskForString("Please enter Birthday");
				String telephone = UserInterface.AskForString("Please enter telephone number");
				person.addNewPerson(personID, firstName, lastName, socialSecurityNumber, street, zip, city, country,
						birthday, telephone);
				break;
			case "entfernen":
				person.deletePerson(UserInterface.AskForString("geben Sie die Id der zu löschenden Person an"));
				break;
			case "auflisten":
				person.listAllPersons(); // listet alle Personen auf in der CLI mit system.out.println();
				break;
			case "zurück":
				quit = true;
			default:
				UserInterface.SaySomething("Falsche Eingabe");
			}

		} while (!quit);

	}

	public static void about() { // über
		// prints the Information for the Programm
		String output = "----INFORMATION----\n" + "Programminformation:\n"
				+ "Dies ist ein Programm zur Speicherung und Verwaltung von Impfkampagnen.\n\n"
				+ "Programmierinformation:\nSuper Programm!\n\n" + "Entwickelt von:\n2AIT Software Devellopment";
		UserInterface.SaySomething(output);

	}

	public static void schedule() {// Terminvergabe mit TimeSlot
		boolean quit = false;
		String InterfaceOutput = "Welcome to Terminvergabe:\n" + "------------------------\n"
				+ "Freie Termine für Standort anzeigen    [ort]\n" + "Freie Termine für Datum anzeigen       [datum]\n"
				+ "Freien Termin buchen       			   [buchen]\n"
				+ "Gebuchten Termin löschen               [löschen]\n"
				+ "zurück                                 [zurück]";
		// public TimeSlots(int id, String TimeStart, String TimeEnd, String date,
		// boolean scheduled)
		// public boolean DeleteUnscheduledSlot(int slotId)
		// public int AddScheduledSlotForPerson(int locationId, int personId, int
		// slotId)
		// public boolean DeleteScheduledSlotForPerson(int scheduleId)
		// public int[] getAllUnscheduledSlotsForStation(int locationId)
		TimeSlots timeSlots = new TimeSlots();
		do {
			switch (UserInterface.AskForString(InterfaceOutput)) {
			case "ort":
				timeSlots.GetAllUnscheduledSlotsForStation(saveInt("Geben Sie die Ort-ID an"));
				quit = true;
				break;

			case "zeit":
				timeSlots.GetAllUnscheduledSlotsForDate(UserInterface.AskForString("Geben Sie das Datum an"));
				quit = true;
				break;

			case "buchen":
				timeSlots.AddScheduledSlotForPerson(saveInt("Geben Sie die ID der Location an"),
						saveInt("Geben Sie die ID der Person an"), saveInt("Geben Sie die ID des Slots an"));
				quit = true;
				break;

			case "löschen":
				timeSlots.DeleteScheduledSlotForPerson(saveInt("Geben Sie die ID des zu löschenden Slots an"));
				quit = true;
				break;

			case "zurück":
				quit = true;
				break;
			default:
				UserInterface.SaySomething("Keine vallide eingabe!");
			}

		} while (!quit);

	}

	public static void location() { // Standortverwaltung mit Location
		Location loc = new Location();
		boolean quit = false;
		String InterfaceOutput = "Welcome to Standortverwaltung:\n" + "------------------------\n"
				+ "Standort hinzufügen     [dazu]\n" + "Standort löschen      	[löschen]\n"
				+ "Standorte auflisten		[liste]\n" + "zurück                  [zurück]";

		do {
			switch (UserInterface.AskForString(InterfaceOutput)) {
			case "ort":
				loc.addLocation(UserInterface.AskForString("geben Sie den Namen an"),
						UserInterface.AskForString("geben Sie die Straße an"),
						UserInterface.AskForString("geben Sie den Zip code an"),
						UserInterface.AskForString("geben Sie die Stadt"),
						UserInterface.AskForString("geben Sie die Stadt an"));
				break;

			case "löschen":

				int id = saveInt("geben Sie die ID der Location an");
				loc.deleteLocation(id);
				break;

			case "liste":
				loc.listAllLocation();
				break;

			case "zurück":
				quit = true;
			default:
				UserInterface.SaySomething("Kein Eintrag unter diesem Namen");
				break;
			}

		} while (!quit);

	}

	public static int saveInt(String Output) {
		boolean quit = false;
		do {
			try {
				return Integer.parseInt(UserInterface.AskForString(Output));
			} catch (Exception ex) {
				UserInterface.SaySomething("not a number");
			}

		} while (quit);
		return -1;

	}

	public static boolean saveBoolean(String Output) {
		do {
			String preBool = UserInterface.AskForString(Output);
			if (preBool.equalsIgnoreCase("wahr")) {
				return true;
			} else if (preBool.equalsIgnoreCase("falsch")) {
				return false;
			} else {
				UserInterface.SaySomething("Geben sie wahr oder falsch an");
			}
		} while (true);
	}

}