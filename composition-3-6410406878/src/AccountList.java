import java.util.ArrayList;
import java.util.List;

public class AccountList {
    private List<Account> accountList;

    public AccountList(){
        this.accountList = new ArrayList<>();
    }

    public Account findUserByUsername(String username) {
        for (Account account : accountList) {
            if (account.getNameUser().equals(username)) {
                return account;
            }
        }
        return null;
    }

    public void addUser(Account account) {
        accountList.add(account);
    }

    public List<Account> getAllAccount() {
        return accountList;
    }
}
