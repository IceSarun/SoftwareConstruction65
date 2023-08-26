package Mail;

import java.util.HashMap;
import java.util.List;

public class SendCaesar implements SendPassword<Email>{
    private Email email;
    private int key;

    public SendCaesar(Email m, int key) {
        this.email = m;
        this.key = key;
    }

    public char[] send(){
        char[] data = email.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        return data;
    }

    public Email getEmail() {
        return this.email;
    }
}
