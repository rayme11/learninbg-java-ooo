package Chapter2_OOO_FinalExercise;

public class BankAccount {

   TypeOfCard typeOfCard;
   String nameOnCard;

    public BankAccount(TypeOfCard typeOfCard, String nameOnCard) {
        this.typeOfCard = typeOfCard;
        this.nameOnCard = nameOnCard;
    }

    double deposit;
   double balance;
   double withdrawal;

    public double getWithdrawal() {
        return withdrawal;
    }

    public TypeOfCard getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(TypeOfCard typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
        this.balance += deposit;
    }

    public double getBalance() {
        return balance;
    }


    public boolean setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;

        if (this.balance > withdrawal){
            this.balance -= withdrawal;
            return true;
        }
        else{
            return false;
        }
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
}
