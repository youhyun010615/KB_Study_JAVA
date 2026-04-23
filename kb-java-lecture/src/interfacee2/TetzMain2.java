package interfacee2;


public class TetzMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Tetz()};

        for(int i = 0; i < animals.length; i++){
            animalDo(animals[i]);

            if(animals[i] instanceof Human){
                Human hu = (Human) animals[i];
                humanDo(hu);
            }
        }
    }

    public static void animalDo(Animal animal){
        animal.eat();
        animal.sleep();
    }

    public static void humanDo(Human human){
        human.think();
    }
}