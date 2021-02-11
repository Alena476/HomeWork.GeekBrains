package lesson6;

    public class Cat extends Animal{

        public Cat(String name, int lengthForRun, int lengthForSwim, float height) {
            super(name, lengthForRun, lengthForSwim, (int)height);
        }

        @Override
        public boolean swim() {
            System.out.println("Кот " + getName() + " не умеет плавать!");
            return false;
        }

        @Override
        public boolean run() {
            if(getLengthForRun() < 200) {
                System.out.println("Кот " + getName() + " пробежал " + getLengthForRun() + " метров.");
                return true;
            }
            System.out.println("Кот может пробежать расстояние до 200 метров");
                return false;
        }

        @Override
        public boolean jump() {
            if(getHeight() < 2) {
                System.out.println("Кот" + getName() + " прыгнул  " + getHeight());
                return true;
            }
            System.out.println("Кот может прыгнуть высоту до 2 метров");
                return false;
        }

    }
