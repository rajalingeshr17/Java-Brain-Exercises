class ReplaceVowel {
    public static void main(String[] args) {
        String str = "rajalingesh";
        String replaced = str.replaceAll("[aeiou]", "*");
        System.out.println(replaced);
    }
}