import java.util.Scanner;
public class Banking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=5000;
        int amount=0;
        boolean flag=true;
        while(flag){

            System.out.println("1.CHECK BANK BALANCE");
            System.out.println("2.DEPOSITE MONEY");
            System.out.println("3.WITHDRAW MONEY");
            System.out.println("4.EXIT");
            int num=sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Your current balance is:"+balance);
                    break;
                case 2:
                    System.out.println("Enter your amount of deposition");
                    amount =sc.nextInt();
                    balance+=amount;
                    System.out.print(balance);
                    break;
                case 3:
                    System.out.println("Enter the withdrawal amount");
                    amount =sc.nextInt();
                    if(amount<=balance){
                        balance-=amount;
                        System.out.print(balance);
                    }
                    else{
                        System.out.println("Amount insufficient");
                    }
                    break;

                case 4:
                    System.out.println("Thank You For Banking With Us");
                    flag=false;
                    break;
                 default:
                    System.out.println("invalid number");
            }                    
        }

    }
}