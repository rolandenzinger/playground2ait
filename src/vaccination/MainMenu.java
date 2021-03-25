package vaccination;
//collab mit UI:

// String = UserInterface.AskForString(String);
// void UserInterface.SaySomething();

public class MainMenu {
	public static void main(String[] args) {
		//@todo klassen speichern und lesen aufrufen
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

public static void timeSlot() { //Impfzeitfenster
		boolean quit = false;
		String InterfaceOutput = 
		"Willkommen bei Impfzeitfenster\n
		------------------------
		Geben Sie (hinzufügen) ein um ein Freies Impfenster anzulegen.
		Geben Sie (entfernen) um einpackage vaccination
		";
		try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            UserInterface.SaySomething("Bitte geben Sie ein Wort ein.");
        }
		switch (InterfaceOutput) {
            case "hinzufügen":
			UserInterface.SaySomething("*Freies Impf-Zeitfenster angelegt*");
                break;
            case "entfernen":
			UserInterface.SaySomething("*Ungebuchtes Impf-Zeitfenster gelöscht*");
                break;
            default:
			UserInterface.SaySomething("Falsche Eingabe");
                break;
		} while (!quit);
	}
<<<<<<< HEAD
	public static void personal() { //Personenverwaltung
		boolean quit = false;
		String InterfaceOutput = 
		"Willkommen bei Personenverwaltung\n
		------------------------
		Geben Sie (anlegem) um eine neue Person anzulegen.
		Geben Sie (löschen) um eine Person zu löschen.
		Geben Sie (auflisten) ein um Alle Personen zu listen
		";
		try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            UserInterface.SaySomething("Bitte geben Sie ein Wort ein.");
        }
		switch (InterfaceOutput) {
            case "hinzufügen":
			UserInterface.SaySomething("Person angelegt*");
                break;
            case "entfernen":
			UserInterface.SaySomething("Bitte Peronen ID eingebn");
                ID = Integer.parseInt(sc.nextLine());
                Person.deletePerson(ID);
                break;
			case "auflisten"
			Person.listAllPersons();
            default:
			UserInterface.SaySomething("Falsche Eingabe");
                break;
		} while (!quit);
	}
=======
public static void about() { //über
>>>>>>> d9349086a82bd52ccc82c0e6a56e0ff9d3856e77
	//prints the Information for the Programm
	String output = 
	"----INFORMATION----\n"+
	"Programm information:\n"+
	"Dies ist ein Programm zur Speicherung und verwaltung von Impfkampagnen\n\n"+
	"Programmierinformation:"+
	"Entwickelt von: 2AIT Software Devellopment\n";
	UserInterface.SaySomething(output);

}

public static void scedule() {// Terminvergabe
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
	do {
		switch (UserInterface.AskForString(InterfaceOutput)) {
		case "ort":
			//@todo funktionsaufruf
			break;

		case "zeit":
			//@todo funktionsaufruf
			break;
		
		case "termin":
			//@todo funktionsaufruf
			break;

		case "zurück":
			quit = true; 
		default:
		UserInterface.SaySomething("Keine vallide eingabe!");
		}
	} while (!quit);
}

public void location() { //Standortverwaltung
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
}
