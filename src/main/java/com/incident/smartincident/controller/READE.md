# Controller Layer

This package contains the REST controllers for the Smart Incident Logging Dashboard.

## Purpose

- Handles incoming HTTP requests (e.g., GET, POST, DELETE)
- Maps routes to service methods
- Returns appropriate JSON responses to the frontend
- Handles basic error responses and HTTP status codes

## Responsibilities

- Expose endpoints for CRUD operations on `Incident`
- Call the service layer to perform business logic
- Validate request inputs (or delegate to the service layer)
- Return meaningful status codes (e.g., 200, 404, 201)

## Notes

- Controllers are annotated with `@RestController`
- Route mappings use `@RequestMapping` and `@GetMapping`, `@PostMapping`, etc.
- Keep controllers *thin* by delegating logic to the service layer
