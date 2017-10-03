package ru.cse.proxysorter;

import java.util.Date;
import java.util.logging.Logger;

public class MyTransform {

    public Object transform(Object body) {
        /*String answer = prefix + " set body:  " + new Date();
        if (verbose) {
            System.out.println(">>>> " + answer);
        }
        logger.info(">>>> " + answer);*/
        String answer ="Zombie";
        return answer;
    }
}
