class student{
    private String name;
    private int fees;
    public  student(){
        name = "j beast";
        fees = 10000;
    };
    public void setName(String nme,int fese){
        name = nme;
        fees= fese;
    };
    public String getName(){
        return name;
    };
    public int  getFees(){
        return fees;
    };
}

class  rectangle{
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}



public class java40acess {
    public static void main(String[] args) {
       /* student sam = new student();
      // sam.setName("Jass");
       System.out.println(sam.getName());
        System.out.println(sam.getFees());*/

        rectangle r =new rectangle(12,15);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
