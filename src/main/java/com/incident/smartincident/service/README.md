# Service Layer

This package contains the business logic for the Smart Incident Logging Dashboard.

## Purpose

- Acts as an intermediary between the controllers and the data repository.
- Encapsulates business rules, data validation, and transformations.
- Keeps the controller thin and focused on HTTP request handling.

## Responsibilities

- Validate incident data before saving or updating
- Apply filtering or sorting logic
- Handle exceptions or fallback mechanisms
- Coordinate complex operations across multiple models (future enhancement)

## Notes

- Service classes should be annotated with `@Service`.
- Dependency injection (`@Autowired` or constructor injection) is used to link to the repository layer.
- This layer makes testing and refactoring easier by separating business logic from HTTP concerns.
