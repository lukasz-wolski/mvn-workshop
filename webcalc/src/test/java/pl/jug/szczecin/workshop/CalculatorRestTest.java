package pl.jug.szczecin.workshop;

import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CalculatorRestTest {

    @Test
    public void shouldAddTwoNumbers() {
        double result = new CalculatorRest().add(0.3, 0.5);

        assertThat(result).isEqualTo(0.8);
    }

}
