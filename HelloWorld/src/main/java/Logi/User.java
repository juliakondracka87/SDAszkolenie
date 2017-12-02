package Logi;

import java.util.logging.Logger;

public class User {
    String login;
    String password;
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void validate(String password){
        if(this.password.equals(password)){ //zamiast == o wpisujem equals
            System.out.println("Podane poprawne hasło!");
            LOGGER.info("Poprawne logowanie!");

        }
        else{
            System.out.println("Podano nie poprawne hasło!");
            LOGGER.info("Nie poprawne logowanie");
        }
    }
}

