package ba.unsa.etf.rpr.project;

public class Employee {
    private Account account;

    public Employee(Account account) {
        this.account = account;
    }
    public void changePassword(String newPassword) throws IllegalAccount {
        account.setPassword(newPassword);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
