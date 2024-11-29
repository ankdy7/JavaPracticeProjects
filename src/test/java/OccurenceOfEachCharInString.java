public class OccurenceOfEachCharInString {
    public static void main(String[] args) {
        String input = "abbbcadeeaaaacccbbbbeeee";
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String str) {
        int length = str.length();
        boolean[] counted = new boolean[length];

        for (int i = 0; i < length; i++) {
            // Skip if the character has already been counted
            if (counted[i]) {
                continue;
            }

            char currentChar = str.charAt(i);
            int count = 0;

            // Count occurrences of currentChar
            for (int j = 0; j < length; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                    counted[j] = true; // Mark this character as counted
                }
            }

            // Output the count if it's greater than 0
            if (count > 0) {
                System.out.print(currentChar + "" + count);
            }
        }
    }
}
