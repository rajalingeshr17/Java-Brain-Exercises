
import java.util.ArrayList;
import java.util.List;

class Frequency{
    public static void main(String[] args) {
        String str="aagash";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char c=str.charAt(i);
            
            if(list.contains(c)){
                continue;
            }else{
                count++;
                for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j)==c){
                    count++;
                }
            }
            }
            
            System.out.println(c+" "+count);
            list.add(c);
        }
    }
}