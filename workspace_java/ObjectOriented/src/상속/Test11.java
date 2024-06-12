package 상속;

class LCD {
    int size;
    public LCD(int n) { size = n; }
}

class ColorLCD extends LCD {
    int colorSize;
    public ColorLCD(int colorSize, int size){
        super(size);
        this.colorSize = colorSize;
    }
}

public class Test11 {
}
