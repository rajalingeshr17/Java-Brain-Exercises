class Consanants{
    public static void main(String[] args) {
        int vowels = 0, consonants = 0;
String str = "Hello World";

for (char c : str.toLowerCase().toCharArray()) {
    if (Character.isLetter(c)) {
        System.out.println("aeiou".indexOf(c));
        if ("aeiou".indexOf(c) != -1) vowels++;
        else consonants++;
    }
}
System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

    }
}