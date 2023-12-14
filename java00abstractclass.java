abstract class parent {
    abstract void write();
}

class child extends parent {
    void write()
    {
        System.out.println("Writing..................");
    }
}
public class java00abstractclass {
    public static void main(String args[])
    {
    child a = new child();
        a.write();
    }
}
