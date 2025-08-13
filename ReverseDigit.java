class ReverseDigit{
    public static void main(String[] args) {
        int num = 12345;
        String str=String.valueOf(num);
        String reversed="";
        for (int i = str.length()-1; i>=0; i--) {
            reversed+=str.charAt(i);
        }
        int num1=Integer.parseInt(reversed);
        System.out.println(num1);
    }

    public static void rev(){
        int num = 12345;
int reverse = 0;

while (num != 0) {
    int digit = num % 10;
    reverse = reverse * 10 + digit;
    num = num / 10;
}
System.out.println("Reverse: " + reverse);


    }
}
