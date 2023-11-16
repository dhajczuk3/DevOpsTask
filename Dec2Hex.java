package com.example.conversion;

class Dec2Hex {
    public static void main(String args[]) {
        if (args.length < 1) {
            log("Error: No input provided.");
            return;
        }
        try {
            int decimalNumber = Integer.parseInt(args[0]);
            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder hexadecimal = new StringBuilder();
            log("Converting the Decimal Value " + decimalNumber + " to Hex...");
            while (decimalNumber != 0) {
                int rem = decimalNumber % 16;
                hexadecimal.insert(0, ch[rem]);
                decimalNumber = decimalNumber / 16;
            }
            log("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            log("Error: The input value is not an integer.");
        }
    }

    private static void log(String message) {
        System.out.println(message);
    }
}

