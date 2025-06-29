package com.incident.smartincident.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "incidents")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String title;
    String location;
    String severity;
    private LocalDateTime timestamp;
    String description;

    public Incident(String title, String location, String severity, LocalDateTime timestamp, String description) {
        this.title = title;
        this.location = location;
        this.severity = severity;
        this.timestamp = timestamp;
        this.description = description;
    }


    public Incident() {

    }
}
