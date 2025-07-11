package com.incident.smartincident.repository;

import com.incident.smartincident.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 *
 * Repository --> talks to the database
 * Spring Data JPA is based on the idea that your repository interface defines how to access data — including
 * things like:
 *
 * Finding all rows
 * Finding one by ID
 * Finding by custom criteria (e.g., severity, location, etc.)
 */
@Repository
public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    /***
     * We're telling Spring: "please generate the SQL for this at runtime so I don’t have to."
     * @param severity
     * @return
     */
    List<Incident> findBySeverityIgnoreCase(String severity);
}
