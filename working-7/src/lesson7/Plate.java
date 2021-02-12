package lesson7;

public class Plate {
    private int food;
    private boolean saturation = false;

    public boolean isSaturation() {
        return saturation;
    }

    public void setSaturation(boolean saturation) {
        this.saturation = saturation;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int countFood) {

       food -= countFood;
       return saturation = true;
    }

    public void addFood() {

            food += 40;
            saturation = true;

    }

    public void info(Cat cat) {
        if(isSaturation()) {
            System.out.println("Кот по кличке: " + cat.getName() + " наелся ");
        }
        System.out.println("В тарелке еще осталось: " + food);
    }
}
