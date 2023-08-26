package exercise1_2;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount(150);
        accounts[1] = new BankAccount(8.906);
        accounts[2] = new BankAccount(3.005);
        accounts[3] = new BankAccount(609);
        accounts[4] = new BankAccount(490);

        SortArray.sort(accounts);
        System.out.println("----sort account by balance----");
        for (BankAccount account : accounts)
            System.out.println(account.getBalance());

        Pet[] Animal = new Pet[3];
        Animal[0] = new Pet("Ivy","cat",5);
        Animal[1] = new Pet("Ice","fish",3);
        Animal[2] = new Pet("Isac","turtle",20);


        SortArray.sort(Animal);
        System.out.println("----sort pet by age----");
        for (Pet pet : Animal)
            System.out.println(pet.getName() +" : "+ pet.getAge());
    }

}
