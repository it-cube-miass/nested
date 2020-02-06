package inner;

public class Card {
    private String number;
    private Account account;

    public Card(String number, Account account) {
        this.number = number;
        this.account = account;
    }

    public double withdraw(double value) {
        return account.withdraw(value);
    }
}
