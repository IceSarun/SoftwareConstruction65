package exercise1_2;

public class Pet implements Comparable{
    private String name;
    private String typePet;
    private int age;

    public Pet(String name, String typePet, int age) {
        this.name = name;
        this.typePet = typePet;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTypePet() {
        return typePet;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object other) {
        Pet others = (Pet) other;
        if(this.age < others.age){return -1;}
        if(this.age == others.age){return 0;}
        return 1;
    }
}
