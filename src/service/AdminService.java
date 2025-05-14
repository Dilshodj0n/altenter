package service;

import java.util.Scanner;

public class AdminService {
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    public void service(){
        while (true){



            System.out.println("""
                    0. exit
                    1. sign up
                    2. sign in
                    """);
            switch (intScanner.nextInt()){
                case 0 -> {
                    return;
                }
                case 2 -> {
                   signUP();
                }
                case 3 -> {
                    signIn();
                }
            }
        }
    }

    private void signUP() {
    }

    private void signIn() {
    }
}
