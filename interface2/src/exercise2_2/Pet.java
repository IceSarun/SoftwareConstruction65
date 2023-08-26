package exercise2_2;

public class Pet {
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
}
