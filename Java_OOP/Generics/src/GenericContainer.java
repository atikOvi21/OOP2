public class GenericContainer<Thingy> {
    private Thingy item;

    public GenericContainer(Thingy item){
        this.item = item;
    }

    public Thingy getItem(){
        return item;
    }

    public <AnotherThingy> void printItemAndType (AnotherThingy anotherItem){
        System.out.println("Item: " + item + ", type: " + item.getClass().getName());
        System.out.println("Another item: " + anotherItem + ", type: " + anotherItem.getClass().getName());
    }
}
