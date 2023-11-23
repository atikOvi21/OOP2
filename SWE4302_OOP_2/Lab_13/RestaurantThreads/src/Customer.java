import java.util.List;

public class Customer extends Thread {
    private static int customerNo = 1;
    private final int customerId;
    private final SharedQueue<String> orderQueue;
    private final Menu menu;
    private final Receptionist receptionist;

    public Customer(SharedQueue<String> orderQueue, Menu menu, Receptionist receptionist) {
        this.customerId = customerNo++;
        this.orderQueue = orderQueue;
        this.menu = menu;
        this.receptionist = receptionist;
    }

    @Override
    public void run() {
        try {
            getAssignedTable();
            placeOrder();
            waitForFood();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void getAssignedTable() throws InterruptedException {
        Table table = receptionist.assignTable();
        System.out.println(STR."Customer \{customerId} assigned table \{table.getTableNumber()}");
    }

    private void placeOrder() throws InterruptedException {
        System.out.println(STR."Customer \{customerId} placing order.");

        int numberOfOrderedDishes = menu.getRandomNumberOfDishes();
        for (int i = 0; i < numberOfOrderedDishes; i++) {
            String dish = menu.getRandomDish();
            orderQueue.addToQueue(dish);
            System.out.println(STR."Customer \{customerId} orders \{dish}-\{customerId}.");
        }
    }

    privateq void waitForFood() throws InterruptedException {
        System.out.println(STR."Customer \{customerId} waiting for food.");
    }

}
