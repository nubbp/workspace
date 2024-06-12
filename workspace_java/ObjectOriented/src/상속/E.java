package 상속;

public class E {
    private int n;
    public int getN() {
        return n;
    }
    public void setN(int i) {
        n = i;
    }
}

class F extends E {
    public String s;
    public int m;
    private char c;
    public void setC(char ch) {
        c = ch;
    }
    public char getC() {
        return c;
    }
}

class G extends F {
    public double d;
}