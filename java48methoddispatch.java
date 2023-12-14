class Phone{
    public void name(){
        System.out.println("PHONE");
    };
}

class SmartPhone extends Phone{
    public void name(){
        System.out.println("SAMSUNG SMARTPHONE");
    };
}

public class java48methoddispatch {
    public static void main(String[] args) {
    SmartPhone p1 = new SmartPhone();
        p1.name();
    }
}
