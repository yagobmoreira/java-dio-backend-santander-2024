package singleton;

/**
 * Singleton "apressado"
 *
 * @author yagobmoreira
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

