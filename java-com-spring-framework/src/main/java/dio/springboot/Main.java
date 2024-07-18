package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma de 1 + 1 é: " + calculadora.somar(1, 1));
    }
}
