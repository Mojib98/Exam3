package App;

import java.util.Scanner;

public class Runing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true){
            try {
                System.out.println("\t\tfor sing up insert 1\n" +
                        "\t\tfor login app insert 2");
                int se= scanner.nextInt();
                switch (se){
                    case 1:
                        menu.singUp();
                    case 2:
                        menu.menu();
                }

            }catch (Exception e){
                e.printStackTrace();
                scanner.reset();
                continue;
            }
        }

    }
}
