package subsistema2.cep;

import singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Osasco";
    }

    public String recuperarEstado(String cep) {
        return "São paulo";
    }

}
