package Activiti6.Payment;

public class Check extends Payment{
    private String name;
    private String bankID;

    public void authorize(){
        System.out.println("Authorizing check...");
    }
}
