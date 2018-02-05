package com.codecool.krk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TinkerTailor {
    public List<Integer> getOutcome(Integer n, Integer k) {
        List<Integer> numberSequence = createSequence(n);
        List<Integer> outcome = new LinkedList<>();

        while (numberSequence.size() > 1) {
            int count = 0;

            while (count < k) {
                Iterator<Integer> iterator = numberSequence.iterator();
                Queue<Integer> temp = new LinkedList<>();

                while (iterator.hasNext()) {
                    Integer number = iterator.next();
                    count ++;
                    iterator.remove();

                    if (count < k) {
                        temp.add(number);
                    } else if (count == k) {
                        outcome.add(number);
                        break;
                    }
                }
                numberSequence.addAll(temp);
            }
        }
        outcome.add(numberSequence.get(0));

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
