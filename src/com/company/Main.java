package com.company;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger LOG = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {

        Exception e = new RuntimeException("RuntimeException example");
        LOG.info("info");
        LOG.trace("trace");
        LOG.debug("debug");
        LOG.warn("warn");
        LOG.error("error", e);
        LOG.fatal("fatal");


        Cat alice = new Cat();
        alice.name = "Alice";
        alice.sayMeow();
        alice.play();
        alice.sleep();
        alice.eat();
        alice.chaseMouse();
        alice.rumble();
        alice.liveAnotherDay(); }
}
