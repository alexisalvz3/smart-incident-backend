package com.incident.smartincident;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.incident.smartincident")
public class SmartIncidentBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartIncidentBackendApplication.class, args);
    }

}
