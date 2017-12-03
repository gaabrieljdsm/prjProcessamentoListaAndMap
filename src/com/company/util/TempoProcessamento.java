package com.company.util;

public class TempoProcessamento {

    private long initTime = 0;
    private long endTime = 0;

    public void initTime() {
        initTime = System.currentTimeMillis();
    }

    public TempoProcessamento endTime() {
        endTime = System.currentTimeMillis();

        return this;
    }

    public long getTimeTotal(String classSimpleName) {
        long timeTotal = endTime - initTime;

        if (classSimpleName != null && !classSimpleName.isEmpty()) {
            System.out.println("Tempo de armazenamento dos dados em " + classSimpleName + ": " + timeTotal);
        }

        return timeTotal;
    }
}
