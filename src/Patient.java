import java.util.ArrayList;

public class Patient extends Person {
    private ArrayList<Symptom> symptoms;
    private ArrayList<Contact> lastContacts;
    private ArrayList<LocationVisited> locations;

    //Constructors
    public Patient() {      //default constructor
        super();
        symptoms = new ArrayList<>();
        lastContacts = new ArrayList<>();
        locations = new ArrayList<>();
    }

    public Patient(String name, String email, String phoneNum, String[] address, ArrayList<Symptom> symptoms,
                   ArrayList<Contact> lastContacts, ArrayList<LocationVisited> locations) {
        super(name, email, phoneNum, address);
        this.symptoms = symptoms;
        this.lastContacts = lastContacts;
        this.locations = locations;
    }

    public Patient(String name, String email, String phoneNum, String city, String state) {
        super(name, email, phoneNum, city, state);
        this.symptoms = new ArrayList<Symptom>();
        this.lastContacts = new ArrayList<Contact>();
        this.locations = new ArrayList<LocationVisited>();
    }

    //Getters and Setters

    public ArrayList<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<Contact> getLastContacts() {
        return lastContacts;
    }

    public void setLastContacts(ArrayList<Contact> lastContacts) {
        this.lastContacts = lastContacts;
    }

    public ArrayList<LocationVisited> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<LocationVisited> locations) {
        this.locations = locations;
    }

    //methods
    @Override
    public String toString() {
        String output;
        output = "**** Contact Tracing Report **** \n" +
                "Name:  " + this.getName() + "\n" +
                "Phone: " + this.getPhoneNum() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "City:  " + this.getAddress()[0] + "\t\t State: " + this.getAddress()[1] + "\n\n" +
                "** Symptoms **: \n";
        for (Symptom symptom: this.symptoms) {
            output += symptom.toString();
        }
        output += "\n";
        output += "** Contacts ** \n";
        for (Contact contact: lastContacts) {
            output+= contact.toString() + "\n";
        }
        output += "** Locations Visited **\n";
        for (LocationVisited location : locations) {
            output += location.toString() + "\n";
        }
        output += "**** End Report ****";
        return output;
    }

    public void addSymptom(Symptom symptom) {
        this.symptoms.add(symptom);
    }

    public void addContact(Contact contact) {
        this.lastContacts.add(contact);
    }

    public void addLocation(LocationVisited location) {
        this.locations.add(location);
    }
}
