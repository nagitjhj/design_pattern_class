package my.design_pattern_class._01_creattional_patterns._01_singleton;

public class Singleton3 {
    private int money = 30000;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return Singleton3.SingletonHolder.INSTANCE;
    }

    public int withdrawal(int money) {
        return this.money - money;
    }

    public int deposit(int money) {
        return this.money + money;
    }

    public int getMoney() {
        return this.money;
    }

    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();

        private SingletonHolder() {
        }
    }
}
