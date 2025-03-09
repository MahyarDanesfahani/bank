import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome the national bank");
        System.out.println("\nPlease select your service from the list below." + "\n----------------");
        System.out.println("1_Account Opening\n" +
                "2_Balance Request\n" +
                "3_Receipt Request (Deposit/Withdrawal)\n" +
                "4_Check Cashing Request\n" +
                "5_Loan Request\n" +
                "6_Checkbook Request");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();
        switch (a){
            case 1:
                Accountopening.Introduction();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Loan.Introduction();
                break;
            case 6:
                break;
        }
    }
}