package pl.aoi.marek.branch.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "program_database")
public class ProgramPoint implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn
    private Event event;

    @ManyToOne
    @JoinColumn
    private User user;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = " title ")
    private String title;

    @Column(name = "program_type")
    private String pogramType;

    @Column(name = " description")
    private String description;

    @Column(name = " author")
    private String author;

    @Column(name = " chosen_hours")
    private String hours;

    @Column(name = "requisition")
    private String requisition;

    @Column(name = "ppl_slots_min")
    private String minimalPeopleNumber;

    @Column(name = "ppl_slots_max")
    private String maximalPeopleNumber;

    @Column(name = "picture")
    private String picture;

    @Column(name = "length")
    private String timeLength;

    @Column(name = "triggers")
    private String trigger;

    @Column(name = "status")
    private String status;




    @Override
    public String toString() {
        return "ProgramPoint{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pogramType='" + pogramType + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", hours='" + hours + '\'' +
                ", requisition='" + requisition + '\'' +
                ", minimalPeopleNumber='" + minimalPeopleNumber + '\'' +
                ", maximalPeopleNumber='" + maximalPeopleNumber + '\'' +
                ", picture='" + picture + '\'' +
                ", timeLength='" + timeLength + '\'' +
                ", trigger='" + trigger + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public ProgramPoint(String title, String pogramType, String description, String author, String hours, String requisition, String minimalPeopleNumber, String maximalPeopleNumber, String picture, String timeLength, String trigger, String status) {
        this.title = title;
        this.pogramType = pogramType;
        this.description = description;
        this.author = author;
        this.hours = hours;
        this.requisition = requisition;
        this.minimalPeopleNumber = minimalPeopleNumber;
        this.maximalPeopleNumber = maximalPeopleNumber;
        this.picture = picture;
        this.timeLength = timeLength;
        this.trigger = trigger;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPogramType() {
        return pogramType;
    }

    public void setPogramType(String pogramType) {
        this.pogramType = pogramType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRequisition() {
        return requisition;
    }

    public void setRequisition(String requisition) {
        this.requisition = requisition;
    }

    public String getMinimalPeopleNumber() {
        return minimalPeopleNumber;
    }

    public void setMinimalPeopleNumber(String minimalPeopleNumber) {
        this.minimalPeopleNumber = minimalPeopleNumber;
    }

    public String getMaximalPeopleNumber() {
        return maximalPeopleNumber;
    }

    public void setMaximalPeopleNumber(String maximalPeopleNumber) {
        this.maximalPeopleNumber = maximalPeopleNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProgramPoint() {
    }
}
