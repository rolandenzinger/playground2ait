package vaccination;
//collab mit UI:

import jdk.nashorn.internal.runtime.regexp.joni.ast.QuantifierNode;

// String = UserInterface.AskForString(String);
// void UserInterface.SaySomething();

public class MainMenu {
	public static void main(String[] args) {
		// Main UI
		boolean quit = false;
		String InterfaceOutput = 
		"Welcome to VacManager:\n
		------------------------
		Standortverwaltung    [ort]
		Impf-Zeitfenster      [zeit]
		Terminvergabe         [termin]
		Personalverwaltung    [person]
		Über diese Applikation[über]
		Beenden               [Beenden]
		";
		boolean quit = false; 
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
			}
		} while (!quit);
	}

public static void timeSlot() { //Impfzeitfenster			mit Petar				Klemens

	// public TimeSlots(int id, String TimeStart, String TimeEnd, String date, boolean scheduled)
	// public boolean DeleteUnscheduledSlot(int slotId)
	// public int AddScheduledSlotForPerson(int locationId, int personId, int slotId)
	// public boolean DeleteScheduledSlotForPerson(int scheduleId)
	// public int[] getAllUnscheduledSlotsForStation(int locationId)
		boolean quit = false;
		String InterfaceOutput = 
		"Willkommen bei Impfzeitfenster\n
		------------------------
		Geben Sie (hinzufügen) ein umx ein Freies Impfenster anzulegen.
		Geben Sie (entfernen) um einen Impfzeitfenster zu löschen.
		";
		try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            UserInterface.SaySomething("Bitte geben Sie ein Wort ein.");
        }
		switch (InterfaceOutput) {
            case "hinzufügen":
			AddScheduledSlotForPerson(int locationId, int personId, int slotId);
                break;
            case "entfernen":
			DeleteUnscheduledSlot(int slotId, boolean slotIsScheduled) --- löscht der Termin weg
			UserInterface.SaySomething("*Ungebuchtes Impf-Zeitfenster gelöscht*");
                break;
            default:
			UserInterface.SaySomething("Falsche Eingabe");
                break;
		} while (!quit);
	}

	public static void personal() { //Personenverwaltung 	mit Fabi			 	Klemens
		boolean quit = false;
		String InterfaceOutput = 
		"Willkommen bei Personenverwaltung\n
		------------------------\n
		Geben Sie (anlegem) um eine neue Person anzulegen.\n
		Geben Sie (löschen) um eine Person zu löschen.\n
		Geben Sie (auflisten) ein um Alle Personen zu listen
		";
		
		switch (InterfaceInput) {
            case "hinzufügen":
                personID = UserInterface.AskForString("Please enter PersonID");
                fistName = UserInterface.AskForString("Please enter first Name");
                lastName = UserInterface.AskForString("Please enter last Name");
                socialSecurityNumber = IsaveInt("Please enter Social Security number");
                street = UserInterface.AskForString("Please enter street");
                zip = saveInt("Please enter ZIP");
                city = UserInterface.AskForString("Please enter City");
                country = UserInterface.AskForString("Please enter Country");
                birthday = UserInterface.AskForString("Please enter Birthday");
                telephone = saveInt("Please enter telephone number");
                Person.addNewPerson(String personID, String firstName, String lastName, String socialSecurityNumber,String street, String zip, String city, 
									String country, String birthday, String telephone);
                break;
            case "entfernen":
			try {
				 int ID = Interger.parseInt(UserInterface.AskForString("Bitte Peronen ID eingebn"));
			} catch (NumberFormatException e) {
				UserInterface.SaySomething("Not a number");
			}
	         Person.deletePerson(ID);
                break;
			case "auflisten"
			person.listAllPersons(); // listet alle Personen auf in der CLI mit system.out.println();
            default:
			UserInterface.SaySomething("Falsche Eingabe");
                break;
		} while (!quit);
	}	
public static void about() { //über
	//prints the Information for the Programm
	String output = 
	"----INFORMATION----\n"+
	"Programm information:\n"+
	"Dies ist ein Programm zur Speicherung und verwaltung von Impfkampagnen\n\n"+
	"Programmierinformation:"+
	"Entwickelt von: 2AIT Software Devellopment\n";
	UserInterface.SaySomething(output);

}

public static void scedule() {// Terminvergabe	mit 	Petar			Tobi
	boolean quit = false;
	String InterfaceOutput = 
	"Welcome to Terminvergabe:\n
	------------------------
	Freie Termine für Standort anzeigen    [ort]
	Freie Termine für Datum anzeigen       [datum]
	Freien Termin buchen       			   [buchen]
	Gebuchten Termin löschen               [löschen]
	zurück                                 [zurück]
	";
	boolean quit = false; 
// public TimeSlots(int id, String TimeStart, String TimeEnd, String date, boolean scheduled)
// public boolean DeleteUnscheduledSlot(int slotId)
// public int AddScheduledSlotForPerson(int locationId, int personId, int slotId)
// public boolean DeleteScheduledSlotForPerson(int scheduleId)
// public int[] getAllUnscheduledSlotsForStation(int locationId)
	do {
		switch (UserInterface.AskForString(InterfaceOutput)) {
		case "ort":
		GetAllUnscheduledSlotsForStation(saveInt("Geben Sie die Ort-ID an"));
			break;

		case "zeit":
		GetAllUnscheduledSlotsForDate(GetAllUnscheduledSlotsForDate(UserInterface.AskForString("Geben Sie das Datum an")))
			break;
		
		case "buchen":
		AddScheduledSlotForPerson( int saveInt("Geben Sie die ID der Location an"), int saveInt("Geben Sie die ID der Person an"), int saveInt("Geben Sie die ID des Slots an"));
			break;

		case "löschen":
		DeleteScheduledSlotForPerson(int saveInt("Geben Sie die ID des zu löschenden Slots an"));
			break;

		case "zurück":
			quit = true; 
		default:
		UserInterface.SaySomething("Keine vallide eingabe!");
		}
	} while (!quit);
}

public void location() { //Standortverwaltung		mit Schupp					Tobi
	boolean quit = false;
		String InterfaceOutput = 
		"Welcome to Standortverwaltung:\n
		------------------------
		Standort hinzufügen     [dazu]
		Standort löschen      	[löschen]
		Standorte auflisten		[liste]
		zurück                  [zurück]
		";
		boolean quit = false; 
		do {
			switch (UserInterface.AskForString(InterfaceOutput)) {
			case "ort":
				//@todo funktionsaufruf
				break;

			case "löschen":
				//@todo funktionsaufruf
				break;

			case "liste":
				//@todo funktionsaufruf
				break;
			
			case "zurück":
				quit = true; 
			default:
			UserInterface.SaySomething("Kein Eintrag unter diesem Namen");
			}
		} while (!quit);
}
}
public public static int saveInt(String Outup) {
	boolean quit = false; 
	do{
		try{
			return Interger.parseInt(UserInterface.AskForString(Output));
		}catch(Exception ex){
			UserInterface.SaySomething("not a number");
		}
		 
	}while(quit);
	
}
}
