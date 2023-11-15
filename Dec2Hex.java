import java.util.Scanner;

class Dec2Hex {
    public static void main(String args[]) {
        // Check if an argument is provided
        if (args.length < 1) {
            System.out.println("Error: No input provided.");
            return; // Exit the program
        }

        try {
            int Arg1 = Integer.parseInt(args[0]);
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem;
            String hexadecimal = "";

            System.out.println("Converting the Decimal Value " + Arg1 + " to Hex...");

            while (Arg1 != 0) {
                rem = Arg1 % 16;
                hexadecimal = ch[rem] + hexadecimal;
                Arg1 = Arg1 / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input value is not an integer.");
        }
    }
}

