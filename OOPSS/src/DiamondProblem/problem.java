//package DiamondProblem;
//
//public class problem extends parent2,parent1 {
//    public static void main(String[] args) {
//
//    }
//}
//class parent1{
//    void fun()
//    {
//        System.out.println("Parent1 is calling");
//    }
//}
//
//class parent2{
//    void fun()
//    {
//        System.out.println("Parent2 is calling");
//    }
//}
//
//

// Solution

package DiamondProblem;

public class problem {
    public static void main(String[] args) {
        child ch=new child();
        ch.fun();

    }
}

interface parent1{
    void fun();
}
interface parent2{
    void fun();
}

class child implements parent1,parent2{

    @Override
    public void fun() {
        System.out.println("Parent is called");
    }
}
