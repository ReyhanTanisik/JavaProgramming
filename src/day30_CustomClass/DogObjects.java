package day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
       Dog dog1= new Dog(); // this is the object we have to assign to a variable, the variable name should be dog
       dog1.name="Lucy";
       dog1.breed="Husky";
       dog1.age=5;
       dog1.gender='F';
       dog1.size="small";
       dog1.color="White";

        System.out.println(dog1);

        Dog dog2= new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";

        System.out.println(dog2);

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",3,'F',"Small","Brown");
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4= new Dog();
        dog4.setInfo("Bullet","Labrador",3,'M',"Extra large","Yellow");


        Dog dog5= new Dog();
        dog5.setInfo("Sully","Pit Bull",6,'M',"Large","Black");


        Dog [] dogs= { dog1,dog2, dog3,dog4,dog5};



    }
}
