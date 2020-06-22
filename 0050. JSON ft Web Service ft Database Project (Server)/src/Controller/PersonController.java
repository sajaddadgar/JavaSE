package Controller;

import Model.Entity.Person;
import Model.Service.PersonService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("personService")
public class PersonController {

    @Path("/getAll")
    @GET
    @Produces("text/plain")
    public String getAll() throws Exception{
        String personList = PersonService.getInstance().getAll();
        System.out.println("getAll method called...");
        return personList;
    }

    @Path("/registerPerson")
    @GET
    @Produces("text/plain")
    public String registerPerson(@QueryParam("name") String name, @QueryParam("family") String family, @QueryParam("nationalCode") String nationalCode) throws Exception{
        if (name.isEmpty() || family.isEmpty() || nationalCode.isEmpty()){
            System.out.println("Data is wrong...");
        } else {
            System.out.println("registerPerson method called...");
            PersonService.getInstance().registerPerson(name, family, nationalCode);
        }
        return String.format("Register person operation is successful.");
    }

    @Path("/changePerson")
    @GET
    @Produces("text/plain")
    public String changePerson(@QueryParam("id") long id, @QueryParam("name") String name, @QueryParam("family") String family) throws Exception{
        System.out.println("changePerson method called...");
        PersonService.getInstance().changePerson(id, name, family);
        return String.format("Change person operation is successful.");
    }

    @Path("/removePerson")
    @GET
    @Produces("text/plain")
    public String removePerson(@QueryParam("id") long id) throws Exception{
        System.out.println("removePerson method called...");
        PersonService.getInstance().removePerson(id);
        return String.format("Remove person operation is successful.");
    }
}
