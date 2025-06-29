package com.incident.smartincident.controller;

import com.incident.smartincident.model.Incident;
import com.incident.smartincident.service.IncidentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class that exposes REST endpoints for managing security incidents.
 * Provides endpoints to create, retrieve, and delete incidents.
 */
@RestController
@RequestMapping("/incidents")
public class IncidentController {
    private final IncidentService incidentService;

    /**
     * Constructor for dependency injection of IncidentService
     *
     * @param incidentService is the service layer to handle incident logic
     */
    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    /**
     *
     * @param incident is the incident data from the request body
     * @return the saved incident with generated ID
     */
    @PostMapping
    public Incident createIncident(@RequestBody Incident incident) {
        return incidentService.createIncident(incident);
    }

    /**
     * Retrieve all recorded security incidents.
     *
     * @return a List of all Incidents
     */
    @GetMapping
    public List<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }

    /**
     * Retrieve a specific incident by its ID.
     *
     * @param id is the unique identifier of the incident
     * @return the incident if found, or null if not found.
     */
    @GetMapping("/{id}")
    public Incident getIncidentById(@PathVariable int id) {
        return incidentService.getIncidentById(id)
                .orElse(null);
    }

    /**
     * Delete an incident by its ID
     * @param id is the unique identifier of the incident to delete
     */
    @DeleteMapping("/{id}")
    public void deleteIncidentById(@PathVariable int id) {
        incidentService.deleteIncident(id);
    }
}
