package com.company;

import com.company.util.Ordenacao;
import com.company.util.TempoProcessamento;

import java.util.*;
import java.util.stream.Collectors;


public class RecebeDados {

    public static ListaxVelocidade criarLista(Collection listas, long valores) {

        TempoProcessamento tempoProcessamento = new TempoProcessamento();
        String nomeLista = listas.getClass().getSimpleName();

        tempoProcessamento.initTime();

        for (int i = 0; i < valores; i++) {
            listas.add(getValorRandomico());
        }
        listas.stream().sorted(new Ordenacao()).collect(Collectors.toList());

        return new ListaxVelocidade(nomeLista, tempoProcessamento.endTime().getTimeTotal(nomeLista));
    }

    public static ListaxVelocidade criarMap(long valores, Map mapa) {

        TempoProcessamento tempoProcessamento = new TempoProcessamento();
        String nomeMap = mapa.getClass().getSimpleName();

        tempoProcessamento.initTime();

        for(int i = 0; i< valores; i++ ) {
            mapa.put(i,i);
        }

        return new ListaxVelocidade(nomeMap, tempoProcessamento.endTime().getTimeTotal(nomeMap));
    }

    private static long getValorRandomico() {
        Random r = new Random();
        return r.nextInt(10000000);
    }

}
