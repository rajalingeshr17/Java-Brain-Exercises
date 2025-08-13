class  SortArray{
    public static void main(String[] args) {
        int[] arr={6,2,5,1,3,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
              if(arr[i]<arr[j]){
                int min=arr[j];
                arr[j]=arr[i];
                arr[i]=min;
              }  
                
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            int elem = arr[idx];
            System.out.println(elem);
        }
    }
}