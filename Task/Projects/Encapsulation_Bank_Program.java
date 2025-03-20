class Account {
    private String name;
    private int accno;
    private float amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

class BankOperations {
    void deposit(Account acc, int deposit_amt) {
        float total = acc.getAmount() + deposit_amt;
        acc.setAmount(total);
    }

    void withdraw(Account acc, int withdraw_amt) {
        float total = acc.getAmount() - withdraw_amt;
        acc.setAmount(total);
    }
}

public class Encapsulation_Bank_Program {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Deepak");
        acc.setAccno(1111);
        acc.setAmount(100000);

        BankOperations bo = new BankOperations();
        bo.deposit(acc, 5000);
        System.out.println("New Balance After Deposit Amount Is : " + acc.getAmount());

        bo.withdraw(acc, 25000);
        System.out.println("New Balance After Withdraw Amount Is : " + acc.getAmount());
    }
}
