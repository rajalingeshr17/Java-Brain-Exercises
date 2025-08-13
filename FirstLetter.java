class FirstLetter{
    public static void main(String[] args) {
        String str = "hello java world";
String[] words = str.split("\\s");
StringBuilder sb = new StringBuilder();

for (String word : words) {
    sb.append(Character.toUpperCase(word.charAt(0)))
      .append(word.substring(1))
      .append(" ");
}
System.out.println(sb.toString().trim());  // Output: Hello Java World

    }
}