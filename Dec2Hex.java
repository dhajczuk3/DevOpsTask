package com.example.conversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Dec2Hex {
    private static final Logger logger = LoggerFactory.getLogger(Dec2Hex.class);
    private static final char[] DIGIT_TO_HEX_MAPPING = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static final int HEX_BASE = 16;

    public static void main(String[] args) {
        if (args.length < 1) {
            logger.error("Error: No input provided.");
            return;
        }

        try {
            int decimalNumber = Integer.parseInt(args[0]);
            StringBuilder hexadecimal = new StringBuilder();
            logger.info("Converting the Decimal Value {} to Hex...", decimalNumber);

            while (decimalNumber != 0) {
                int remainder = decimalNumber % HEX_BASE;
                hexadecimal.insert(0, DIGIT_TO_HEX_MAPPING[remainder]);
                decimalNumber = decimalNumber / HEX_BASE;
            }

            logger.info("Hexadecimal representation is: {}", hexadecimal);
        } catch (NumberFormatException e) {
            logger.error("Error: The input value is not an integer.");
        }
    }
}

