package Section7OOP;

public class Challenge {
    public static void main(String[] args) {
        Account leszekAccount = new Account("12345", 1000.00, "Leszek Michalski",
                "myemail@leszek,com", "121-231-1234");

        System.out.println(leszekAccount.getAccountNumber());
        System.out.println(leszekAccount.getBalance());

        leszekAccount.withdrawnFunds(100.0);
        leszekAccount.depositFounds(250);
        leszekAccount.withdrawnFunds(50);
        leszekAccount.withdrawnFunds(200);
        leszekAccount.depositFounds(100);
        leszekAccount.withdrawnFunds(45.55);
        leszekAccount.withdrawnFunds(54.46);
        leszekAccount.withdrawnFunds(54.45);

        Account gosiaAccount = new Account("Gosia", "gosi@email.com", "1244");
        System.out.println("AccountNo: " + gosiaAccount.getAccountNumber() + "; name " + gosiaAccount.getCustomerName());
    }
}
