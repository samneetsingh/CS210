public class DogKennel { // create DogKennel
    public static void main(String[] args){ // create the main class

        System.out.println("Welcome to the Dog Kennel"); // Greet the user
       
        // Instantiate the Dog class
        Dog dog1 = new Dog(); 
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        
        // Use setter methods to set the values for dog 1
        dog1.setHeight(13.5);
        dog1.setAge(8);
        dog1.setName("Igor");
        dog1.setLikesBarking(true);
        
        // Use setter methods to set the values for dog 2
        dog2.setHeight(8.2);
        dog2.setAge(5);
        dog2.setName("Lev");
        dog2.setLikesBarking(false);

        // Use setter methods to set the values for dog 3
        dog3.setHeight(15.1);
        dog3.setAge(8);
        dog3.setName("Frost");
        dog3.setLikesBarking(true);
        
        int sumOfAges = dog1.getAge() + dog2.getAge() + dog3.getAge(); // Create a variable of type int which sums the dogs' ages
        System.out.println("The sum of the dogs' ages is " + sumOfAges); // print sum of ages

        double sumOfHeights = dog1.getHeight() + dog2.getHeight() + dog3.getHeight(); // Create a variable of type double which sums the dogs' heights
        System.out.println("The sum of the dogs' heights is " + sumOfHeights); // print sum of heights
        
        // print the names of the dogs
        System.out.println("The dogs are: " + dog1.getName() + ", " + dog2.getName() + ", " + dog3.getName());
        
        // create an integer i and set it equal to 0  
        int i = 0;
        
        // create an if statement to count how many dogs like barking
        if(dog1.getLikesBarking() == true) {
            i++;
        }
        if(dog2.getLikesBarking() == true) {
            i++;
        }
        if(dog3.getLikesBarking() == true) {
            i++;
        }

        System.out.println(i + " dogs like barking"); // print how many dogs like barking
    }
}