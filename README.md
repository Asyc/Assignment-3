# CSC 548 Assignment 3

Five Spring Boot exercises based on the supplied starter projects. Each directory is an independent Maven project. Run the Maven wrapper from that directory, then open the listed route. The default port is 8080 when running one project at a time.

| Task | Project | Result route | Expected result |
| --- | --- | --- | --- |
| 1 | `02-dev-tools-demo` | `/`, `/workout`, `/fortune` | Ali, Interstellar, and jazz |
| 2 | `03-actuator-demo` | `/actuator/info` | Name, description, and version from `application.properties` |
| 3 | `01-constructor-injection` | `/basketball` | `Tennis is my favorite basketball.` |
| 4 | `Reading-html-form-data` | `/showForm` | Form for name and favorite sport; submit to see both values |
| 5 | `Adding-data-to-the-model` | `/Movie` | Movie form; submit to see the class welcome and favorite movie message |

For example, on Windows:

```powershell
cd 01-constructor-injection
.\mvnw.cmd spring-boot:run
```

The other four projects run in the same way from their own directories. Stop one project before starting another on the default port, or pass `-Dspring-boot.run.arguments=--server.port=8081` to use a different port.

The example favorites are Interstellar (movie), jazz (music), and basketball (sport).

## Result screenshots

Screenshots are in `screenshots/`. They show the running endpoints and submitted forms. The three Task 1 screenshots correspond to `/`, `/workout`, and `/fortune`.

| Task | Screenshots |
| --- | --- |
| 1 | `task1-name.png`, `task1-movie.png`, `task1-music.png` |
| 2 | `task2-actuator.png` |
| 3 | `task3-basketball.png` |
| 4 | `task4-sport-form-result.png` |
| 5 | `task5-movie-form-result.png` |
