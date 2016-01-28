package com.flexisaf.sample.endpoints;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by nazir on 1/28/16.
 */


@Local
@Path("hello")
public interface HelloEndpointI {

        @GET
        String tellThisShitMan();
}
