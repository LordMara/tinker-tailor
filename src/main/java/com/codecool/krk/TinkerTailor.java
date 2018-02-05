package com.codecool.krk;

import java.util.LinkedList;
import java.util.List;

public class TinkerTailor {
    public List<Integer> getOutcome(Integer n, Integer k) {
        List<Integer> numberSequence = createSequence(n);
        List<Integer> outcome = new LinkedList<>();

        return outcome;
    }

    private List<Integer> createSequence(Integer n) {
        List<Integer> numberSequence = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            numberSequence.add(i);
        }

        return numberSequence;
    }
}
