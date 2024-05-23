package Activiti6.Payment;
import java.util.Date;

public class Credit extends Payment{
    private String type;
    private String number;
    private Date expDate;

    public void authorize(){
        System.out.println("Authorizing credit...");
    }
}
