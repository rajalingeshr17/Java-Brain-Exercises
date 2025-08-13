class LongestWord{
    public static void main(String[] args) {
        String str="Areoplane flying in the big sky is wonderfull ";
        String[] arr=str.split(" ");
        int maxInd=0;
        for (int idx = 1; idx < arr.length; idx++) {
            if(arr[maxInd].length()<arr[idx].length()){
                maxInd=idx;
            }
            
        }
        System.out.println(arr[maxInd]);
        String newStr=str.trim().replace(" ", "-");
        System.out.println(newStr);


int total = 0;
for (int a = 'a'; a <= 'z'; a++) {
    int pos = a - 'a' + 1;
    total += pos;
}
System.out.println("Total: " + total);
int a='a';
System.out.println(a);
    }
}