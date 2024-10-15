package my.design_pattern_class._01_creattional_patterns._01_singleton;

import java.io.Serializable;

public class Singleton4 implements Serializable {
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return Singleton4.SingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();

        private SingletonHolder() {
        }
    }
}
