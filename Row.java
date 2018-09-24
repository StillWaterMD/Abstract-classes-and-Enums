package com.company;

import java.util.Random;

class Row extends matrix {
    Row(int N) {
        super(N, 1);
    }

    public void define() {
        Random rand = new Random();

        for(int i = 0; i < this.getN(); ++i) {
            super.set(i, 0, rand.nextInt(this.getN()));
        }

    }

    public void print() {
        System.out.println(super.gettype());

        for(int i = 0; i < this.getN(); ++i) {
            System.out.println(this.getelement(i, 0));
        }

    }
}
