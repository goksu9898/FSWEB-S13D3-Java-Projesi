public class Main {
    public static void main(String[] args) {
        Person person= new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("IsTeen: " + person.isTeen());

        Person person2= new Person(1.50, 50.8,"hazel");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Height: " + person2.getHeight());
        System.out.println("Weight: " + person2.getWeight());
        System.out.println("EyeColor: " + person2.getEyeColor());
        System.out.println("**************************************************************");

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}