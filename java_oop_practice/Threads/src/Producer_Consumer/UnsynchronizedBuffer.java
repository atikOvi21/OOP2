package Producer_Consumer;

public class UnsynchronizedBuffer implements Buffer{
    private int buffer = -1;
    @Override
    public void set(int value) throws InterruptedException{
        buffer = value;
        System.out.println(STR."Producer writes \{buffer}.");
    }

    @Override
    public int get() throws InterruptedException {
        System.out.println(STR."Consumer reads \{buffer}.");
        return buffer;
    }
}
