package PSA_;

public class Cat extends Dog{
	public void noise(){
        System.out.println("Mew Mew.....");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.noise();

        Cat c = new Cat();
        c.eat();
        c.noise();
    }

}
