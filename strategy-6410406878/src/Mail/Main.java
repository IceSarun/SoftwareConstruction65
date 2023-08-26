package Mail;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");

        System.out.println("Text : "+email1.getText());
        System.out.println("By "+email1.getSender());
        EmailSystem emailSystem = new EmailSystem(new SendCaesar(email1,2));
        emailSystem.sendP();

        System.out.println("----------------------------------");
        System.out.println("Text : "+email2.getText());
        System.out.println("By "+email2.getSender());
        emailSystem.setSendPassword(new SendSwitchCipher(email2));
        emailSystem.sendP();

    }
}
