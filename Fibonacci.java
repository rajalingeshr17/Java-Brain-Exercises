class Fibonacci{
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
System.out.println(a + " " + b);

for (int i = 2; i < n; i++) {
    int next = a + b;
    System.out.println(" " + next);
    a = b;
    b = next;
}

    }
}