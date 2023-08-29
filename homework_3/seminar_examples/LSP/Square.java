package homework_3.seminar_examples.LSP;

public class Square extends Quadrangle {

    protected int length;

    public Square(int length) {
        this.length = length;
    }

    public void setLenght(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int area() {
        return length * length;
    }
    
}