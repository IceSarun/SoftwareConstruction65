package Mail;

import java.util.HashMap;
import java.util.List;

public interface SendPassword <T> {
    char[] send();
    Email getEmail();
}
