package homework6;

public class UserChecking {
    public static void main(String[] args){
        User user = new User();
        User user1 = new User("Ivan");
        System.out.println("1 User name: " + user1.getUserName());
        user1.setAge(19);
        if(user1.isActive) {
            System.out.println("Age: " + user1.getAge());
            user1.setPassword("123456789");
            user1.amountSpentMoney = 2;
            user1.purchasePrice = 10;
            user1.makePurchase();
            user1.printTotalAmountOfSpentMoney();
        }
        User user2 = new User("Kate","123456789");
        System.out.println("2 User name: " + user2.getUserName());
        user2.setAge(39);
        if(user2.isActive) {
            System.out.println("Age: " + user2.getAge());
            user2.setPassword("123456789");
            user2.amountSpentMoney = 34.5;
            user2.purchasePrice = 5.5;
            user2.makePurchase();
            user2.printTotalAmountOfSpentMoney();
        }
    }
}
