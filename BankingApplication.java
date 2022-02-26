import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankingApplication {
	public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SBI ob=new SBI();
        BOI ob1=new BOI();
        ICICI ob2=new ICICI();

        ob.getdetails("SBI","Lucknow Branch",6);
        ob.printdetails("SBI","Lucknow Branch",6);
        ob.account(1800101001,1800,80);

        ob1.getdetails("BOI","Bombay Branch",8);
        ob1.printdetails("BOI","BombayBranch",8);
        ob1.account(1400101001,1800,180000);

        ob2.getdetails("ICICI","Hyderabad Branch",7);
        ob2.printdetails("ICICI","Hyderabad Branch",7);
        ob2.account(1300302001,500,70);




    }
}
