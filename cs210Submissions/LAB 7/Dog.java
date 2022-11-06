// Samneet Singh
// November 19th, 2020
// Creates a new class Dog

public class Dog { // create a new class

    private double heightIn; // create field heightIn of type double
    private int ageYears; // create field ageYears of type int
    private String name; // create field name of type String
    private boolean likesBarking; // create field likesBarking of type boolean

    public void setHeight(double height) { // create setter method for height
        heightIn = height;
    }
    public void setAge(int age) { // create setter method for age
        ageYears = age;
    }
    public void setName(String nameOfDog) { // create setter method for name
        name = nameOfDog;
    }
    public void setLikesBarking(boolean dogLikesBarking) { // create setter method for likesBarking
        likesBarking = dogLikesBarking;
    }

    public double getHeight() { // create getter method for height
        return heightIn;
    }
    public int getAge() { // create getter method for age
        return ageYears;
    }
    public String getName() { // create getter method for name
        return name;
    }

    public boolean getLikesBarking() { // create getter method for likesBarking
        return likesBarking;
    }
}