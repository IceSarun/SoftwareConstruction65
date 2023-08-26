import java.util.List;

public class EmailSystem {
    private  AccountList accountList;
    private  DataSource dataSource;
    private Account loginAccount;

    public EmailSystem(DataSource dataSource) {
        this.dataSource =dataSource;
        this.accountList = dataSource.readAccountList();
    }
    public void logIn(String username){
        Account account = accountList.findUserByUsername(username);
        if (account == null) {
            throw new RuntimeException("Not Account in System");
        }
        loginAccount = account;
    }

    public void sendMail(String userRecipient,String text){
        if (loginAccount == null) {
            System.out.println("Please login");
            return;
        }
        Account account = accountList.findUserByUsername(userRecipient);
        if (account == null) {
            System.out.println("Recipient not found");
            return;
        }
        account.addMessage(loginAccount.getNameUser(),text);

    }
    public boolean readMail(){
        if (loginAccount == null) {
            System.out.println("Please login");
            return false;
        }
        else{
            List<String> messages = loginAccount.getTextEmail();
            for(String message : messages){
                String line = message.split(": ")[0];
                String text = message.split(": ")[1];
                System.out.println("************");
                System.out.println("From: " + line);
                System.out.println("To: " + loginAccount.getNameUser());
                System.out.println(text);
            }
            return true;
        }
    }

    public void logOut(){
        dataSource.writeAccountList(accountList);
    }


}
