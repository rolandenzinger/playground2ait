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
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this. street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.birthday = birthday;
        this.telephone = telephone;
        return personID;
    }

    public void deletePerson(String personID) {
        this.personID = null;
        this.firstName = null;
        this.lastName = null;
        this.socialSecurityNumber = null;
        this.street = null;
        this.zip = null;
        this.city = null;
        this.country = null;
        this.birthday = null;
        this.telephone = null;
        System.out.println("Löschen verlief erfolgreich");
    }

    public void listAllPersons() {
        
    }
}