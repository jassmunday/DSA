class Rectangle{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    //    Rectangle(int l,int b){
//        this.length=l;
//        this.breadth=b;
//        System.out.println("constructor of Rectangle ");
//    }
}
 class Cuboid extends Rectangle{
    public int height;

     public int getHeight() {
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }

     //    Cuboid(int l , int b,int h){
//        super(l,b);
//        this.height=h;
//        System.out.println("constructor of cuboid");
//        }
        public double volume(){
        return this.height*this.breadth*this.length;
    };

}

public class java52practice {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        c1.setHeight(5);
        c1.setBreadth(3);
        c1.setLength(9);
        System.out.println(c1.volume());

    }
}
