# spring-context-indexer

Running the tests with `./gradlew test` fails when the `spring-context-indexer` is used.

It seems as if the the test configuration `TestConfig` is not loaded because it only considers the components in the `spring.components` file.
