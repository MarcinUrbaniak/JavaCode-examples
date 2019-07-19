package com.example.learning.loginservice;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private Map<String, String> usersMap = new HashMap<>();

    private static final String SUCCESS = "Sukces";
    private static final String USER_NOT_FOUND = "Nie znaleziono uzytkownika";
    private static final String USER_EXIST = "Uzytkownik istnieje";
    private static final String WRONG_PASSWORD = "Zle haslo";
    private static final String EMPTY_LOGIN_OR_PASSWORD = "Nie podano loginu lub hasla";
    private static final String PASSWORD_IS_NOT_ALLOWED = "Podane haslo nie jest dozwolone";


    public LoginService(){
        usersMap.put("login1", "Test1234");
        usersMap.put("login2", "test1234");
        usersMap.put("adam", "adam1234");
        usersMap.put("ewa", "ewa12345");
    }

    public String login(String login, String pass){

        if (login == null || pass == null || login.isEmpty() || pass.isEmpty()){
            return EMPTY_LOGIN_OR_PASSWORD;
        }

        if (!usersMap.containsKey(login)){
            return USER_NOT_FOUND;
        }

        if (usersMap.get(login) == null || !usersMap.get(login).equals(pass)){
            return WRONG_PASSWORD;
        }

        return SUCCESS;

    }

    public String register(String login, String pass){

        if (login == null || pass == null || login.isEmpty() || pass.isEmpty()) return EMPTY_LOGIN_OR_PASSWORD;
        if (usersMap.containsKey(login)) return USER_EXIST;
        if (!pass.matches("(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]{8,})")) return PASSWORD_IS_NOT_ALLOWED;

        usersMap.put(login,pass);
        return SUCCESS;
    }

}
