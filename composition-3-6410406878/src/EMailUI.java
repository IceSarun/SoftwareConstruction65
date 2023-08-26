import java.util.Scanner;

public class EMailUI {
    private EmailSystem emailSystem;

    public EMailUI(EmailSystem email) {
        this.emailSystem = email;
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========== SWCon Email System ===========");
        while (true) {
            System.out.println("------> Command [Log I)n S)end R)ead Log O)ut Q)uit]: ");
            String command = in.next();
            if (command.equalsIgnoreCase("Q")) {
                break;
            } else if (command.equalsIgnoreCase("I")) {
                System.out.print("Username: ");
                String username = in.next();
                emailSystem.logIn(username);
                while (true){
                    System.out.println("------> Command [Log I)n S)end R)ead Log O)ut Q)uit]:");
                    command = in.next();
                    if (command.equalsIgnoreCase("Q")) {
                        break;}
                    else if (command.equalsIgnoreCase("S")) {
                        System.out.print("Enter recipient: ");
                        String recipient = in.next();
                        System.out.print("Enter text: ");
                        Scanner scanner = new Scanner(System.in);
                        String message = scanner.nextLine();
                        emailSystem.sendMail(recipient, message);
                    }
                    else if (command.equalsIgnoreCase("R")) {
                        emailSystem.readMail();
                        if (emailSystem.readMail()) {
                            System.out.println("************");
                        }
                    }
                }
            }


        }
        emailSystem.logOut();
        System.out.println("=========== Good Bye ! ===========");
    }
}
