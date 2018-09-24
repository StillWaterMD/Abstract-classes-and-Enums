package com.company;

import java.util.Random;

class line extends matrix {
    line(int M) {
        super(1, M);
    }

    public void define() {
        Random rand = new Random();

        for(int j = 0; j < this.getM(); ++j) {
            super.set(0, j, rand.nextInt(this.getM()));
        }

    }

    public void print() {
        System.out.println(this.gettype());

        for(int i = 0; i < this.getM(); ++i) {
            System.out.print(this.getelement(0, i));
        }

        System.out.println("");
    }
}
