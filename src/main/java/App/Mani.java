package App;

import java.util.Scanner;

public class Mani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true){
            try {
                System.out.println("\t\tfor sing up insert 1\n" +
                        "for login app insert 2");
                int se= scanner.nextInt();
                switch (se){
                    case 1:
                        menu.singUp();
                    case 2:
                        menu.menu();
                }

            }catch (Exception e){
                e.printStackTrace();
                continue;
            }
        }

    }
}
