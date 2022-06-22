package edu.amadeus.sdk;

import com.amadeus.resources.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class MyAppTest {

    @Test
    public void given_amadeusObject_when_run_withoutCredentials_then_KO() {

        //Given
        MyApp myApp = new MyApp();

        //When
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            myApp.runQuery();
        });

        //Then
        then(exception.getMessage()).isEqualTo("clientId is marked non-null but is null");
    }
}
