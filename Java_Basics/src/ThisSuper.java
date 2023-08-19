public class ThisSuper {
    private int x;
    private int y;
    private  int height;
    private int width;

    public ThisSuper() {
        this(0 ,0);
    }

    public ThisSuper(int x, int y) {
        this(x, y, 0, 0);
    }

    public ThisSuper(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

}
