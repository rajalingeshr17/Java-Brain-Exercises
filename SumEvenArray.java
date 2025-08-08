class SumEvenArray{
    public static void main(String[] args) {
        int evenSum=0;
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        for(int i:arr){
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
        }
        System.out.println(evenSum);
    }
}