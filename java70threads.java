
//class  cooking extends Thread{
//    public void run(){
//        int i=0;
//        while (i<5) {
//            System.out.println("I am Cooking");
//            i++;
//        }
//    }
//}
//class  messaging extends Thread{
//    public void run(){
//        int i=0;
//        while (i<5) {
//            System.out.println("I am messaging");
//            i++;
//        }
//    }
//}
//
//
//public class java70threads {
//
//    public static void main(String[] args) {
//        cooking ckg=new cooking();
//        messaging msg = new messaging();
//        ckg.start();
//        msg.start();
//
//    }
//}
class MyThreadRunnable1 implements Runnable{
    public void run(){

        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");

    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){

        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
    }
}
public class java70threads {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

