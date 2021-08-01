package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogback {
//    In order to use the slf4j API we need to create a logger 1.
    private final static Logger log = LoggerFactory.getLogger(HelloLogback.class);

    public static void main(String[] args) {
        System.out.println("Hello Logback");
        log.info("Hello Info");
        log.debug("Hello Debug");

    }
}
