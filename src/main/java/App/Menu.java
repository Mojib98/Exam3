package App;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void menu(){

    }
    private void admin(){
        SecretaryApp secretaryApp = new SecretaryApp();
        boolean isRun=true;
        while (isRun)
        System.out.println(
                "\tfor add doctor insert 1\n" +
                "\tfor add clinic insert 2\n" +
                "\tfor see All doctor insert 3\n" +
                "\tfor see All clinic insert 4\n" +
                "\tfor see All patient insert 5\n" +
                "\tfor see All visit insert 6\n" +
                "\tfor see All prescription insert 7\n");
        int section=scanner.nextInt();
        switch (section){
            case 1:
                secretaryApp.addDoctor();
                break;
            case 2:
                secretaryApp.addClinic();
                break;
            case 3:
                secretaryApp.seeAllDoctor();
                break;
            case 4:
                secretaryApp.seeAllClinic();
                break;
            case 5:
                secretaryApp.seeAllPatient();
                break;
            case 6:
            case 7:
            case 8:
                isRun=false;
        }
    }
}
