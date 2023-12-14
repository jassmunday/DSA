class thrd extends Thread{
    thrd(String nme){
        super(nme);

    }
    public void run(){
        int i = 0;
        while (i<10) {
            System.out.println("this is thread " + getName());
            i++;
        }
    }
}
public class java72threadConstructor {
    public static void main(String[] args) {
        thrd t1 = new thrd("jass");
        thrd t2 = new thrd("jass 2");
        thrd t3 = new thrd("jass 3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
}
