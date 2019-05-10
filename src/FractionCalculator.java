import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args){
        System.out.println("This program is a fraction calculator");
        System.out.println("It will add, subtract, multipy and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b, where a and b are integers.");
        System.out.println("--------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        char response = getOperation(input);

    }

    public static char getOperation(Scanner input){
        while(true){
            System.out.println("Please enter an operation (+, -, /, *, = or Q to quit ");
            char response = input.next().charAt(0);
            String ValidResponses = "+-=/*Q";
            if(ValidResponses.indexOf(response) !=-1 ){
                return response;
            }
            else{
                InvalidOperation();
            }
        }


    }

    public static void InvalidOperation(){
        System.out.println("Invalid input (+,-,=,/,* or Q to quit)");
    }


}
