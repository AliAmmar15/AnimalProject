class Animal {
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("This animal is a mammal.");
    }

    public void mate() {
        System.out.println("This animal is looking for a mate.");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.age = 5;
        myAnimal.gender = "Male";
        
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();
        
        System.out.println("--- Animal Actions ---");
        myAnimal.isMammal();
        myAnimal.mate();
        
        System.out.println("--- Zebra Actions ---");
        myZebra.is_wild = true;
        myZebra.run();
        
        System.out.println("--- Fish Actions ---");
        
        System.out.println("The fish swims in the deep waters...");
    }
}

class Fish extends Animal {
    private int sizeInFeet;

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish.");
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        if (is_wild) {
            System.out.println("The wild zebra is running freely across the savannah!");
        } else {
            System.out.println("The zebra is running playfully in the zoo.");
        }
    }
}
