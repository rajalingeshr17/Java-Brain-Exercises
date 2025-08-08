class Palindrome{
    public static boolean isPalindrome(String s) {
    s = s.toLowerCase().replaceAll("[^a-z]", "");
    return s.equals(new StringBuilder(s).reverse().toString());
}

public static boolean isPalindrome2(String str) {
    int left = 0, right = str.length() - 1;
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(isPalindrome("raja"));
    System.out.println(isPalindrome2("aja"));
}
}