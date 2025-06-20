import java.util.*;
public class atmmain{
    public static void main(String [] args){
      atminterface in = new atmimplements();
        int atmnumber =12345;
        int atmpin=123;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Atm number: ");
        int number = sc.nextInt();
        System.out.print("Enter the Atm pin: ");
        int pin = sc.nextInt(); 
          if(number == atmnumber && pin ==atmpin){     
                while(true){
                    System.out.println("1.View balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statements\n5.Exit");
                    System.out.print("Enter the choice: ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                          in.viewBalance();
                          break;
                        case 2:
                          System.out.print("Enter the withdraw Amount: ");
                          Double amount =sc.nextDouble();
                          in.withdrawAmount(amount); 
                          break;

                        case 3:
                          System.out.println("Enter the deposit Amount: ");
                          Double deposit = sc.nextDouble();
                          in.depositAmount(deposit);
                          break;
                        case 4:
                          in.viewMiniStatement();
                          break;
                        case 5:
                            System.out.println("Thankyou , Have a nice day!");
                            System.exit(0);
                    }

            }

          }
          else{
            System.out.println("Enter the Correct login credentials!");
          }
    }
}