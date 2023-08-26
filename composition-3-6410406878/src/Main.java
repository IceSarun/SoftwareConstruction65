public class Main {
    public static void main(String[] args) {
        DataSourceF dataSource = new DataSourceF("account.txt");
        EmailSystem email = new EmailSystem(dataSource);
        EMailUI emailUI = new EMailUI(email);
        emailUI.run();
    }
}
