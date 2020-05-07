public class Symptom {
    private String name;
    private int numDaysWithSymptom;
    private String description;

    //Constructors
    public Symptom() {      //default constructor
        name = "";
        numDaysWithSymptom = 0;
        description = "";
    }

    public Symptom(String name, int numDaysWithSymptom, String description) {
        this.name = name;
        this.numDaysWithSymptom = numDaysWithSymptom;
        this.description = description;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDaysWithSymptom() {
        return numDaysWithSymptom;
    }

    public void setNumDaysWithSymptom(int numDaysWithSymptom) {
        this.numDaysWithSymptom = numDaysWithSymptom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String output = "";
        output += "had " + this.getName() + " for " + this.getNumDaysWithSymptom() + " days ";
        if (!this.getDescription().equals("")) {
            output += "(Additional Details: " + this.getDescription() + ")\n";
        } else {
            output += "\n";
        }
        return output;
    }
}
