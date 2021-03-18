package vaccination;

public class MainMenu {

	public MainMenu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// put your code here

	}
		public void TimeSlot() {
			do {
				switch(UserInterFace.AskForString("Eingabe: \n Löschen Eingeben")) {
 					case "";

					addTime();

					// Methode "einfügen" aufrufen
					break;
				}
				case "";

				deleteTime();

				// Methode "löschen" aufrufen
					break;


			} while (!quit);
		}
		public void Person() {
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


			} while (!quit);
		}
}
