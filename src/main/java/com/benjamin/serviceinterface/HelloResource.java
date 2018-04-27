package com.benjamin.serviceinterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloResource {

    @GET
    @Path("/hello")
    public Response getHello() {
        return Response.ok("hi benji").build();
    }
}
