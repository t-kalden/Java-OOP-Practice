public class BankAccount {
    private int accountNum;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNum;

    public BankAccount(int accountNum, double balance, String customerName, String email, int phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public BankAccount() {
        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double deposit(double dep){
        return balance+= dep;
    }
    public double withdraw(double withdraw) {
        boolean invalid = (withdraw > balance) ? true : false;

        if(invalid) {
            System.out.println("Insufficient Funds. Your balace of $" + balance +
                    " is less than the withdrawal amount of $" +withdraw);
            return balance;
        } else {
            return balance - withdraw;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNum=" + accountNum +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
