public class java31method {
    int sum (int x,int y){
       int z;
       z=x+y;
       return  z;
    };
    public static void main(String[] args) {
        int a =3;
        int b=4;
        // we need to create an object to use the method without static
        // classname onjectname = new classname();
        java31method object = new java31method();
        int c = object.sum(a,b);
        System.out.println(c);
    }
}
