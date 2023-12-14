
class Animal{
    private String explain;

    public Animal() {
        this.explain = "All the animals belongs to base class Animal";
    }

    public String getExplain() {
        return explain;
    }
}
class dog extends Animal {
    private String name;

    public dog() {
        this.name = "dog belongs to parent class Animal";
    }

    public String getName() {
        return name;
    }
}
public class java45constructor {
    public static void main(String[] args) {
        Animal animals = new Animal();
        System.out.println("Animal : ");
        System.out.println(animals.getExplain());
        System.out.println();

        //by derived class
        dog dog1= new dog();
        System.out.println("DOG : ");
        System.out.println(dog1.getExplain());
        System.out.println(dog1.getName());

    }
}
