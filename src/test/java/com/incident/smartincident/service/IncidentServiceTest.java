package com.incident.smartincident.service;

import com.incident.smartincident.model.Incident;
import com.incident.smartincident.repository.IncidentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDateTime;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Unit tests for the IncidentService class using JUnit 5 and Mockito.
 *
 * - @ExtendWith(MockitoExtension.class): Enables Mockito support in JUnit 5.
 * - @Mock: Creates a mock version of the IncidentRepository (no real DB).
 * - @InjectMocks: Automatically injects the mocked repository into the IncidentService.
 *
 * This isolates the service layer and verifies its logic without touching the database or HTTP layers.
 */

@ExtendWith(MockitoExtension.class)
public class IncidentServiceTest {

    private List<Incident> mockIncidents;

    @BeforeEach
    void setUp() {
        Incident incident1 = new Incident(
                "Motion detected near cash register",
                "Store #7 - Tijuana",
                "High",
                LocalDateTime.of(2025, 7, 1, 22, 15),
                "Unexpected movement detected near the register area after closing."
        );

        Incident incident2 = new Incident(
                "Camera offline in stock room",
                "Store #12 - San Diego",
                "Medium",
                LocalDateTime.of(2025, 7, 3, 14, 40),
                "Stock room camera went offline for over 30 minutes."
        );
        mockIncidents = List.of(incident1, incident2);
    }

    @Mock
    private IncidentRepository incidentRepository;

    @InjectMocks
    private IncidentService incidentService;

    @Test
    public void testGetAllIncidents() {
        when(incidentRepository.findAll()).thenReturn(mockIncidents);

        List<Incident> result = incidentService.getAllIncidents();

        assertEquals(mockIncidents.size(), result.size());
        assertEquals(mockIncidents.get(0), result.get(0));
    }
}
