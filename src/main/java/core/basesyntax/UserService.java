package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] parts = record.split(":");
            if ((parts.length == 2) && parts[0].equals(email)) {
                return Integer.parseInt(parts[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
