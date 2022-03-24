package com.techreturners;

public class Main {

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        Parrot jasper = new Parrot("Jasper", "Green");
        jasper.speak();
    }
}
