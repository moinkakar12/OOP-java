import java.util.HashMap;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String contactId;
    private String Address;
    private String Website;
    private String Birthday;
    private String nickName;
    private String Company;

    public Contact() {

    }

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress, String contactId,
                   String address, String website, String birthday, String nickName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.contactId = contactId;
        this.Address = address;
        this.Website = website;
        this.Birthday = birthday;
        this.nickName = nickName;
        this.Company = company;
    }
// Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactId='" + contactId + '\'' +
                ", Address='" + Address + '\'' +
                ", Website='" + Website + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", nickName='" + nickName + '\'' +
                ", Company='" + Company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Contact c = new Contact("Moin", "Khan", "+923188001027",
                "moinkhankakar123@gmail.com", "moinkakar12", "H#2, Ramzan Colony, Ispini Road, Quetta", "www.twitter.com/moinkakar2", "03/05/2001", "Mono", "ATZ");
        System.out.println(c.toString());

    }
}

