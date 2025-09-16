package Level2.Model;

public class Application {
    public static void play(){
        byte askAge = Input.readByte("Enter your age");
        int askInt = Input.readInt("Enter an integer");
        float askFloat = Input.readFloat("Enter a decimal number (float)");
        double askDouble = Input.readDouble("Enter a large decimal number (double)");
        char askChar = Input.readChar("Enter your initial");
        String askFood = Input.readString("Enter your favorite food");
        boolean askYesNo = Input.readYesNo("Do you want some chips?");

        System.out.println(askAge);
        System.out.println(askInt);
        System.out.println(askFloat);
        System.out.println(askDouble);
        System.out.println(askChar);
        System.out.println(askFood);
        System.out.println(askYesNo ? "Yes" : "No");

    }
}
