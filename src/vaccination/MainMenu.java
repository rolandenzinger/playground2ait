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
		Geben Sie (1) ein um ein Freies Impfenster anzulegen.
		Geben Sie (2) um einpackage vaccination
		";
		try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            UserInterface.SaySomething("Bitte geben Sie eine Zahl ein.");
        }
		switch (InterfaceOutput) {
            case 1:
                System.out.println("*Freies Impf-Zeitfenster angelegt*");
                break;
            case 2:
                System.out.println("*Ungebuchtes Impf-Zeitfenster gelöscht*");
                break;
            default:
                System.out.println("Falsche Nummer");
                break;
		} while (!quit);
	}
public static void about() {
	//prints the Information for the Programm
	String output = 
	"----INFORMATION----\n"+
	"Programm information:\n"+
	"Dies ist ein Programm zur Speicherung und verwaltung von Impfkampagnen\n\n"+
	"Programmierinformation:"+
	"Entwickelt von: 2AIT Software Devellopment\n";
	UserInterface.SaySomething(output);

}

public static void scedule() {

}

public void location() {
	
}
}
}
