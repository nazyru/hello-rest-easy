package com.flexisaf.sample;

import javax.ejb.Local;

/**
 * Created by nazir on 1/28/16.
 */

@Local
public interface HelloRestInterface {

    public String getHello();
}
