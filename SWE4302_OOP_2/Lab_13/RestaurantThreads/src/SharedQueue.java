public interface SharedQueue<Thingy> {
    public void addToQueue(Thingy item) throws InterruptedException;
    public Thingy removeFromQueue() throws InterruptedException;
}
