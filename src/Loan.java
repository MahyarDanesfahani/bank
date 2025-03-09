import java.util.Scanner;

public class Loan {
    public static void Introduction() {
        System.out.println("What loan are you considering ? (please enter the number)");
        System.out.println("\n1_Education");
        System.out.println("\n2_Housing");
        System.out.println("\n3_Purchasing");
        System.out.println("\n4_Industrial");
        System.out.println("\n5_Marriage");
        System.out.println("\n6_Therapy");
        Scanner scanner = new Scanner(System.in);
        byte anwser = scanner.nextByte();
        switch (anwser) {
            case 1:
                Education();
                break;
            case 2:
                Housing();
                break;
            case 3:
                Purchasing();
                break;
            case 4:
                Industrial();
                break;
            case 5:
                Marriage();
                break;
            case 6:
                Therapy();
                break;
        }
    }

    public static double installmentCalculation(int Loan, int Interest, int numberMonths) {
        double monthlyInstallment = (int) (Loan * (Interest / 1200) * (Math.pow((1200 / Interest), numberMonths) + 1) / (1 - Math.pow(((1200 / Interest) - 1), numberMonths)));
        return monthlyInstallment;
    }

    public static void Guarantor(int loan){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First guarantor : ");
        Accountopening.letterIntroduction();
        System.out.println(" Amount of promissory note or check of guarantor ? ");
        int guarantor = scanner.nextInt();
        if (loan > guarantor ){
            System.out.println("Unfortunately, the guarantor's amount is less than the loan amount received.");
        }
    }

    public static void Education() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much capital do you have in your bank account? (Real)");
        int Capital = scanner.nextInt();
        System.out.println("Please enter your requested amount : (toman) \n" +
                "\n" +
                "****Please note that you can only borrow up to 10% of your capital****");
        int Loan = scanner.nextInt();
        int Interest = 12 / 100;
        if (Loan > 50 - 000 - 000) {
            System.out.println(" Error: The maximum allowed limit for receiving a student loan is : 50-000-000 toman ");
        }
        Guarantor(Loan);
        System.out.println("Number of months to pay : ");
        int month = scanner.nextInt();
        System.out.println("Your monthly installment is this amount : " + installmentCalculation(Loan, Interest, month));
    }
    public static void Housing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much capital do you have in your bank account? (Real)");
        int Capital = scanner.nextInt();
        System.out.println("Please enter your requested amount : (toman) \n" +
                "\n" +
                "****Please note that you can only borrow up to 10% of your capital****");
        int Loan = scanner.nextInt();
        int Interest = 18 / 100;
        if (Loan > 500 - 000 - 000) {
            System.out.println(" Error: The maximum allowed limit for receiving a student loan is : 50-000-000 toman ");
        }
        Guarantor(Loan);
        System.out.println("Number of months to pay : ");
        int month = scanner.nextInt();
        System.out.println("Your monthly installment is this amount : " + installmentCalculation(Loan, Interest, month));
    }
    public static void Purchasing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much capital do you have in your bank account? (Real)");
        int Capital = scanner.nextInt();
        System.out.println("Please enter your requested amount : (toman) \n" +
                "\n" +
                "****Please note that you can only borrow up to 10% of your capital****");
        int Loan = scanner.nextInt();
        int Interest = 18 / 100;
        if (Loan > 300 - 000 - 000) {
            System.out.println(" Error: The maximum allowed limit for receiving a student loan is : 50-000-000 toman ");
        }
        Guarantor(Loan);
        System.out.println("Number of months to pay : ");
        int month = scanner.nextInt();
        System.out.println("Your monthly installment is this amount : " + installmentCalculation(Loan, Interest, month));
    }
    public static void Industrial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much capital do you have in your bank account? (Real)");
        int Capital = scanner.nextInt();
        System.out.println("Please enter your requested amount : (toman) \n" +
                "\n" +
                "****Please note that you can only borrow up to 10% of your capital****");
        int Loan = scanner.nextInt();
        int Interest = 24 / 100;
        if (Loan > 3-000 - 000 - 000) {
            System.out.println(" Error: The maximum allowed limit for receiving a student loan is : 50-000-000 toman ");
        }
        Guarantor(Loan);
        System.out.println("Number of months to pay : ");
        int month = scanner.nextInt();
        System.out.println("Your monthly installment is this amount : " + installmentCalculation(Loan, Interest, month));
    }
    public static void Marriage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much capital do you have in your bank account? (Real)");
        int Capital = scanner.nextInt();
        System.out.println("Please enter your requested amount : (toman) \n" +
                "\n" +
                "****Please note that you can only borrow up to 10% of your capital****");
        int Loan = scanner.nextInt();
        int Interest = 18 / 100;
        if (Loan > 200 - 000 - 000) {
            System.out.println(" Error: The maximum allowed limit for receiving a student loan is : 50-000-000 toman ");
        }
        Guarantor(Loan);
        System.out.println("Number of months to pay : ");
        int month = scanner.nextInt();
        System.out.println("Your monthly installment is this amount : " + installmentCalculation(Loan, Interest, month));
    }
    public static void Therapy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much capital do you have in your bank account? (Real)");
        int Capital = scanner.nextInt();
        System.out.println("Please enter your requested amount : (toman) \n" +
                "\n" +
                "****Please note that you can only borrow up to 10% of your capital****");
        int Loan = scanner.nextInt();
        int Interest = 12 / 100;
        if (Loan > 200 - 000 - 000) {
            System.out.println(" Error: The maximum allowed limit for receiving a student loan is : 50-000-000 toman ");
        }
        Guarantor(Loan);
        System.out.println("Number of months to pay : ");
        int month = scanner.nextInt();
        System.out.println("Your monthly installment is this amount : " + installmentCalculation(Loan, Interest, month));
    }
}

