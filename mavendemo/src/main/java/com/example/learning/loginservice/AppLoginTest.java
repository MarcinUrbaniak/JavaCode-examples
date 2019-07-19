package com.example.learning.loginservice;

public class AppLoginTest {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        System.out.println("----Test logowania----");
        System.out.println("login: " + loginService.login("login1", ""));
        System.out.println("login: " + loginService.login("login1", "Test1234"));
        System.out.println("login: " + loginService.login("login1", "Test1231"));
        System.out.println("login: " + loginService.login("login", "Test1231"));
        System.out.println("");
        System.out.println("----Test rejestracji---");
        System.out.println("register: " + loginService.register("login",""));
        System.out.println("register: " + loginService.register("login1","test1234"));
        System.out.println("register: " + loginService.register("login","test"));
        System.out.println("register: " + loginService.register("login","testtest"));
        System.out.println("register: " + loginService.register("login","test1234"));
    }
}
