package com.company;

//import com.company.matrix.Type;

    public abstract class matrix {
        private int N;
        private int M;
        private int[][] arr;
        private Type type;

        public Type gettype() {
            return this.type;
        }

        public abstract void define();

        public abstract void print();

        matrix(int N, int M) {
            this.N = N;
            this.M = M;
            this.arr = new int[N][M];
            if (this.N == 1 && this.M != 1) {
                this.type = Type.Line;
            } else if (this.M == 1 && this.N != 1) {
                this.type = Type.Row;
            } else {
                this.type = Type.Matrix;
            }

        }

        public void set(int N, int M, int x) {

            this.arr[N][M] = x;
        }

        public int getN() {

            return this.N;
        }

        public int getM() {
            return this.M;
        }

        public int[][] getarr() {

            return this.arr;
        }

        public int getelement(int N, int M) {

            return this.arr[N][M];
        }

        enum Type {
            Matrix,
            Row,
            Line
        }


    }



