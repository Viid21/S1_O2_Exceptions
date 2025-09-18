package Level3.Model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static int readInt(String message){
        do {
            System.out.println(message);
            try{
                return sc.nextInt();
            }catch (InputMismatchException exception){
                System.out.println("Format error");
                sc.nextLine();
            }
        }while (true);
    }

    public static String readString(String message){
        do {
            System.out.println(message);
            try{
                return sc.next();
            }catch (InputMismatchException exception){
                System.out.println("Format error");
                sc.nextLine();
            }
        }while (true);
    }
}
