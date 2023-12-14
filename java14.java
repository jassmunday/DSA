public class java14 {
    public static void main(String[] args) {
        String name ="jsbeats";
        String value = name.toUpperCase();
        System.out.println(value);

        System.out.println(name.equals("jsbeat"));
        // java15 practice
        String nameNew ="Dear \n <name> \n\tThanks a Lot.";
        System.out.println(nameNew);
        String nameRe = nameNew.replace("<name>","Jass") ;
        System.out.println(nameRe);
        System.out.println();
    }

}
