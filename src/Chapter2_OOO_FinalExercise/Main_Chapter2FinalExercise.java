package Chapter2_OOO_FinalExercise;

public class Main_Chapter2FinalExercise {

    private static boolean attempWithdrawalForRay;
    private static boolean attempWithdrawalForKaren;

    public static void main(String[] args) {

        BankAccount rayAccount = new BankAccount(TypeOfCard.DEBIT, "Ray");
        BankAccount karenAccount = new BankAccount(TypeOfCard.DEBIT, "Karen");

        System.out.println("The account was set as: " + rayAccount.typeOfCard);
        System.out.println("The account name is: " + rayAccount.getNameOnCard());

        //Calling setter method to set balance
        rayAccount.setDeposit(1000);
        karenAccount.setDeposit(500);

        //Printing Balance
        System.out.println("Balance on the account is: $ " + rayAccount.getBalance());

        //Attempting to withdrawal money
        attempWithdrawalForRay = rayAccount.setWithdrawal(500);
        if (attempWithdrawalForRay){
            System.out.println("The withdrawal of: " + rayAccount.getWithdrawal() + " was successful");
            System.out.println("Your remaining balance is: " + rayAccount.getBalance());
        }

        System.out.println("\n----------------Acting on another account--------------------------");

        attempWithdrawalForKaren = karenAccount.setWithdrawal(501);
        if (attempWithdrawalForRay){
            System.out.println("The withdrawal of " + karenAccount.getWithdrawal() + " was successful");
            System.out.println("Your remaining balance is: " + rayAccount.getBalance());
        }
        else{
            System.out.println("Not enough funds for Karen: " + karenAccount.getBalance());
        }

    }
}
