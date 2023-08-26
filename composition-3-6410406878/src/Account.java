import java.util.List;

public class Account {
    private String nameUser;
    private List<String> textEmail;

    public Account(String nameUser) {
        this.nameUser = nameUser;
        textEmail= null;
    }
    public Account() {
        nameUser = null;
        textEmail = null;
    }

    public Account(String nameUser, List<String> textEmail) {
        this.nameUser = nameUser;
        this.textEmail = textEmail;
    }

    public String getNameUser() {
        return nameUser;
    }

    public List<String> getTextEmail() {
        return textEmail;
    }

    public void addMessage(String sender, String message) {
        this.textEmail.add(sender + ": " + message);
    }


    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
}
