
import java.util.Scanner;

class Assistant{
    final int limit=5;
    static int counter=0;
    private int time=0;
    static String taskName="";
 
     void addTask(String task,int time){
        taskName=task;
        this.time=time;
        counter++;
    }
    

    void addTask(String task){
        taskName=task;
        counter++;
    } 
    void getSummary(){
        System.out.println("No of task inserted:"+counter);
        System.out.println("Fetched task:"+taskName);

    }

    void getTask(int i){
        System.out.println("Fetched task:"+taskName+" Time limit:"+time);
    }
    
}

class SmartAssistant extends Assistant{
    private String userName="";
    int limiter=super.limit;

    public SmartAssistant() {
        userName="Guest";
    }
    public SmartAssistant(String userName){
        this.userName=userName;
    }

    void getName(){
        System.out.println("Hello, "+userName+"!");
    }

    void getTask(){
        System.out.println("Fetched task:"+Assistant.taskName);
    }

}

class Hello{
    public static void main(String[] args) {
        System.out.println("Hello I'm your Assistant Ava!");
        boolean exit=true;
        Scanner scan=new Scanner(System.in);
        SmartAssistant sm=new SmartAssistant();
        do { 
            System.out.println("Enter 1 to Add task\nEnter 2 to View task\n Enter 3 to get your Name \nEnter 4 to get Summary\nEnter 5 to exit");
            System.out.println("Enter option:");
            int option =scan.nextInt();
            switch (option) {
                case 1:
                    if(Assistant.counter<sm.limiter){
                        System.out.println(Assistant.counter+"-"+sm.limiter);
                        System.out.println("Enter task:");
                    scan.nextLine();
                    String task=scan.nextLine();
                    System.out.println("Would you like to specify time? \nEnter 1 to Enter time\nEnter any key if no need\n Enter your value:");
                    int needTime=scan.nextInt();
                    if (needTime==1) {
                        System.out.println("Enter time:");
                        int time=scan.nextInt();
                        sm.addTask(task,time);
                    } else {
                        sm.addTask(task);
                    }
                    break;
                    }else{
                        System.out.println("You cannot add more than 5 tasks");
                        break;
                    }
                    
                case 2:
                    System.out.println("Enter 1 to get with time:");
                    int ind=scan.nextInt();
                    if(ind==1){
                        sm.getTask(1);
                        break;
                    }else{
                        sm.getTask();
                        break;
                    }
                case 3:
                    sm.getName();
                    break;
                case 4:
                    sm.getSummary();
                    break;
                case 5:
                    exit=false;
                    break;
                default:
                    if(exit==true){
                        System.out.println("Enter option:");
                    }else{
                        System.out.println("Signing off.. Bye..!");
                    }
            }
        } while (exit);
    }
}