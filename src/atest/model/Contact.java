package atest.model;

public class Contact {
    private String phoneNumber;
    private String group;
    private String fullname;
    private String gender;
    private String address;
    private String birthday;
    private String mail;

    public Contact(String phoneNumber, String group, String fullname, String gender, String address, String birthday, String mail) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.mail = mail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String toString() {
        return fullname + ", " + group + ", " + gender + ", " + address + ", " + birthday + ", " + mail;
    }
}
