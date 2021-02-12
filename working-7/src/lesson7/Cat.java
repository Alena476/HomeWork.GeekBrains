package lesson7;

public class Cat {

    private String name;
    private int appetite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if(plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
        } else {
            System.out.println("В тарелке мало еды, сейчас добавим еще!");
            plate.addFood();
            plate.decreaseFood(appetite);
        }
    };
}
