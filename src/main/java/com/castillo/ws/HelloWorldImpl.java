
package com.castillo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.castillo.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

