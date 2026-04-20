package polymorphism;

public class AnimalMain4 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat yourAreNowCar = (Cat) animal;
        yourAreNowCar.grooming();

    }

    private static void soundAnimal(Animal animal){
        animal.sound();
    }
}
