package Interface;
//Interface provides complete abstraction

public class Interface {
    public static void main(String[] args) {
        caplane cp=new caplane();
        cp.fly();
        cp.start();

    }
}

class caplane implements car,place{

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void fly() {
        System.out.println("fly the plane");

    }
}

interface car{
    void start();
}
interface place{
    void fly();
}


