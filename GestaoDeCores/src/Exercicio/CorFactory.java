package Exercicio;

import Exercicio.Cor;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {

    private static Map<String, Cor> cores = new HashMap<>();

    public static Cor obterCor(String nome){
            Cor cor = cores.get(nome);

            if(cor != null){
                return cor;
            }

            cor = new Cor(nome);
            cores.put(nome, cor);

            return cor;
    }


}
