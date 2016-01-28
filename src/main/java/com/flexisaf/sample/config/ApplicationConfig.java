package com.flexisaf.sample.config;


import com.flexisaf.sample.endpoints.HelloEndpoint;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nazir on 1/28/16.
 */

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    private Set<Object> singletons = new HashSet<>();

    public ApplicationConfig(){
        singletons.add(new HelloEndpoint());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
