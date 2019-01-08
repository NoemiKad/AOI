package pl.aoi.marek.branch.model;


import javax.persistence.*;

@Entity
@Table(name = "user_database")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = " phone")
    private String phone;

    @Column(name = " name")
    private String name;

    @Column(name = " surname")
    private String surname;

    @Column(name = "city")
    private String city;

    @Column(name = "organization")
    private String organization;

    @Column(name = "rodo")
    private boolean rodo;

    @Column(name = "user_type")
    private String userType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public boolean isRodo() {
        return rodo;
    }

    public void setRodo(boolean rodo) {
        this.rodo = rodo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", organization='" + organization + '\'' +
                ", rodo=" + rodo +
                ", userType='" + userType + '\'' +
                '}';
    }

    public User() {
    }

    public User(String password, String email, String phone, String name, String surname, String city, String organization, boolean rodo, String userType) {
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.organization = organization;
        this.rodo = rodo;
        this.userType = userType;
    }
}
