public interface DataSource {
    AccountList readAccountList();

    void writeAccountList(AccountList accountList);
}
