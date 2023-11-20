import java.util.logging.Logger;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args) {
        if (args.length < 1) {
            logger.severe("Error: No input provided.");
            return;
        }
        try {
            int decimalNumber = Integer.parseInt(args[0]);
        if (decimalNumber < 0) {
            logger.severe("Error: The input value is negative. Please provide a non-negative integer.");
            return;
        }
            char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder hexadecimal = new StringBuilder();
            logger.info("Converting the Decimal Value " + decimalNumber + " to Hex...");

            while (decimalNumber != 0) {
                int remainder = decimalNumber % 16;
                hexadecimal.insert(0, hexDigits[remainder]);
                decimalNumber = decimalNumber / 16;
            }

            logger.info("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            logger.severe("Error: The input value is not an integer.");
        }
    }
}

