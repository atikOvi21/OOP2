import java.util.List;
import java.util.Random;

public class Menu {
    private final List<String> dishes;

    public Menu(List<String> dishes) {
        this.dishes = dishes;
    }

    public String getRandomDish() {
        Random random = new Random();
        int index = random.nextInt(dishes.size());
        return dishes.get(index);
    }

    public List<String> getDishes() {
        return dishes;
    }

    public int getRandomNumberOfDishes() {
        return (int) (Math.random() * 3) + 1;
    }
}
