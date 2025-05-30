package com.github.msrebello._05.vote_checker;

import java.util.HashMap;
import java.util.Map;

public class VoteCheckerDemo {

    private final static Map<String, Boolean> voters = new HashMap<>();

    static {
        voters.put("Matheus", true);
        voters.put("Vitória", false);
        voters.put("Gustavo", true);
        voters.put("Raquel", false);
    }


    public static void main(String[] args) {
        String[] names = {"Vitória", "Matheus", "Gutav"};

        for (String name : names) {
            checkIfVoted(name);
        }
    }

    private static void checkIfVoted(String name) {
        try {
            if (voters.get(name)) {
                System.out.println(name + " voted");
            } else {
                voters.put(name, true);
                System.out.println("Let " + name + " vote");
            }
        } catch (Exception e) {
            throw new VoterNotFound("Voter with name " + name + " not found");
        }
    }

}
