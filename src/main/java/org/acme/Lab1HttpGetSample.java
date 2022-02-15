package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/sayhello")
public class Lab1HttpGetSample {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello " + name + " !";
    }
}