package corejavafour;

public class StaticExample {

	static int a = 10;
    public static void main (String[] args) {
        a = 20;
        System.out.println(a);
        display();
        StaticExample staticExample = new StaticExample();
        staticExample.view();
        staticExample.view1();
    }
    public static void display()
    {
        a = 0;
        System.out.println(a);
    }
    public void view()
    {
        a = 9;
        System.out.println(a);
    }
    public void view1()
    {
        System.out.println(a);
    }

}
