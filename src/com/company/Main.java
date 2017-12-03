package com.company;

import java.util.*;
import java.lang.*;

import static com.company.RecebeDados.criarLista;
import static com.company.RecebeDados.criarMap;

public class Main {

    public static void main(String[] args) {

        RecebeValor dados = new RecebeValor();
        long valores = dados.get();


        List<ListaxVelocidade> listaXVelocidadeLst = new ArrayList<>();


        ArrayList listaDeArray = new ArrayList<>();
        listaXVelocidadeLst.add(criarLista(listaDeArray, valores));

        Vector  vector = new Vector<>();
        listaXVelocidadeLst.add(criarLista(vector, valores));

        LinkedList linkedList = new LinkedList<>();
        listaXVelocidadeLst.add(criarLista(linkedList, valores));

        Stack stack = new Stack<>();
        listaXVelocidadeLst.add(criarLista(stack, valores));

        Queue prioritQueue = new PriorityQueue();
        listaXVelocidadeLst.add(criarLista(prioritQueue, valores));

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        listaXVelocidadeLst.add(criarLista(arrayDeque, valores));

        TreeSet treeSet = new TreeSet<>();
        listaXVelocidadeLst.add(criarLista(treeSet, valores));

        HashSet hashSet = new HashSet<>();
        listaXVelocidadeLst.add(criarLista(hashSet, valores));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        listaXVelocidadeLst.add(criarLista(linkedHashSet, valores));

        listaXVelocidadeLst.sort((p1, p2) -> Long.compare(p1.getTempoDeProcessamento(), p2.getTempoDeProcessamento()));

        System.out.println("############################# ORDENACAO DOS RESULTADOS ################################");
        listaXVelocidadeLst.forEach(lista -> System.out.println(lista.tipoDeLista + " " + lista.tempoDeProcessamento));
        System.out.println("############################# FIM ORDENACAO DOS RESULTADOS ################################");

//#######################################################################################

        Map hashMap = new HashMap<Integer, Integer>();
        listaXVelocidadeLst.add(criarMap(valores, hashMap));

        Map linkedHashMap = new LinkedHashMap<Integer, Integer>();
        listaXVelocidadeLst.add(criarMap(valores, linkedHashMap));


        Map treeMap =new TreeMap<Integer, Integer>();
        listaXVelocidadeLst.add(criarMap(valores, treeMap));


        Map  mapaDeHashMap =new Hashtable<Integer, Integer>();
        listaXVelocidadeLst.add(criarMap(valores, mapaDeHashMap));

        Map  identityHashMap =new IdentityHashMap<Integer, Integer>();
        listaXVelocidadeLst.add(criarMap(valores,identityHashMap ));

        Map  weakHashMap =new WeakHashMap<Integer, Integer>();
        listaXVelocidadeLst.add(criarMap(valores,weakHashMap ));

}


}
