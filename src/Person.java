import java.util.ArrayList;

public abstract class Person {
    private String name;
    private String email;
    private String phoneNum;
    private String[] address;


    //Constructors
    public Person() {       //default constructor
        name = "";
        email = "";
        phoneNum = "";
        address = new String[2];
    }

    public Person(String name, String email, String phoneNum, String[] address) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public Person(String name, String email, String phoneNum, String city, String state) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        address = new String[]{city, state};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

}
