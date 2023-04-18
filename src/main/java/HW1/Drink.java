package HW1;

import java.util.ArrayList;

public class Drink {
    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


    public ArrayList<Object> getProduct(String name, int volume) {
        ArrayList<Object> finishProd = new ArrayList<>();
        finishProd.add(name);
        finishProd.add(volume);
        return finishProd;

    }


}
