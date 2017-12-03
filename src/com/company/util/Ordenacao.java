package com.company.util;

import java.util.Comparator;

public class Ordenacao implements Comparator<Long> {
    public int compare(Long s1, Long s2) {
        return s1.compareTo(s2);
    }
}