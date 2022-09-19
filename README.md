# Amadeus-java SDK / Getting started

[![Java CI](https://github.com/amadeus4dev/amadeus-java-getting-started/actions/workflows/build.yml/badge.svg)](https://github.com/amadeus4dev/amadeus-java-getting-started/actions/workflows/build.yml)

An easy `Maven` project to start using the Amadeus Java SDK
in 5 minutes with `Java 11`.

## How to use it?

Register in [Amadeus for Developers](https://developers.amadeus.com) Portal to get your `AMADEUS_CLIENT_ID`
& `AMADEUS_CLIENT_SECRET` values to export them:

```
export AMADEUS_CLIENT_ID=YOUR_CLIENT_ID
export AMADEUS_CLIENT_SECRET=YOUR_CLIENT_SECRET
```

In order to verify that the project is Ok:

```
./mvnw clean verify
```

Then execute the following command in the terminal:

```
./mvnw compile exec:java -Dexec.mainClass="edu.amadeus.sdk.MyApp"
```

*Learn, Enjoy, Share & Travel*
