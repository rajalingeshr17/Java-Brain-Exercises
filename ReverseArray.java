class ReverseArray{
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int[] rev=new int[10];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            System.out.println(rev[j]);
            j++;
        }
    }
}