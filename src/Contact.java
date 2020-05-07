public class Contact extends Person{
    String[] location;
    String date;

    public Contact() {
        super();
        location = new String[2];
        date = "";
    }

    public Contact(String name, String email, String phoneNum, String[] address, String[] location, String date) {
        super(name, email, phoneNum, address);
        this.location = location;
        this.date = date;
    }

    public Contact(String name, String email, String phoneNum, String city, String state, String contactCity,
                   String contactState, String date) {
        super(name, email, phoneNum, city, state);
        this.location = new String[]{contactCity, contactState};
        this.date = date;
    }

    //Getters and Setters

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //methods
    @Override
    public String toString() {
        String output;
        output = "Name:               " + this.getName() + "\n" +
                "Phone:              " + this.getPhoneNum() + "\n" +
                "Email:              " + this.getEmail() + "\n" +
                "City:               " + this.getAddress()[0] + " State: " + this.getAddress()[1] + "\n" +
                "Contacted Location: " + this.getLocation()[0] + ", " + this.getLocation()[1] + "\n" +
                "Contacted Date:     " + this.getDate() + "\n";
        return output;
    }
}
