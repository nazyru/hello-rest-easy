package com.flexisaf.sample.endpoints;

import com.flexisaf.sample.HelloRestInterface;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by nazir on 1/28/16.
 */
@Stateless
public class HelloEndpoint implements HelloEndpointI{


    @EJB
    private HelloRestInterface helloRestInterface;

    @Override
    public String tellThisShitMan() {
        return helloRestInterface.getHello();
    }
}
