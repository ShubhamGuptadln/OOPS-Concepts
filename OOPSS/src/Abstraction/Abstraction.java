package Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        Audi audi=new Audi();
        audi.start();

    }

}

class BMW extends Car{
    void start()
    {
        System.out.println("BMW is starting");
    }
}

class Audi extends Car{
    void start()
    {
        System.out.println("Audi is starting");
    }
}
abstract class Car{
    int price;
    abstract void start();
}
