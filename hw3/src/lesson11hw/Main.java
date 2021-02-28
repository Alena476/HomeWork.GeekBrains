package lesson11hw;

public class Main {

    public static void main(String[] args) {
	Box<Apple> appleBox1 =  new Box<>(5, new Apple(), new Apple(), new Apple());
	Box<Apple> appleAnotherBox2 = new Box<>(7);

	Box<Orange> orangeBox1 = new Box<>(5, new Orange(), new Orange(), new Orange(), new Orange(), new Orange());
	Box<Orange> orangeAnotherBox2 = new Box<>(9);

	System.out.println(appleBox1.getWeight());
	appleBox1.putFruitsToAnotherBox(appleAnotherBox2);
	appleBox1.addFruit(new Apple());
	appleBox1.addFruit(new Apple());
	appleBox1.addFruit(new Apple());

	System.out.println(appleBox1.compareWeight(orangeBox1));

	System.out.println("1 BoxWithApples: " + appleBox1.getWeight());
	System.out.println("2 newBoxWithApples: " + appleAnotherBox2.getWeight());
	System.out.println();

	orangeBox1.putFruitsToAnotherBox(orangeAnotherBox2);
	System.out.println("1 BoxOranges: " + orangeBox1.getWeight());
	System.out.println("2 newBoxOranges: " + orangeAnotherBox2.getWeight());

    }
}
