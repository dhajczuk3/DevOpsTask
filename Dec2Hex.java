class Dec2Hex {
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length < 1) {
            System.err.println("Error: No input provided.");
            return; // Exit the program
        }
        try {
            int decimalNumber = Integer.parseInt(args[0]);
            char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder hexadecimal = new StringBuilder();
            System.out.println("Converting the Decimal Value " + decimalNumber + " to Hex...");

            while (decimalNumber != 0) {
                int remainder = decimalNumber % 16;
                hexadecimal.insert(0, hexDigits[remainder]);
                decimalNumber = decimalNumber / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.err.println("Error: The input value is not an integer.");
        }
    }
}


