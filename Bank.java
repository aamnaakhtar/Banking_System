import java.io.IOException;
import java.io.*;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.FileWriter;


class Bank{

    String Name;
    String Branch_name;
    double R_O_I;

    enum type{
        SAVING,CURRENT;
    }
}


class InsufficientAmountException extends Exception{

    InsufficientAmountException(){
        super("Insufficient Balance to withdraw this amount");
    }

}













