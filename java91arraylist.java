import java.util.ArrayList;

public class java91arraylist {


    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        //Linked List
        //LinkedList<Integer> al2 = new LinkedList<>();

        // similary use dequeue

        al2.add(16); al1.add(13); al2.add(17);

        al1.add(1);
        al1.add(6);
        al1.add(9);
        al1.add(4);
        al1.addAll(al2);
        for(int i = 0;i<al1.size();i++){
            System.out.println(al1.get(i));
        }

    }
}
