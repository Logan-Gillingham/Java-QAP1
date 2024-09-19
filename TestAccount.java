public class TestAccount {
    public static void main(String[] args) {

        Account acc1 = new Account("ACC1", "Account 1", 5000);
        Account acc2 = new Account("ACC2", "Account 2", 4000);

        System.out.println("Initial balances:");
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        
        int transferredAmount = acc1.transferTo(acc2, 1000);
        System.out.println("Transferred $" + transferredAmount + " from " + acc1.getName() + " to " + acc2.getName());

        System.out.println("\nFinal balances:");
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}