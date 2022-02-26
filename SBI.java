import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SBI extends Bank{
    void getdetails(String name,String B_name,double roi){
        Name=name;
        Branch_name=B_name;
        R_O_I=roi;
    }
    void printdetails(String name,String B_name,double roi)
    {
    	System.out.println();
    	System.out.println("**********"+name  +"***********");
        System.out.println("Branch name is: "+B_name +".");  
        System.out.println("It provides the Rate of Interest of "+roi +"%" );
    }
    void account(int acc_no,double amt,double amt_withdrawn ){
        int k=0;
        try{
            if(amt<amt_withdrawn){
                throw new InsufficientAmountException();
            }
        }
        catch(InsufficientAmountException e){
            k=-1;
            System.out.println(e.getMessage());
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        try{
            FileWriter my=new FileWriter("TransactionDetailsBOI.txt");
            my.write("The account number is:"+acc_no +"\n");
            my.write("The amount in the account :"+amt+"\n");
            my.write("The amount withdrawn is :"+amt_withdrawn+"\n");
            if(k==0){
                my.write("The available amount in the account is :"+(amt-amt_withdrawn)+"\n");
                my.write("Transaction successful"+"\n");
                my.write("Transaction time  and date:"+now+"\n");
            }
            else
                my.write("Transaction cancelled");
               my.close();
        }
        catch(IOException e){
            System.out.println("An error occured");
        }
    }
}