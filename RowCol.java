class RowCol{
    public static void main(String[] args) {
        String str="beninraj".replace(" ","");
        int strLen=str.length();
        double sqRow=Math.sqrt(strLen);
        int row =(int) sqRow;
        int col =row+1;        
        if(row<3){
            row=3;
        } 
        for(int i=0;i<strLen;i+=row){
            if(col+i<strLen){
                for(int j=col+i;j<strLen-1;j++){
                    str+=" ";
                }
            }
            String subStr=str.substring(i, col+i);            
            System.out.println(subStr);
        } 
    }
}