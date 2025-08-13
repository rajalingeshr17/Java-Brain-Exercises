public class StringWeightCalculator {
    
    public static int calculateStringWeight(String input1, int input2) {
        int totalWeight = 0;
        input1 = input1.toLowerCase();
        
        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            
            if (!Character.isLetter(c)) {
                continue;
            }

            boolean isVowel = isVowel(c);

            if (input2 == 1 || (input2 == 0 && !isVowel)) {
                totalWeight += (c - 'a' + 1);
            }
        }
        
        return totalWeight;
    }
    
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculateStringWeight("Hello World!!", 0));  
        System.out.println(calculateStringWeight("Hello World!!", 1)); 
        System.out.println(calculateStringWeight("Programming", 0)); 
        System.out.println(calculateStringWeight("Programming", 1));
    }

}
