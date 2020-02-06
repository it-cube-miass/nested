package inner;

public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account("Big Mazzy", "e89b-12d3-a456");
        Card myCard = new Card("1034-9383-3948-3498", myAccount);

        myCard.withdraw(-1000);
        System.out.println(myAccount.getAmount());
    }
}
