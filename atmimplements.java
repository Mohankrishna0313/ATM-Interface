import java.util.*;
public class atmimplements implements atminterface{
    Map<Double,String> hash = new HashMap<>();
    atmcls atm = new atmcls();
    public void viewBalance(){
        System.out.println("Avaliable balance : "+atm.getbalance());
    }
    public void depositAmount(double depositAmount){
        hash.put(depositAmount,"Amount Deposited!");
        System.out.println( depositAmount+" - Deposited");
        atm.setbalance(atm.getbalance()+depositAmount);
        viewBalance();
    }
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount <= atm.getbalance()){
            hash.put(withdrawAmount,"Amount Withdrawed!");
            atm.setbalance(atm.getbalance()-withdrawAmount);
            viewBalance();
        }
        else{
            System.err.println("Insuffienct Balance.");
        }
        
    }
    public void viewMiniStatement(){
        for(Map.Entry<Double,String> m:hash.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        viewBalance();
    }
    
} 