package pl.jug.szczecin.workshop;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("calculator")
public class CalculatorRest {

    @GET
    public double add(
            @QueryParam("left") double left,
            @QueryParam("right") double right) {
        return new Calculator().add(left, right);
    }

}
