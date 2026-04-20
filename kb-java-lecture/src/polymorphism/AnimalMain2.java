package polymorphism;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal donkey = new Donkey();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal chicken = new Chicken();

        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chicken);

        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};

        for(Animal animal : animals){
            System.out.println(animal);
        }
    }

    private static void soundAnimal(Animal animal){
        animal.sound();
    }
}
