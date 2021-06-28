package pl.mkluzniak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car, and a vehicle, and a object

        Scanner scanner = new Scanner(System.in);///creating scanner for user to input choice
        Animal animal; //declare object and make space for it
        System.out.println("What animal do you want?"); //print question on consele
        System.out.println("(1=dog) or (2=cat)");
        int choice = scanner.nextInt(); //choice data type is int

        if(choice==1){ //if user choose 1 then on console prints Dog class
            animal=new Dog();
            animal.speak();
        }
        else if(choice==2){//if user choose 2 then on console prints Cat class
            animal=new Cat();
            animal.speak();
        }
        else {
            animal=new Animal();//if user choose different number then on console prints Animal class
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
