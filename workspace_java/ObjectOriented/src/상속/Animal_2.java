package 상속;

public class Animal_2 {
    public static void main(String[] args) {
        Animal[] animalHouse = new Animal[10];
        Dog d1 = new Dog();
        Cat cat1 = new Cat();
        Cow cow1 = new Cow();

        animalHouse[0] = d1;
        animalHouse[1] = cat1;
        animalHouse[2] = cow1;

//        Animal aaa = new Cat();

        for(int i = 0; i < 3; i++) {
            animalHouse[i].bark();
        }
    }
}
