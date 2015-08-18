package com.duckstrategypattern;

/**
 * Created by Java1 on 18.08.2015.
 */
public class Duck {
    private int weight;
    private String type;
    private static int duckCount=0;
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    public Duck(int weight, String type, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour)
    {
        setType(type);
        setWeight(weight);
        setFlyBehaviour(flyBehaviour);
        setQuackBehaviour(quackBehaviour);
        duckCount++;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
    public String fly(){
        System.out.println(flyBehaviour.fly());
        return flyBehaviour.fly();
    }
    public String quack(){
        System.out.println(quackBehaviour.quack());
        return quackBehaviour.quack();
    }
    public String toString(){
        return  "Type   : " + type + "\n" +
                "Weight : " + weight + "\n\n";
    }
}

