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





/*    public void checkName(String name){
        if(name.length() < 3 )
            throw new InvalidName("name should be more than 2 character!");
        for (Character ch:name.toCharArray()
        ) {
            if(Character.isDigit(ch))
                throw new InvalidName("name can not have number!");
        }
        for (Character ch:name.toCharArray()
        ) {
            if(!Character.isAlphabetic(ch))
                throw new InvalidName("name can't have Sign(!,@,#,%,...)");
        }
    }

    public void nationalIdChecker(String nationalId){
        if(nationalId.length() > 10 )
            throw new InvalidNationalId("national Id can't more than ten number!");
        if(nationalId.equals(""))
            throw new InvalidNationalId("dont enter space!");
        for (Character ch:nationalId.toCharArray()) {
            if(!Character.isDigit(ch))
                throw new InvalidNationalId("national Id should be just number!");
        }
    }

    public void passwordCheck(String password){
        if(password.length() < 3 )
            throw new InvalidPassword("password should be more than 2 ");
        char[] passwordArray = password.toCharArray();
        char[] signArray =  new char[] {'!','@','#','$','%','^','&','*','(',')','-','+','=','.',',','>','<','?','/','|',':',';'};
        int space = 0,lowerCase = 0,upperCase = 0,sign = 0,digit = 0;
        for(int i=0;i<passwordArray.length;i++)
            if(Character.isSpaceChar(passwordArray[i]))
                ++space;
        for(int i = 0;i<passwordArray.length;i++)
            if(Character.isUpperCase(passwordArray[i]))
                ++upperCase;
        for(int i = 0;i<passwordArray.length;i++)
            if(Character.isLowerCase(passwordArray[i]))
                ++lowerCase;
        for(int i = 0;i<passwordArray.length;i++)
            if(Character.isDigit(passwordArray[i]))
                ++digit;
        for(int i=0;i<signArray.length;i++)
            for(int j=0;j<passwordArray.length;j++)
                if(signArray[i] == passwordArray[j])
                    ++sign;
        if( (space == 0) || (lowerCase == 0) || (upperCase == 0) || (sign == 0) || (digit == 0) )
            throw new InvalidPassword("password should have space+lowerCase+upperCase+sign+digit!");
    }*/
}
