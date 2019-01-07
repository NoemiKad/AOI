package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "event_database"
)
public class Event {
    @Id
    @GeneratedValue
    @Column(
            name = "Event_ID"
    )
    private int id;
    @Column(
            name = "Name"
    )
    private String name;
    @Column(
            name = "Place"
    )
    private String place;
    @Column(
            name = "No_rooms"
    )
    private int roomNumber;
    @Column(
            name = "Opening_date"
    )
    private Date OpeningDate;
    @Column(
            name = "Ending_date"
    )
    private Date EndingDate;

    public Event() {
    }

    public Event(String place, int roomNumber, Date openingDate, Date endingDate) {
        this.place = place;
        this.roomNumber = roomNumber;
        this.OpeningDate = openingDate;
        this.EndingDate = endingDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getOpeningDate() {
        return this.OpeningDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.OpeningDate = openingDate;
    }

    public Date getEndingDate() {
        return this.EndingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.EndingDate = endingDate;
    }

    public String toString() {
        return "Event{id=" + this.id + ", name='" + this.name + '\'' + ", place='" + this.place + '\'' + ", roomNumber=" + this.roomNumber + ", OpeningDate=" + this.OpeningDate + ", EndingDate=" + this.EndingDate + '}';
    }
}