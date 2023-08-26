package exercise2_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        class BalanceMeasurer implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                BankAccount b1 = (BankAccount) o1;
                BankAccount b2 = (BankAccount) o2;
                if(b1.getBalance()< b2.getBalance()){
                    return -1;
                }
                else if(b1.getBalance()== b2.getBalance()){
                    return 0;
                }
                return  1;
            }
        }
        class AgeMeasurer implements Comparator{

            @Override
            public int compare(Object o1, Object o2) {
                Pet a1 = (Pet) o1;
                Pet a2 = (Pet) o2;
                if(a1.getAge()< a2.getAge()){
                    return -1;
                }
                else if(a1.getAge() == a2.getAge()){
                    return 0;
                }
                return  1;
            }
        }

        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount(1500);
        accounts[1] = new BankAccount(800);
        accounts[2] = new BankAccount(300);
        accounts[3] = new BankAccount(60.9);
        accounts[4] = new BankAccount(490);

        ArraySort.sort(accounts,new BalanceMeasurer());
        System.out.println("----sort account by balance----");
        for (BankAccount account : accounts)
            System.out.println(account.getBalance());

        Pet[] Animal = new Pet[3];
        Animal[0] = new Pet("Ivy","cat",15);
        Animal[1] = new Pet("Ice","fish",39);
        Animal[2] = new Pet("Isac","turtle",20);


        ArraySort.sort(Animal,new AgeMeasurer());
        System.out.println("----sort pet by age----");
        for (Pet pet : Animal)
            System.out.println(pet.getName() +" : "+ pet.getAge());
    }
}
