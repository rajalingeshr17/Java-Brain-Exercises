

class FindDay{
    public static void main(String[] args) {
        int[] daysOfMonthLeap={31,29,31,30,31,30,31,31,30,31,30,31};
        int[] daysOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter date");
        // int date=sc.nextInt();
        // System.out.println("Enter Month");
        // int month=sc.nextInt();
        // System.out.println("Enter year");
        // int year=sc.nextInt();
        int date=31;
        int month=8;
        int year=2000;
        // if(year<2089){
        //     System.out.println("Give year between 2001-2089");
        //     return;
        // }
        if(year<0){
            System.out.println("Give proper year");
            return;
        }
        if(month<0 && month>12){
            System.out.println("Give proper month");
            return;
        }
        if(date<0 && date>31){
            System.out.println("Give proper date");
            return;
        }
        
        boolean leap=(year%4!=0)?false:true;
        if(!leap){
            if(daysOfMonth[month-1]<date){
                System.out.println("Incorrect date for this month");
                return;
            }
        }else{
            if(daysOfMonthLeap[month-1]<date){
                System.out.println("Incorrect date for this month");
                return;
            }
        }
        int yearsValue=(year/1000)*1000;
        int res1=0;
        if(yearsValue%400==0) {
            res1=0;
        }else if(yearsValue%300==0){
            res1=1;
        }else if(yearsValue%200==0){
            res1=3;
        }else if(yearsValue%300==0){
            res1=5;
        }
        int sample=(year/100)%10;
        int samp=0;
        if(sample==0){
            samp=year%100;
            System.out.println(samp);
        }else{
            samp=year%1000;
            System.out.println(samp);
        }
        int yearsHundred=samp-1;
        System.out.println(yearsHundred);
        if(yearsHundred==-1){
            yearsHundred=0;
        }
        int leapCount=yearsHundred/4;
        int remainingCount=yearsHundred-leapCount;
        int countSum=remainingCount+(leapCount*2);
        int res2=countSum%7;
        int daysSum=0;
        int res3=0;
        if(year%4==0){
            for (int idx = 0; idx < month-1; idx++) {
                daysSum+=daysOfMonthLeap[idx];
            }
            daysSum+=date;
            res3=daysSum%7;
            
        }else{
            for (int idx = 0; idx < month-1; idx++) {
                daysSum+=daysOfMonth[idx];
            }
            daysSum+=date;
            res3=daysSum%7;
        }
        int res=res1+res2+res3;
        if(res>6){
            res-=7;
            System.out.println(days[res]);
        }else{
            System.out.println(days[res]);
        }
        
    }
}