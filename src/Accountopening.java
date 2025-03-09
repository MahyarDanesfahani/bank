import java.util.Scanner;

public class Accountopening {
    public static void Introduction(){
        System.out.println("Please select one of the following : (enter the number)");
        System.out.println("\n1_Current Account");
        System.out.println("\n2_Short Term");
        System.out.println("\n3_Deposit");
        Scanner scanner = new Scanner(System.in);
        int anwser = scanner.nextByte();
        switch (anwser){
            case 1:
                letterIntroduction();
                Account();
                break;
            case 2:
                letterIntroduction();
                shortTerm();
                break;
            case 3:
                letterIntroduction();
                deposit();
                break;
        }
    }
    public static void letterIntroduction(){
        System.out.println("Please complete the following in order (Press Enter at the end of each section):\n" +
                "1_First name\n" +
                "2_Last name\n" +
                "3-Telephone number\n" +
                "4_Educational certificate\n" +
                "5_Date of birth\n" +
                "6_National ID number\n" +
                "7_Marital status\n" +
                "8_Residence\n" +
                "9_Residence number\n" +
                "10_Residence phone number\n" +
                "11_Occupation\n" +
                "12_Workplace\n" +
                "13_Work phone number");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        int phoneNumber = scanner.nextInt();
        String Educational = scanner.nextLine();
        int birthday = scanner.nextInt();
        int nationalId = scanner.nextInt();
        String marital = scanner.nextLine();
        String residence = scanner.nextLine();
        int residenceNumber = scanner.nextInt();
        int residencePhone = scanner.nextInt();
        String occupation = scanner.nextLine();
        String workPlace = scanner.nextLine();
        int workPhone = scanner.nextInt();
    }
    public static void Account(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("A checking account will be opened for you.");
        System.out.println("\nPlease provide an amount as an account opening fee : ");
        int opening = scanner.nextInt();
        System.out.println("Your account information");
        int digits = 4;
        int min = (int) Math.pow(10, digits - 1);
        int max = (int) Math.pow(10, digits) - 1;
        int randomNum = min + (int) (Math.random() * (max - min + 1));
        System.out.println(randomNum);
        System.out.println("Card Number : " + randomNum +"-"+ randomNum +"-" + randomNum + "-" + randomNum);
        System.out.println("Account Number : " + randomNum +"-"+randomNum);
        System.out.println("Expiration Date : \\(2030/12/12\\) " );
        System.out.println("CCV2 : " + randomNum);
        System.out.println("Primary Password : " + randomNum);
    }
    public static void shortTerm(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("A checking account will be opened for you.");
        System.out.println("\nPlease provide an amount as an account opening fee : ");
        int opening = scanner.nextInt();
        System.out.println("Short Account Duration");
        int time = scanner.nextInt();
        System.out.println("Interest per Month Without Withdrawal : " + 1200/18 + "Toman" );
        System.out.println("Your account information : " + 1200/12 + "Toman" );
        int digits = 4;
        int min = (int) Math.pow(10, digits - 1);
        int max = (int) Math.pow(10, digits) - 1;
        int randomNum = min + (int) (Math.random() * (max - min + 1));
        System.out.println(randomNum);
        System.out.println("Card Number : " + randomNum +"-"+ randomNum +"-" + randomNum + "-" + randomNum);
        System.out.println("Account Number : " + randomNum +"-"+randomNum);
        System.out.println("Expiration Date : \\(2030/12/12\\) " );
        System.out.println("CCV2 : " + randomNum);
        System.out.println("Primary Password : " + randomNum);
    }
    public static void deposit(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("A checking account will be opened for you.");
        System.out.println("\nPlease provide an amount as an account opening fee : ");
        int opening = scanner.nextInt();
        System.out.println("Desired deposit amount : ");
        int desired = scanner.nextInt();
        System.out.println("Number of months held : ");
        int month = scanner.nextInt();
        System.out.println("Annual interest : " + ((1200/24)*12)+desired);
        System.out.println("Your account information");
        int digits = 4;
        int min = (int) Math.pow(10, digits - 1);
        int max = (int) Math.pow(10, digits) - 1;
        int randomNum = min + (int) (Math.random() * (max - min + 1));
        System.out.println(randomNum);
        System.out.println("Card Number : " + randomNum +"-"+ randomNum +"-" + randomNum + "-" + randomNum);
        System.out.println("Account Number : " + randomNum +"-"+randomNum);
        System.out.println("Expiration Date : \\(2030/12/12\\) " );
        System.out.println("CCV2 : " + randomNum);
        System.out.println("Primary Password : " + randomNum);
    }
}
