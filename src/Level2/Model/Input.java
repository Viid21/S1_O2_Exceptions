package Level2.Model;

import Level2.Exceptions.InputMismatchExceptionCustom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message){
        boolean hasException;
        byte input = 0;
        do {
            System.out.println(message);
            try{
                input = sc.nextByte();
                hasException = false;
            }catch (InputMismatchException exception){
                System.out.println("Format error");
                sc.nextLine();
                hasException = true;
            }
        }while (hasException);
        return input;
    }

    public static int readInt(String message){
        boolean hasException;
        int input = 0;
        do {
            System.out.println(message);
            try{
                input = sc.nextInt();
                hasException = false;
            }catch (InputMismatchException exception){
                System.out.println("Format error");
                sc.nextLine();
                hasException = true;
            }
        }while (hasException);
        return input;
    }

    public static float readFloat(String message){
        boolean hasException;
        float input = 0f;
        do {
            System.out.println(message);
            try{
                input = sc.nextFloat();
                hasException = false;
            }catch (InputMismatchException exception){
                System.out.println("Format error");
                sc.nextLine();
                hasException = true;
            }
        }while (hasException);
        return input;
    }

    public static double readDouble(String message){
        boolean hasException;
        double input = 0;
        do {
            System.out.println(message);
            try{
                input = sc.nextDouble();
                hasException = false;
            }catch (InputMismatchException exception){
                System.out.println("Format error");
                sc.nextLine();
                hasException = true;
            }
        }while (hasException);
        return input;
    }

    public static char readChar(String message){
        boolean hasException;
        String input;
        do {
            System.out.println(message);
            input = sc.nextLine();
            sc.next();
            try{
                if(input.length() != 1){
                    throw new InputMismatchExceptionCustom("Format error");
                }
                hasException = false;
            }catch (InputMismatchExceptionCustom exception){
                System.out.println(exception.getMessage());
                hasException = true;
            }
        }while (hasException);
        return input.charAt(0);
    }

    public static String readString(String message){
        boolean hasException;
        String input;
        do {
            System.out.println(message);
            input = sc.nextLine();
            sc.next();
            try{
                if(input.trim().isEmpty()){
                    throw new InputMismatchExceptionCustom("Format error");
                }
                hasException = false;
            }catch (InputMismatchExceptionCustom exception){
                System.out.println(exception.getMessage());
                hasException = true;
            }
        }while (hasException);
        return input;
    }

    public static boolean readYesNo(String message){
        boolean hasException;
        char input;
        boolean yes = false;
        do {
            System.out.println(message);
            input = sc.nextLine().trim().toLowerCase().charAt(0);
            sc.next();
            try{
                if(input == 's'){
                    yes = true;
                    hasException = false;
                }else if(input == 'n'){
                    hasException = false;
                } else{
                    throw new InputMismatchExceptionCustom("Format error");
                }

            }catch (InputMismatchExceptionCustom exception){
                System.out.println(exception.getMessage());
                hasException = true;
            }
        }while (hasException);
        return yes;
    }
}
