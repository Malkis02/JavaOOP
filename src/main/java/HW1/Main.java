package HW1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HotDrinkMachine hotMachine = new HotDrinkMachine();
        ArrayList<Object> finishProd = new ArrayList<>();
        HotDrink hotDrink = new HotDrink();

        hotDrink.setName("coffee");
        hotDrink.setVolume(200);
        hotDrink.setTemperature(80);
        finishProd = hotMachine.getProduct(hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature());
        hotMachine.finishProduct(finishProd);

        hotDrink.setName("tea");
        hotDrink.setVolume(300);
        hotDrink.setTemperature(85);
        finishProd = hotMachine.getProduct(hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature());
        hotMachine.finishProduct(finishProd);
    }
}