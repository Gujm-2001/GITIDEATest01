package exer2;

/**
 * @author Gujm
 * @date 2021/8/2 6:44 下午
 */
public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            super.withdraw(amount);
        } else if (amount - getBalance() <= overdraft) {
            overdraft -=   (amount - getBalance());
            setBalance(0.0);
        } else{
            System.out.println("超过可透支限额");
        }
    }

    public double getOverdraft() {
        return overdraft;
    }
}

