public class Person {
    private String personID;
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;
    private String street;
    private String zip;
    private String city;
    private String country;
    private String birthday;
    private int telephone;

    public String addNewPerson(String personID,String firstName,String lastName,int socialSecurityNumber,String street,String zip,String city,String country,String birthday,int telephone) {
        this.personID = personID;

        return "";
    }

    public void deletePerson(personID) {
        System.out.println("Löschen verlief erfolgreich");
    }

    public void listAllPersons() {

    }
}