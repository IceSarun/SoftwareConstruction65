package Mail;

public class SendSwitchCipher implements SendPassword<Email> {
    private Email email;


    public SendSwitchCipher(Email m) {
        this.email = m;
    }

    public char[] send(){
        char[] data = email.getText().toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
        return data;

    }

    public Email getEmail() {
        return null;
    }
}
