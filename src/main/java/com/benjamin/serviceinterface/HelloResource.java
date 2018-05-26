package com.benjamin.serviceinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloResource {

    private static final Logger logger = LoggerFactory.getLogger(HelloResource.class);

    @GET
    @Path("/hello")
    public Response getHello() {
        logger.info("Testing if logging works, yo!!");
        return Response.ok("hi benji").build();
    }
}
