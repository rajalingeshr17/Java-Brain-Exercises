class LCMGCD{
    public static void main(String[] args) {
        int a = 12, b = 17;

// GCD using Euclidean algorithm
int x = a, y = b;
while (y != 0) {
    int temp = y;
    y = x % y;
    x = temp;
}
int gcd = x;
int lcm = (a * b) / gcd;

System.out.println("GCD = " + gcd + ", LCM = " + lcm);

    }
}