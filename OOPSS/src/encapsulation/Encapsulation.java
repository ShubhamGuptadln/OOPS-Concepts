package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Laptop lp=new Laptop();
        lp.setPrice(58);
        System.out.println(lp.getPrice());

    }
    public void doWork()
    {
        System.out.println("Working Working");
    }
}


class Laptop{
    int ram;
    private int price;

    public void setPrice(int price)
    {
        boolean isAdmin=false;
        if(!isAdmin)
        {
            System.out.println("You can not set the price");
        }
        else
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }


}
