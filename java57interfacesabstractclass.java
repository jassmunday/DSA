interface camera{
   void takePhoto();
        };
interface connectivity{
    String[] getNetwork();
    void showConnections(String net);
};

class phone{
    public void calling(int incmngnumbr){
        System.out.println("calling "+incmngnumbr);
    };
    public void recieveing(int otgngnumbr){
        System.out.println("incoming call"+otgngnumbr);
    };
}

class smartphones extends phone implements camera,connectivity{
    @Override
    public void takePhoto() {
        System.out.println("clicking a picture.......");
    };
    public String[] getNetwork(){
         String[] list ={"student1","munday","airtel"};
         return list;
    };

    @Override
    public void showConnections(String net) {
        System.out.println("networks"+net);
    };
}



public class java57interfacesabstractclass {
    public static void main(String[] args) {
    smartphones Vivo = new smartphones();
    String[] ntwrk =Vivo.getNetwork();
        for (String element:ntwrk) {
            System.out.println(ntwrk);
        }
    }
}
