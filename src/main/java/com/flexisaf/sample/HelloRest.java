package com.flexisaf.sample;

import javax.ejb.Stateless;

/**
 * Created by nazir on 1/28/16.
 */

@Stateless
public class HelloRest implements HelloRestInterface {

    @Override
    public String getHello() {
        return "Hello Shit Man";
    }
}
