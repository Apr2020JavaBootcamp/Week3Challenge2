import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient = traceForm(input);
        System.out.println(patient.toString());

        /*
        Patient test = new Patient("test", "email", "phone number", "city", "state");
        Symptom symptom = new Symptom("name", 5,"description");
        test.addSymptom(symptom);
        Contact contact = new Contact("name", "email", "phone number", "city",
                "state", "city", "state", "date");
        test.addContact(contact);
        LocationVisited location = new LocationVisited("name", "city", "state", "date");
        test.addLocation(location);
         */
        //System.out.println(symptom.toString());
        //System.out.println(test.toString());
    }


    //methods
    //Prompts user for information regarding a patient, and returns a Patient object
    public static Patient traceForm(Scanner input) {
        String startLoop = "";
        String[] possibleSymptoms = new String[]{"Fever", "Cough", "Shortness of breath", "Tiredness", "Aches",
                "Chills", "Sore throat", "Loss of smell", "Loss of taste",
                "Headache", "Diarrhea", "Severe vomiting"};
        Patient patient = new Patient();
        System.out.println("Contact Tracing Program");
        System.out.println("Entering a newly infected patient's name...");
        System.out.println("What is the patient's name? ");
        patient.setName(input.nextLine());
        String name = patient.getName();
        System.out.println("What is the patient's phone number? ");
        patient.setPhoneNum(input.nextLine());
        System.out.println("What is the patient's e-mail?");
        patient.setEmail(input.nextLine());
        System.out.println("What city does the patient live in?");
        String city = input.nextLine();
        System.out.println("What state does the patient live in?");
        String state = input.nextLine();
        patient.setAddress(new String[]{city, state});
        for (int i = 0; i < possibleSymptoms.length; i++) {
            System.out.println("Has " + name + " been exhibiting signs of " + possibleSymptoms[i] + "? y/n");
            if (input.nextLine().equalsIgnoreCase("y")) {
                Symptom symptom = new Symptom();
                symptom.setName(possibleSymptoms[i]);
                System.out.println("How long has " + name + " had this symptom? ");
                symptom.setNumDaysWithSymptom(input.nextInt());
                input.nextLine();
                System.out.println("Enter additional details here, or press ENTER to skip");
                symptom.setDescription(input.nextLine());
                patient.addSymptom(symptom);
            }
        }

        do  {
            System.out.println("Has " + name + " been in contact with anyone else recently? y/n");
            startLoop = input.nextLine();
            if (startLoop.equalsIgnoreCase("y")) {
                Contact contact = new Contact();
                System.out.println("What is his/her name? ");
                contact.setName(input.nextLine());
                System.out.println("What is his/her phone number? ");
                contact.setPhoneNum(input.nextLine());
                System.out.println("What is his/her e-mail?");
                contact.setEmail(input.nextLine());
                System.out.println("What city does he/she live in?");
                city = input.nextLine();
                System.out.println("What state does he/she live in? ");
                state = input.nextLine();
                contact.setAddress(new String[]{city, state});
                System.out.println("What city did " + name + " see him/her? ");
                String contactCity = input.nextLine();
                System.out.println("What state did " + name + " see him/her?");
                String contactState = input.nextLine();
                contact.setLocation(new String[]{contactCity, contactState});
                System.out.println("When did " + name + " see him/her? mm/dd/yyyy");
                contact.setDate(input.nextLine());
                patient.addContact(contact);
            }
        } while (startLoop.equalsIgnoreCase("y"));

        do {
            System.out.println("Has " + name + " visited anywhere else in the past 14 days? y/n");
            startLoop = input.nextLine();
            if (startLoop.equalsIgnoreCase("y")) {
                LocationVisited location = new LocationVisited();
                System.out.println("What is the name of the place " + name + " visited? ");
                location.setName(input.nextLine());
                System.out.println("What city is " + location.getName() + " located in? ");
                location.setCity(input.nextLine());
                System.out.println("What state is " + location.getName() + " located in? ");
                location.setState(input.nextLine());
                System.out.println("When did " + name + " visit " + location.getName() + "? mm/dd/yyyy");
                patient.addLocation(location);
            }
        } while (startLoop.equalsIgnoreCase("y"));

        return patient;
    }
}
