package com.company;

//This is abstract class that will have fly and quack behaviour
abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }


    void performFly() {
        flyBehaviour.fly();
    }

    void performQuack() {
        quackBehaviour.quack();
    }
}

//One type of duck concrete class
class MalardDuck extends Duck {

    public MalardDuck() {
        quackBehaviour = new RealQuack();
        flyBehaviour = new FlyWithWings();
    }

    void Display() {
        System.out.println("This is malard duck");
    }
}

//This is new type of duck model duck
class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehaviour = new FakeQuack();
        flyBehaviour = new FlyNoWay();
    }
}



//Interface to define fly behaviour
interface FlyBehaviour {
    void fly();
}

//Concrete class for duck that fly implements FlyBehaviour interface
class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("This is fly with wings");
    }
}

//Concrete class duck that dont fly that implements FlyBehaviour interface
class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I dont fly");
    }
}

//This is one more duck type class
class FlyRocketPowered implements FlyBehaviour  {

    @Override
    public void fly() {
        System.out.println("I have power");
    }
}

//Interface to define quack behaviour
interface QuackBehaviour {
    void quack();
}

//Concrete  real quack class that implements FlyBehaviour QuackBehaviour
class RealQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("This is real quack");
    }
}

//Concrete fake quack class that implements FlyBehaviour QuackBehaviour
class FakeQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("This is fake quack");
    }
}



public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        Duck mallardDuck = new MalardDuck();
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new RealQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();


        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        // Here we are changing the behaviour of model duck to rocket power duck dynamically
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
