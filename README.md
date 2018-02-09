gradle-demo
===

Sample gradle project, showcasing a simple Spring Boot multi-module project.

Getting Started
---

* `gradle build`: Build sources and run tests
  * of which there are none ;)
* `gradle install`: Install to local maven repository `~/.m2/repository`
* `cd feature1 && gradle bootRun`: Run feature1 as a Spring Boot app right from a Gradle build
  * The same works for `feature2`
  * The build will "stall" at ~88% while the app is running. Hit Ctrl+C to stop the app.
