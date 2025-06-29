package com.incident.smartincident.service;

import com.incident.smartincident.model.Incident;
import com.incident.smartincident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {
    // our local and private incidentRepository object used for our service
    private final IncidentRepository incidentRepository;

    // constructor using incidentRepository so the service can talk to db
    @Autowired
    public IncidentService(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    // method used to get a list of all incidents from our db
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    // method used to return individual incident based on ID, if exists
    public Optional<Incident> getIncidentById(int id) {
        return incidentRepository.findById(id);
    }

    // method used to create and save or update an incident
    public Incident createIncident(Incident incident) {
        return incidentRepository.save(incident);
    }

    // method used to delete or remove an incident by id
    public void deleteIncident(int id) {
        incidentRepository.deleteById(id);
    }
}
