package lesson8;

import java.util.Scanner;
import java.util.regex.*;

public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public User(String username) {
        this.username = username;
        Pattern regexp = Pattern.compile("^[a-zA-Z0-9_].{2,14}$");
        Matcher matcher = regexp.matcher(username);

        if (matcher.matches()) {
            System.out.println("Registration is successful");
        } else{
            System.out.println("Username must include only A-Z, a-z,  0-9 and \"_\" symbol. " +
                    "Length of the username 3-15 symbols");
        }
    }

    public User() {
        System.out.println("Enter the username");
        username = new Scanner(System.in).nextLine();

        Pattern regexp = Pattern.compile("^[a-zA-Z0-9_].{2,14}$");
        Matcher matcher = regexp.matcher(username);

        if (matcher.matches()) {
            System.out.println("Registration is successful");
        } else{
            System.out.println("Username must include only A-Z, a-z,  0-9 and \"_\" symbol. " +
                    "Length of the username 3-15 symbols");
        }
    }

    void checkUsername(){

    }
}
