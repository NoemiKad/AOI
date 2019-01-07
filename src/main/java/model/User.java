package model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(
        name = "user_database"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "id"
    )

    private int id;
    @Column(
            name = "login"
    )

    @NotBlank(message = "Pole wymagane")
    private String login;
    @Column(
            name = "password"
    )
    @NotBlank(message = "Pole wymagane")
    private String password;
    @Column(
            name = "email"
    )
    @NotBlank(message = "Pole wymagane")
    private String email;
    @Column(
            name = " phone"
    )
    private String phone;
    @Column(
            name = " name"
    )
    private String name;
    @Column(
            name = " surname"
    )
    private String surname;
    @Column(
            name = "city"
    )
    private String city;
    @Column(
            name = "organization"
    )
    private String organization;
    @Column(
            name = "rodo"
    )
    private boolean rodo;
    @Column(
            name = "user_type"
    )
    private String userType;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public boolean isRodo() {
        return this.rodo;
    }

    public void setRodo(boolean rodo) {
        this.rodo = rodo;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String toString() {
        return "User{id=" + this.id + ", login='" + this.login + '\'' + ", password='" + this.password + '\'' + ", email='" + this.email + '\'' + ", phone='" + this.phone + '\'' + ", name='" + this.name + '\'' + ", surname='" + this.surname + '\'' + ", city='" + this.city + '\'' + ", organization='" + this.organization + '\'' + ", rodo=" + this.rodo + ", userType='" + this.userType + '\'' + '}';
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
