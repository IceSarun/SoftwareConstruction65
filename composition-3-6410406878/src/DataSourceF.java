import java.io.*;
import java.util.*;

public class DataSourceF implements DataSource{
    private String filename;

    public DataSourceF(String filename) {
        this.filename = filename;
        checkFile();
    }

    // check if the file exists. If not, create a new file
    private void checkFile() {
        File file = new File(filename);
        if (!file.exists()) {
            file.mkdirs();
        }
        String filePath = file.getAbsolutePath();
        file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public AccountList readAccountList() {
        AccountList userList = new AccountList();
        try {
            Scanner scanner = new Scanner(new FileReader(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(",");
                String username = split[0];

                List<String> messages = new ArrayList<>();
                for (int i = 1; i < split.length; i += 2) {
                    String sender = split[i];
                    String message = split[i + 1];
                    messages.add(sender + ": " + message);
                }
                Account account = new Account(username, messages);
                userList.addUser(account);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void writeAccountList(AccountList accountList) {
        String filePath = this.filename;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Account account : accountList.getAllAccount()) {
                String username = account.getNameUser();
                List<String> messages = account.getTextEmail();
                StringBuilder line = new StringBuilder(username);
                for (String message : messages) {
                    String[] split = message.split(": ");
                    String sender = split[0];
                    String content = split[1];
                    line.append(",").append(sender).append(",").append(content);
                }
                bufferedWriter.write(line.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}