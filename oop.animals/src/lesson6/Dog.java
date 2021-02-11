package lesson6;

    public class Dog extends Animal{

        public Dog(String name, int lengthForRun, int lengthForSwim, float height) {
            super(name, lengthForRun, lengthForSwim, (int)height);
        }

        @Override
        public boolean swim() {
            if(getLengthForSwim() < 10) {
                System.out.println("Собака " + getName() + "проплыла " + getLengthForSwim() + " метров");
                return true;
            }
            System.out.println("Собака может проплыть только до 10 метров");
                return false;
        }

        @Override
        public boolean run() {
            if(getLengthForRun() < 500) {
                System.out.println("Собака " + getName() + " пробежала " + getLengthForRun() + " метров");
                return true;
            }
            System.out.println("Собака может пробежать расстояние до 500 метров");
               return false;
        }

        @Override
        public boolean jump() {
            if(getHeight() < 0.5) {
                System.out.println("Собака " + getName() + "прыгнула " + getHeight() + " метра");
                return true;
            }
            System.out.println("Собака может прыгнуть максимально 0.5 метра");
            return false;
        }

   }
