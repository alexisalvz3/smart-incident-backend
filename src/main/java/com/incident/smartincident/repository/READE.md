# Repository Layer

This package contains the data access layer for the Smart Incident Logging Dashboard.

## Purpose

- Defines interfaces for accessing and querying `Incident` entities in the database.
- Uses Spring Data JPA to automatically generate CRUD operations.
- Allows future extension with custom query methods if needed.

## Files

- `IncidentRepository.java`: interface extending `JpaRepository` to provide basic CRUD methods for the `Incident` model.

## Notes

- By extending `JpaRepository`, Spring Data will automatically implement standard methods like:
    - `findAll()`
    - `findById()`
    - `save()`
    - `deleteById()`
- Custom queries (e.g., filtering by severity or location) can be added later as needed.
