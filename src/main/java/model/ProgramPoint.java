package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "program_database"
)
public class ProgramPoint {
    @Id
    @GeneratedValue
    @Column(
            name = "id"
    )
    private int id;
    @Column(
            name = " title "
    )
    private String title;
    @Column(
            name = "program_type"
    )
    private String pogramType;
    @Column(
            name = " description"
    )
    private String description;
    @Column(
            name = " author"
    )
    private String author;
    @Column(
            name = " chosen_hours"
    )
    private String hours;
    @Column(
            name = "requisition"
    )
    private String requisition;
    @Column(
            name = "ppl_slots_min"
    )
    private String minimalPeopleNumber;
    @Column(
            name = "ppl_slots_max"
    )
    private String maximalPeopleNumber;
    @Column(
            name = "picture"
    )
    private String picture;
    @Column(
            name = "length"
    )
    private String timeLength;
    @Column(
            name = "triggers"
    )
    private String trigger;
    @Column(
            name = "status"
    )
    private String status;

    public String toString() {
        return "ProgramPoint{id=" + this.id + ", title='" + this.title + '\'' + ", pogramType='" + this.pogramType + '\'' + ", description='" + this.description + '\'' + ", author='" + this.author + '\'' + ", hours='" + this.hours + '\'' + ", requisition='" + this.requisition + '\'' + ", minimalPeopleNumber='" + this.minimalPeopleNumber + '\'' + ", maximalPeopleNumber='" + this.maximalPeopleNumber + '\'' + ", picture='" + this.picture + '\'' + ", timeLength='" + this.timeLength + '\'' + ", trigger='" + this.trigger + '\'' + ", status='" + this.status + '\'' + '}';
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
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPogramType() {
        return this.pogramType;
    }

    public void setPogramType(String pogramType) {
        this.pogramType = pogramType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHours() {
        return this.hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRequisition() {
        return this.requisition;
    }

    public void setRequisition(String requisition) {
        this.requisition = requisition;
    }

    public String getMinimalPeopleNumber() {
        return this.minimalPeopleNumber;
    }

    public void setMinimalPeopleNumber(String minimalPeopleNumber) {
        this.minimalPeopleNumber = minimalPeopleNumber;
    }

    public String getMaximalPeopleNumber() {
        return this.maximalPeopleNumber;
    }

    public void setMaximalPeopleNumber(String maximalPeopleNumber) {
        this.maximalPeopleNumber = maximalPeopleNumber;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTimeLength() {
        return this.timeLength;
    }

    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    public String getTrigger() {
        return this.trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProgramPoint() {
    }
}
