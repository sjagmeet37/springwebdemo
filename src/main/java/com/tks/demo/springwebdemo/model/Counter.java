package com.tks.demo.springwebdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Counter {

    private int counter = 0;

    public int getCounter()
    {
        return counter;
    }

    public void incrementCounter( )
    {
        this.counter++;
    }
}

