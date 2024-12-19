public class Generics_Example {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("aghds22", "lalu");
        Dog<String, Integer> d2 = new Dog<>("dql567", 112);
        Dog<Integer, Integer> d3 = new Dog<>(12, 44);   

    }
}

class Dog<E, V> {    //now it indicates generic class

    E id;    // E  may be string, float, doub;e etc
    V name;

    public Dog(E id, V name){
        this.id = id;
        this.name = name;
    }

}