package com.rks.tdd.mc;

public record Dollar(int amount) {

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

}
