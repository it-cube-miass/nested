package inner;

public class Account {
    private double amount;
    private String number;
    private String owner;

    public Account(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public double withdraw(double value) {
        amount -= value;
        return value;
    }

    public class Card {
        private String number;

        public Card(String number) {
            this.number = number;
        }

        public double withdraw(double value) {
            return Account.this.withdraw(value);
        }
    }
}
