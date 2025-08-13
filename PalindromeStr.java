class PalindromeStr{
    public static void main(String[] args) {
        String str = "malayalam";
boolean isPalin = true;

for (int i = 0; i < str.length() / 2; i++) {
    System.out.println(str.charAt(i) +"-"+str.charAt(str.length() - 1-i));
    if (str.charAt(i) != str.charAt(str.length() - 1-i)) {
        isPalin = false;
        break;
    }
}
System.out.println(isPalin ? "Palindrome" : "Not a palindrome");

    }
}