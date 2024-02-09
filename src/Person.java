public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public double height;
    public double weight;
    public String eyeColor;
    public Person (String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person (double height, double weight, String eyeColor) {
        this("Goksu", "Yesilada",25);
        this.height=height;
        this.weight=weight;
        this.eyeColor=eyeColor;
    }
    public String getFirstName(){
        return this.firstName;

    }
    public String getLastName(){
        return this.lastName;

    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getEyeColor(){
        return this.eyeColor;
    }
    public boolean isTeen(){
        if( this.age>13 && this.age<19){
            return true;
        }
        else
            return false;
    }
}
