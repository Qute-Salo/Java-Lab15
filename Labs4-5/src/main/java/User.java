enum Subscription {
    FREE, PREMIUM, VIP
}

public class User {
    private String username;
    private Subscription subscription;


    public User(String username, Subscription subscription) {
        this.username = username;
        this.subscription = subscription;
    }

    public String getUsername() { return username; }
    public Subscription getSubscription() { return subscription; }


    public static void main(String[] args) {

        User[] users = {
                new User("alex_99", Subscription.FREE),
                new User("elena_vip", Subscription.VIP),
                new User("john_doe", Subscription.PREMIUM),
                new User("max_power", Subscription.VIP),
                new User("anna_k", Subscription.FREE)
        };

        System.out.println("Пользователи с подпиской VIP:");

        for (User user : users) {
            if (user.getSubscription() == Subscription.VIP) {
                System.out.println("- " + user.getUsername());
            }
        }
    }
}
