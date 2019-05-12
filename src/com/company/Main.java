package com.company;

import java.util.Scanner;

import static com.company.UserValidator.cheackEmail;
import static com.company.UserValidator.cheackPassword;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pls enter email: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println("Pls enter password: ");
        String password = scanner.nextLine();
        if (cheackPassword(password) && cheackEmail(email)){
            System.out.println("Everything ok");
        }else {
            System.out.println("Your password or email are not valid");
        }
    }
}
