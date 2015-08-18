package com.duckstrategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Java1 on 18.08.2015.
 */
public class TestDuck {
    public static void main(String[] args) {
        Duck d1 = new Duck(3,"test1",new LinearFly(),new NormalQuack());
        d1.quack();
        d1.setQuackBehaviour(new DrunkQuack());
        d1.quack();
    }
}
