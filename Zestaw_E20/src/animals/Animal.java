package animals;

public class Animal {
    public Animal(){

    }
}
class Dog extends Animal{

}
class Main{
    public static <T extends Animal> boolean isSameSpecies(T animal11,T animal12){
        return animal11.getClass() == animal12.getClass();
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Animal a1 = new Animal();
        System.out.println(isSameSpecies(d1,d2));


    }
}
