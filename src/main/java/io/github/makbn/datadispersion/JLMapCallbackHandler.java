package io.github.makbn.datadispersion;

import java.io.Serializable;

public class JLMapCallbackHandler implements Serializable {

    public void functionCalled(String functionName, Object param1, Object param2){
        System.out.println("f: "+ functionName);
    }
}
