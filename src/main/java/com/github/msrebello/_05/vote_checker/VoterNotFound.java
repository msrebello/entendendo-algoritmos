package com.github.msrebello._05.vote_checker;

public class VoterNotFound extends RuntimeException {
    public VoterNotFound(String msg) {
        super(msg);
    }
}
