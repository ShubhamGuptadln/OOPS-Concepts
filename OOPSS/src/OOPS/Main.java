package OOPS;

import encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person p1 = new Person();
        p1.age=19;
        p1.name="Shubham";
        p1.walk();
        p1.walk(52);

        Person p2=new Person("Sagar",22);
        p2.walk();
        p2.walk(65);
        p2.doWork();
        System.out.println(Person.count);

        Developer d=new Developer("Sagar",32);
        d.walk();
        Encapsulation obj=new Encapsulation();
        obj.doWork();

    }
    }


    class Person{
        String name;
        int age;

        static int count;
        public Person()
        {
            count++;
            System.out.println("Object has been created");

        }

        public Person(String name,int age)
        {
            this();
            this.name=name;
            this.age=age;
        }

        void walk()
        {
            System.out.println(name+" is walking");
        }

        void walk(int step)
        {
            System.out.println(name+" walks "+step +" steps");
        }

        void doWork()
        {
            System.out.println("OOPS.Person is working");
        }


    }

    class Developer extends Person{
    public Developer( String name,int age)
    {
        super(name, age);
    }
        void walk()
        {
            System.out.println("OOPS.Developer "+name+" is walking");
        }
    }
