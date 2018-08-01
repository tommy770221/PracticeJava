public class AnonymousInnerClass {
    public static void main(String[] args) {
       final Person person=new Person();
       Animal animal=new Dog();
       person.feed(animal);
       person.feed(new Animal() {
           @Override
           public void eat() {
               System.out.println("eat cat food");
           }
       });

       new Animal() {

           private String watter;

           @Override
           public void eat() {
               System.out.println("animal1 eat");
           }

           public void drink(){
               System.out.println("drink watter");
           }
       }.drink();



    }
}

class Person {
    public void feed(Animal animal){
         animal.eat();
    }
}

abstract class Animal{
     public abstract void eat();
}

interface IAnimal{
    public abstract void drink();
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println(" eat bone");
    }
}