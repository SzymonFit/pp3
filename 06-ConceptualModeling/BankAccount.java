public class BankAccount {

    int accountNumber;
    int creationDate;
    String type;
    int balance = 0;
    String owner;

    public String displayStatus(){
        return "Balance: " + balance;
    }

    public void withdrawMoney(int amount){
        if (balance < amount){
            System.out.println("Error, not enough money.");
        }else {
            if (amount > 500){
                System.out.println("Error, you cannot withdraw more than 500");
            } else {
                balance -= amount;
            }
        }
    
    }

    public void depositMoney(int amount){
        this.balance += amount;
    }

    BankAccount(String owner, int accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Jan", 11);
        b1.displayStatus();
        b1.depositMoney(500);
        System.out.println(b1.displayStatus());
        b1.depositMoney(200);
        System.out.println(b1.displayStatus());
        b1.withdrawMoney(600);
        System.out.println(b1.displayStatus());
        b1.withdrawMoney(500);
        System.out.println(b1.displayStatus());
        b1.withdrawMoney(400);
        System.out.println(b1.displayStatus());

    }

}