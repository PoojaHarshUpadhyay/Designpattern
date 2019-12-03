package com.company;

//Abstract class that is extended by real and proxy classes, this can also be interface.
abstract class Image {
    abstract void display();
}

//Real class which can be accessed by proxy class only
class RealImage extends Image {
    @Override
    void display() {
        System.out.println("This is real image");
    }

    void draw() {
        System.out.println("lets draw");
    }
}

//Proxy class calling the real class methods and also doing any business logic required
class ProxyImage extends Image {

    private RealImage realImage;

    @Override
    void display() {
        System.out.println("This is proxy image");
        this.realImage = new RealImage();
        realImage.display();
        realImage.draw();
    }
}

//Client class cannot call Real class method, it can access Proxy class.
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here

        Image objImage = new ProxyImage();
        objImage.display();
    }
}
