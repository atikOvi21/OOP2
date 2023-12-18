public class UnsynchronizedBuffer implements Buffer{
    private int buffer = -1;
    @Override
    public void set(int value) throws InterruptedException{
        System.out.println(STR."Producer writes \{value}.");
        buffer = value;
    }

    @Override
    public int get() throws InterruptedException {
        System.out.println(STR."Consumer reads \{buffer}.");
        return buffer;
    }
}
