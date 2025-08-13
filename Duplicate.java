class Duplicate{
    public static void main(String[] args) {
        String input = "harinipriya";
        StringBuilder result = new StringBuilder();

for (int i = 0; i < input.length(); i++) {
    char ch = input.charAt(i);
    if (result.indexOf(String.valueOf(ch)) == -1) {
        result.append(ch);
    }
}
System.out.println(result);  // Output: "progamin"

    }
}