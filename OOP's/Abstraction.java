//Example for Abstraction
abstract class Bankaccount {
    double balance;

    abstract void addMoney(double amount);

    abstract void CanUserwithdrawMoney(double amount);

    void updateBalance(double _balance) {
        balance = _balance;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Bankaccount {
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount); 
    }

    public void CanUserwithdrawMoney(double amount) {
        if(amount <= getBalance()){
            System.out.println("User Can");
        }else{
            System.out.println("User Cannot");
        }

    }
}

class CurrentAccount extends Bankaccount {
    double minimumLimit = 1000.0;

    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);

    }

    public void CanUserwithdrawMoney(double amount) {
       if(super.getBalance() - amount <= minimumLimit){
        System.out.println("User Can");
       }else{
        System.out.println("User Cannot");
       }
    }

}

class Abstraction {
    public static void main(String args[]) {

    }
}
