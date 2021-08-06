package exer2;

/**
 * @author Gujm
 * @date 2021/8/2 5:54 下午
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annualInterestRate;
    }

    public void setAnnuallnterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
         return annualInterestRate / 12;
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("取钱失败");
        }else{
            balance -= amount;
        }
    }
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("存钱失败");
        }else{
            balance += amount;
        }
    }
}
