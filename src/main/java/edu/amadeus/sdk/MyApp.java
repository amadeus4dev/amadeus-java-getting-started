package edu.amadeus.sdk;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MyApp {

    private static Logger logger = LoggerFactory.getLogger(MyApp.class);

    public Location[] runQuery() {

        try {
            //Config Amadeus object
            Amadeus amadeus = Amadeus.builder(System.getenv()).build();

            //Configure parameters for the query
            Params params = Params.with("keyword", "MAD").and("subType", Locations.CITY);

            //Run the query
            Location[] locations = amadeus.referenceData.locations.get(params);

            return locations;
        } catch (ResponseException | RuntimeException e) {
            logger.error("Sorry, something goes wrong");
            logger.error("Exception message: " + e.getMessage());

            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void main(String[] args) {

        MyApp myApp = new MyApp();
        Location[] locations = myApp.runQuery();

        Arrays.stream(locations)
            .map(Location::getIataCode)
            .forEach(System.out::println);
    }
}
