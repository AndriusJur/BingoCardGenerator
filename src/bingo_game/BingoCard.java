package bingo_game;

public class BingoCard {
    private int[] b, i, n, g, o;

    public BingoCard(int[] b, int[] i, int[] n, int[] g, int[] o){
        setB(b);
        setI(i);
        setN(n);
        setG(g);
        setO(o);
    }

    public void setB(int[] numbers){
        b = numbers;
    }

    public void setI(int[] numbers){
        i = numbers;
    }

    public void setN(int[] numbers){
        n = numbers;
    }

    public void setG(int[] numbers){
            g = numbers;
    }

    public void setO(int[] numbers){
        o = numbers;
    }

    public int[] getB() {
        return b;
    }

    public int[] getI() {
        return i;
    }

    public int[] getN() {
        return n;
    }

    public int[] getG() {
        return g;
    }

    public int[] getO() {
        return o;
    }

    public void printCard() {
        System.out.println(" B  I  N  G  O");
        for (int row = 0; row < 5; row++) {
            System.out.printf("%2d %2d %2d %2d %2d%n", b[row], i[row],  n[row], g[row], o[row]);
        }
    }

}
