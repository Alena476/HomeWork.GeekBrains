package lesson6;

public abstract class Animal {

    private String name;
    private int lengthForRun;
    private int lengthForSwim;
    private float height;

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getLengthForRun() {
        return lengthForRun;
    }

    public int getLengthForSwim() {
        return lengthForSwim;
    }

    public float getHeight() {
        return height;
    }

    public void setLengthForSwim(int lengthForSwim) {
        this.lengthForSwim = lengthForSwim;
    }

    public void setLengthForRun(int lengthForRun) {
        this.lengthForRun = lengthForRun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, int lengthForRun,int lengthForSwim, int height) {
        setName(name);
        setLengthForRun(lengthForRun);
        setLengthForSwim(lengthForSwim);
        setHeight(height);
    }

    public abstract boolean swim();
    public abstract boolean run();
    public abstract boolean jump();
}
