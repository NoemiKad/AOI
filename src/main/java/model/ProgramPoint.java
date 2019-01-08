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
    private String program_type;
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
            name = "ppl_slots_max"
    )
    private String ppl_slots_max;
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
        return "ProgramPoint{id=" + this.id + ", title='" + this.title + '\'' + ", program_type='" + this.program_type + '\'' + ", description='" + this.description + '\'' + ", author='" + this.author + '\'' + ", hours='" + this.hours + '\'' + ", ppl_slots_max='" + this.ppl_slots_max + '\'' + ", minimalPeopleNumber='" + this.minimalPeopleNumber + '\'' + ", maximalPeopleNumber='" + this.maximalPeopleNumber + '\'' + ", picture='" + this.picture + '\'' + ", timeLength='" + this.timeLength + '\'' + ", trigger='" + this.trigger + '\'' + ", status='" + this.status + '\'' + '}';
    }

    public ProgramPoint(String title, String program_type, String description, String author, String hours, String ppl_slots_max, String minimalPeopleNumber, String maximalPeopleNumber, String picture, String timeLength, String trigger, String status) {
        this.title = title;
        this.program_type = program_type;
        this.description = description;
        this.author = author;
        this.hours = hours;
        this.ppl_slots_max = ppl_slots_max;
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

    public String getprogram_type() {
        return this.program_type;
    }

    public void setprogram_type(String program_type) {
        this.program_type = program_type;
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

    public String getppl_slots_max() {
        return this.ppl_slots_max;
    }

    public void setppl_slots_max(String ppl_slots_max) {
        this.ppl_slots_max = ppl_slots_max;
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
