package Controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("calcService")
public class Calculator {

    @Path("/sum")
    @GET
    @Produces("text/plain")
    public String sum(@QueryParam("x") String x, @QueryParam("y") String y){
        int result = Integer.parseInt(x) + Integer.parseInt(y);
        System.out.println("Sum method called...");
        return String.valueOf(result);
    }

    @Path("/minus")
    @GET
    @Produces("text/plain")
    public String minus(@QueryParam("x") String x, @QueryParam("y") String y){
        int result = Integer.parseInt(x) - Integer.parseInt(y);
        System.out.println("Minus method called...");
        return String.valueOf(result);
    }

}
