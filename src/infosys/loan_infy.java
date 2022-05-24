package infosys;

import java.util.Scanner;

public class loan_infy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the account number:");
        int accNumber = s.nextInt();

        if(Integer.parseInt(Integer.toString(accNumber).substring(0,1)) == 1) {

            System.out.print("Enter salary:");
            int salary = s.nextInt();
            System.out.print("Enter account balance:");
            int accBalance = s.nextInt();

            if (accBalance >= 1000) {

                System.out.print("Enter loan type:");
                String loan = s.next();
                System.out.print("Enter expected loan amount:");
                long loanExpected = s.nextInt();
                System.out.print("Enter expected no.of EMI's:");
                int emiExpected = s.nextInt();

                if (salary < 25000) {
                    System.out.println("Not eligible for any loan!");
                }
                else{
                    if (loan.equals("Car")) {
                        if (loanExpected < 500000 && emiExpected < 36)
                            System.out.println("Eligible loan amount:500000\nEligible EMI:36");
                        else
                            System.out.println("loan not possible!");
                    }
                    else if (loan.equals("House")) {
                        if(salary<50000){
                            System.out.println("Not eligible for loan!");
                        }
                        else{
                            if(loanExpected < 600000 && emiExpected < 60)
                                System.out.println("Eligible loan amount:6000000\nEligible EMI:60");
                            else
                                System.out.println("Not eligible for loan");
                        }
                    }
                    else if (loan.equals("Business")) {
                        if(salary<75000){
                            System.out.println("Not eligible for loan!");
                        }
                        else{
                            if(loanExpected < 7500000 && emiExpected < 84)
                                System.out.println("Eligible loan amount:7500000\nEligible EMI:84");
                            else
                                System.out.println("Not eligible for loan");
                        }
                    }
                }
            }
            else {
                System.out.println("No minimum Account Balance!!");
            }
        }
        else {
            System.out.println("Invalid Account number!!");
        }
    }
}
