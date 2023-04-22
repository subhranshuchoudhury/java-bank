public class Accounts {
    String name;
    String accountNumber;
    private double balance;
    char gender;
    String accountType;
    private String password;
    private boolean isLoaned = false;
    private double loanedAmount;

    // constructor

    Accounts(String name, String accountNumber, double balance, char gender, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.gender = gender;
        this.accountType = accountType;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getBalance

    public String getBalance(String accountNumber, String password) {

        if (password == this.password && accountNumber == this.accountNumber && password != null) {

            return Double.toString(balance);
        } else {
            return "incorrect id or password";
        }
    }

    // setBalance

    public void setBalance(double balance, String accountNumber, String password) {
        if (accountNumber == this.accountNumber && password == this.password) {

            this.balance = balance;
            System.out.println("balance updated");
        } else {
            System.out.println("wrong account number & password");

        }
    }

    // check loan

    public String checkLoan() {
        if (isLoaned)
            return Double.toString(loanedAmount);
        else
            return "no loan found on this account";
    }

    // get loan

    public void getLoan(double loanedAmount) {
        if (!isLoaned) {
            this.loanedAmount = loanedAmount;
            this.balance += loanedAmount;
            this.isLoaned = true;
        } else {
            System.out.println("unsuccessful!, you are already in a loan.");
            System.out.println("your loan amount: " + loanedAmount);
        }
    }

    // pay the loan

    public void payLoan(double money) {
        if (isLoaned) {
            if (money == loanedAmount) {
                System.out.println("payment success. loan has been cleared");
                isLoaned = false;
                loanedAmount = 0;
            } else if (money < loanedAmount) {
                double rest = loanedAmount - money;
                System.out.println("payment success. you have to pay more " + rest);
                loanedAmount -= money;
            } else {
                System.out.println("given amount is greater than your loan. rest money will adjusted to your account.");
                isLoaned = false;
                money -= loanedAmount;
                balance += money;
            }
        } else {
            balance += money;
            System.out.println("no previous loan found. money is credited to your account balance");
        }

    }
}
