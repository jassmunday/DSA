class Base {
    public int a;
    public int method1(){
        return 1;
    };
    public void method2(){
        System.out.println("I am method 2 of class Base");
    };
}
class Derived extends Base{
    // overriding the method 2 of base class
    @Override
    public void method2(){
        System.out.println("I am method 2 of class Derived");
    };
    public void method3(){
        System.out.println("I am method 3 of class Derived");
    };
}

public class java48methodoverriding {
    public static void main(String[] args) {
        Base b= new Base();
        b.method2();

        Derived d= new Derived();
        d.method2();

    }
}
