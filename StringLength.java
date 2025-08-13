class StringLength{
    public static void main(String[] args) {
        String str="Raja Lingesh";
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            count++;
        }
        System.out.println(count);
    }
}