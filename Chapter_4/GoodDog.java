class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

}

class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog dogOne = new GoodDog();
        dogOne.setSize(100);
        GoodDog dogTwo = new GoodDog();
        dogTwo.setSize(20);

        System.out.println("Dog One " + dogOne.getSize());
        System.out.println("Dog Two " + dogTwo.getSize());

        dogOne.bark();
        dogTwo.bark();



    }
}