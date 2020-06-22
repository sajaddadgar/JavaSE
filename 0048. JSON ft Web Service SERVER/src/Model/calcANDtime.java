package Model;

import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.Date;

@Path("calcTimeService")
public class calcANDtime {

    @Path("/sum")
    @GET
    @Produces("text/plain")
    public String sum(@QueryParam("x") String x, @QueryParam("y") String y){
        int result = Integer.parseInt(x) + Integer.parseInt(y);
        System.out.println("sum method called...");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", String.valueOf(result));
        jsonObject.put("responseTime", new Date().toString());
        return jsonObject.toJSONString();
    }

    @Path("/minus")
    @GET
    @Produces("text/plain")
    public String minus(@QueryParam("x") String x, @QueryParam("y") String y){
        int result = Integer.parseInt(x) - Integer.parseInt(y);
        System.out.println("minus method called...");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Result", String.valueOf(result));
        jsonObject.put("responseTime", new Date().toString());
        return jsonObject.toJSONString();
    }

}
