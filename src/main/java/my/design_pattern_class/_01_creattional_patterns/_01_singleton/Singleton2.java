package my.design_pattern_class._01_creattional_patterns._01_singleton;

public class Singleton2 {
    private static volatile Singleton2 instance;

    private Singleton2() {
    }

    public Singleton2 getInstance() {
        if (instance == null) {
            Class var1 = Singleton2.class;
            synchronized(Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
