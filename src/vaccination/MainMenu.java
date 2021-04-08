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
				+ "Über diese Applikation[über]\n" + "Beenden               [Beenden]";

		do {
			switch (UserInterface.AskForString(InterfaceOutput)) {
			case "ort":
				location();
				break;

			case "zeit":
				timeSlot();
				break;

			case "termin":
				scedule();
				break;

			case "person":
				personal();
				break;

			case "über":
				about();
				break;

			case "beenden":
				quit = true;
			default:
				UserInterface.SaySomething("Kein Eintrag unter diesem Namen");
				break;
			}
		} while (!quit);
	}

	// nicht fertig
	public static void timeSlot() { 
		//Impfzeitfenster mit TimeSlot
		// public TimeSlots(int id, String TimeStart, String TimeEnd, String date, boolean scheduled)
		// public boolean DeleteUnscheduledSlot(int slotId)
		// public int AddScheduledSlotForPerson(int locationId, int personId, int slotId)
		// public boolean DeleteScheduledSlotForPerson(int scheduleId)
		// public int[] getAllUnscheduledSlotsForStation(int locationId)
		boolean quit = false;
		String InterfaceOutput = 
		"Willkommen bei Impfzeitfenster\n"+
		"------------------------\n"+
		"Geben Sie (hinzufügen) ein umx ein Freies Impfenster anzulegen.\n"+
		"Geben Sie (entfernen) um einen Impfzeitfenster zu löschen.";
		
		try {
    		//String userInput = Integer.parseInt(UserInterface.AskForString());
        } catch (NumberFormatException e) {
            UserInterface.SaySomething("Bitte geben sie hinzufügen oder entfernen ein.");
        }
		switch (InterfaceOutput) {
            case "hinzufügen":
			TimeSlots.AddScheduledSlotForPerson(saveInt("Geben sie die location ein"),

	 saveInt("Geben sie eine PeronID"),

	 saveInt("Geben sie eine SlotID"));
                break;
            case "entfernen":
			TimeSlots.DeleteUnscheduledSlot( saveInt("Geben sie die SlotID ein");

		//boolean bool = saveBoolean("geben Sie war oder falsch für löschen an")) // löscht der Termin weg
			UserInterface.SaySomething("*Ungebuchtes Impf-Zeitfenster gelöscht*");
                break;
				case "zurück":
			quit = true; 
			default:
			UserInterface.SaySomething("Falsche Eingabe");
                break;
		}while(!quit);

	}

	public static void personal() { // Personenverwaltung mit Person
		boolean quit = false;
		String InterfaceOutput = "Willkommen bei Personenverwaltung\n" + "------------------------\n"
				+ "Geben Sie (anlegem) um eine neue Person anzulegen.\n"
				+ "Geben Sie (löschen) um eine Person zu löschen.\n"
				+ "Geben Sie (auflisten) ein um Alle Personen zu listen";

		String InterfaceInput = UserInterface.AskForString(InterfaceOutput);
<<<<<<< Updated upstream
		do {
			switch (InterfaceInput) {
			case "hinzufügen":
				String personID = UserInterface.AskForString("Please enter PersonID");
				String fistName = UserInterface.AskForString("Please enter first Name");
				String lastName = UserInterface.AskForString("Please enter last Name");
				String socialSecurityNumber = UserInterface.AskForString("Please enter Social Security number");
				String street = UserInterface.AskForString("Please enter street");
				String zip = UserInterface.AskForString("Please enter ZIP");
				String city = UserInterface.AskForString("Please enter City");
				String country = UserInterface.AskForString("Please enter Country");
				String birthday = UserInterface.AskForString("Please enter Birthday");
				String elephone = UserInterface.AskForString("Please enter telephone number");
				// Person.addNewPerson(String personID, String firstName, String lastName,
				// String socialSecurityNumber,String street, String zip, String city,
				// String country, String birthday, String
				// telephone);break;case"entfernen":Person.deletePerson(saveInt("geben Sie die
				// Id der zu löschenden Person an"));
				break;
=======
		switch (InterfaceInput) {
            case "hinzufügen":
                String personID = UserInterface.AskForString("Please enter PersonID");
                String fistName = UserInterface.AskForString("Please enter first Name");
                String lastName = UserInterface.AskForString("Please enter last Name");
                String socialSecurityNumber = IsaveInt("Please enter Social Security number");
                String street = UserInterface.AskForString("Please enter street");
                String zip = saveInt("Please enter ZIP");
                String city = UserInterface.AskForString("Please enter City");
                String country = UserInterface.AskForString("Please enter Country");
                String birthday = UserInterface.AskForString("Please enter Birthday");
                String elephone = saveInt("Please enter telephone number");
               Person.addNewPerson(String personID, String firstName, String lastName, String socialSecurityNumber,String street, String zip, String city, 
			 						String country, String birthday, String telephone);break;case"entfernen":Person.deletePerson(saveInt("geben Sie die Id der zu löschenden Person an"));
                break;
>>>>>>> Stashed changes
			case "auflisten":
				Person.listAllPersons(); // listet alle Personen auf in der CLI mit system.out.println();
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
		String output = "----INFORMATION----\n" + "Programm information:\n"
				+ "Dies ist ein Programm zur Speicherung und verwaltung von Impfkampagnen\n" + "Programmierinformation:"
				+ "Entwickelt von: 2AIT Software Devellopment\n";
		UserInterface.SaySomething(output);

	}

	public static void scedule() {// Terminvergabe	mit TimeSlot
	boolean quit = false;
	String InterfaceOutput = 
	"Welcome to Terminvergabe:\n"+
	"------------------------"+
	"Freie Termine für Standort anzeigen    [ort]"+
	"Freie Termine für Datum anzeigen       [datum]"+
	"Freien Termin buchen       			   [buchen]"+
	"Gebuchten Termin löschen               [löschen]"+
	"zurück                                 [zurück]";
	// public TimeSlots(int id, String TimeStart, String TimeEnd, String date, boolean scheduled)
	// public boolean DeleteUnscheduledSlot(int slotId)
	// public int AddScheduledSlotForPerson(int locationId, int personId, int slotId)
	// public boolean DeleteScheduledSlotForPerson(int scheduleId)
	// public int[] getAllUnscheduledSlotsForStation(int locationId)
	
	do {
		switch (UserInterface.AskForString(InterfaceOutput)) {
		case "ort":
		TimeSlots.GetAllUnscheduledSlotsForStation(saveInt("Geben Sie die Ort-ID an"));
			break;

		case "zeit":
		TimeSlots.GetAllUnscheduledSlotsForDate(UserInterface.AskForString("Geben Sie das Datum an")))
			break;
		
		case "buchen":
		TimeSlots.AddScheduledSlotForPerson( saveInt("Geben Sie die ID der Location an"), saveInt("Geben Sie die ID der Person an"), saveInt("Geben Sie die ID des Slots an"));
		break;

		case "löschen":
		TimeSlots.DeleteScheduledSlotForPerson( saveInt("Geben Sie die ID des zu löschenden Slots an"));
	break;

	case "zurück":
	quit=true;
	break;
	default:
	UserInterface.SaySomething("Keine vallide eingabe!");
	}

	}while(!quit);

	}

	public static void location() { //Standortverwaltung mit Location
	boolean quit = false;
	String InterfaceOutput = 
	"Welcome to Standortverwaltung:\n"+
	"------------------------"+
	"Standort hinzufügen     [dazu]"+
	"Standort löschen      	[löschen]"+
	"Standorte auflisten		[liste]"+
	"zurück                  [zurück]";

	do {
		switch (UserInterface.AskForString(InterfaceOutput)){
			case "ort":
			Location.addLocation(UserInterface.AskForString("geben Sie den Namen an"),UserInterface.AskForString("geben Sie die Straße an"),UserInterface.AskForString("geben Sie den Zip code an"),UserInterface.AskForString("geben Sie die Stadt"), UserInterface.AskForString("geben Sie die Stadt an"));
			break;

			case "löschen":

			int id = saveInt("geben Sie die ID der Location an"));
			Location.deleteLocation(id);
			break;

			case"liste":
			Location.listAllLocation();
			break;

			case"zurück":
			quit = true;
			default:
			UserInterface.SaySomething("Kein Eintrag unter diesem Namen");
			break;
		}

}while(!quit);

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
		return null;
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