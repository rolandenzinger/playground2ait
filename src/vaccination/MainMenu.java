package vaccination;
//collab mit UI:

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

	public void timeSlot() {
			do {
				switch(UserInterFace.AskForString("Eingabe: \n Löschen Eingeben")) {
 					case "";

					 TimeSlot(int slot-id , String timeStart, String timeEnd, String date, boolean scheduled);

					// Methode "einfügen" aufrufen
					break;
				}
				case "";

				deleteTime();

				// Methode "löschen" aufrufen
					break;


			} while (!quit);
		}

	public void personal() {
			do {
				switch(UserInterFace.AskForString("Eingabe: \n Person anlegen 
															\n Person löschen
															\n Alle Personen listen")) {
 					case "";

					addPerson();

					// Methode "einfügen" aufrufen
					break;
				}
				case "";

				deletePerson();

				// Methode "löschen" aufrufen
					break;
				case "";

				listPerson();

				// Methode "löschen" aufrufen
					break;


			}while(!quit);

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
		do {
            switch(UserInterface.AskForString("Gib den Kommand + ein um einen Standort hinzuzufügen.")) {
            case: "+";
           
            addLocation();
            break;
            }
           
            switch(UserInterface.AskForString("Gib den Kommand - ein um einen Standort zu löschen.")) {
            case: "-";
           
            deleteLocation();
            break;
            }
           
            switch(UserInterface.AskForString("Gib den Kommand ListAll ein um jeden Standort aufzulisten.")) {
            case: "ListAll";
           
            listAllLocations();
            break;
            }
           
           
        } while (!stop);
       
    }

}
