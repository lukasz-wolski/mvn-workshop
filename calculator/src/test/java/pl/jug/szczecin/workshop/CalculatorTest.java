package pl.jug.szczecin.workshop;

import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void shouldAddNumbers() {
        double result = new Calculator().add(4, 6);

        assertThat(result).isEqualTo(10);
    }
}
