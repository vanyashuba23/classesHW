public class Animal {


    String name;
    String colour;
    int age;
    public Animal(){}

    public void makeSound(){}
}

 class Cat extends Animal {
     String breed;
     public void makeSound(){
         System.out.println("saymeow");
     }
}
