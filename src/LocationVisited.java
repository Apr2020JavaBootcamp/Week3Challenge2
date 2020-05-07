public class LocationVisited {
    private String name;
    private String city;
    private String state;
    private String date;

    public LocationVisited() {
        name = "";
        city = "";
        state = "";
        date = "";
    }

    public LocationVisited(String name, String city, String state, String date) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        return "Name: " + name + "\t City: " + city + "\t State: " + state + "\t Visit Date: " + date;
    }
}
