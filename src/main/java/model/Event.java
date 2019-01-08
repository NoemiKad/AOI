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
    private int no_rooms;
    @Column(
            name = "Opening_date"
    )
    private Date opening_date;
    @Column(
            name = "Ending_date"
    )
    private Date ending_date;

    public Event() {
    }

    public Event(String place, int no_rooms, Date opening_date, Date ending_date) {
        this.place = place;
        this.no_rooms = no_rooms;
        this.opening_date = opening_date;
        this.ending_date = ending_date;
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

    public int getno_rooms() {
        return this.no_rooms;
    }

    public void setno_rooms(int no_rooms) {
        this.no_rooms = no_rooms;
    }

    public Date getopening_date() {
        return this.opening_date;
    }

    public void setopening_date(Date opening_date) {
        this.opening_date = opening_date;
    }

    public Date getending_date() {
        return this.ending_date;
    }

    public void setending_date(Date ending_date) {
        this.ending_date = ending_date;
    }

    public String toString() {
        return "Event{id=" + this.id + ", name='" + this.name + '\'' + ", place='" + this.place + '\'' + ", no_rooms=" + this.no_rooms + ", opening_date=" + this.opening_date + ", ending_date=" + this.ending_date + '}';
    }
}