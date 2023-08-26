package Mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmailSystem {

    private HashMap<String, List<Email>> mailboxes;
    private SendPassword sendPassword;

    public EmailSystem(SendPassword sendPassword) {
        mailboxes = new HashMap<>();
        this.sendPassword = sendPassword;

    }


    public EmailSystem() {
        mailboxes = new HashMap<>();
        sendPassword = null;
    }


    public void sendP(){

        char[] password = sendPassword.send();
//        System.out.println(password);
        Email m = sendPassword.getEmail();
        m.setText(new String(password));

        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }

    public HashMap<String, List<Email>> getMailboxes() {
        return mailboxes;
    }

    public SendPassword getSendPassword() {
        return sendPassword;
    }

    public void setSendPassword(SendPassword sendPassword) {
        this.sendPassword = sendPassword;
    }

}
