class SecondLargest{
    public static void main(String[] args) {
        int largest = 0;
        int second =0;
        int[] arr={9,3,5,1,6,4};

for (int num : arr) {
    if (num > largest) {
        second = largest;
        largest = num;
    } else if (num > second && num != largest) {
        second = num;
    }
}
System.out.println("Second Largest: " + second);

    }
}