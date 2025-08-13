

class Student{
    public static void main(String[] args) {
        int count=0;
        String str1="DADAD";
        String str2="DAD";
        int str2Len=str2.length();
        for (int i = 0; i < str1.length()-1; i++) {
            if(str1.length()>=str2Len+i){
                String compStr=str1.substring(i,str2Len+i);
                System.out.println(compStr+"-"+str2);
                if(compStr.equals(str2)){
                     count++;
                     }   
                     }
        }
        for (int i = 0; i < str1.length()-1; i++){
            if(str1.length()>=str2Len+i){
            String compStr=str1.substring(i,str2Len+i);
            String reversed=new StringBuilder(compStr).reverse().toString();
            System.err.println(compStr+"-"+str2);
            if(reversed.equals(str2)){
                count++;
            } 
            }
        }
        System.out.println(count);
    }
}