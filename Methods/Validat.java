package Methods;

public class Validat 
{
    boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
    boolean validate(int age) {
        return age >= 3 && age <= 15;
    }

    public static void main(String[] args) {
        Validat validator = new Validat();
        String name = "Sandeep";
        int age = 22;

        boolean isNameValid = validator.validate(name);
        System.out.println("Name: " + name + ", Is Valid : " + isNameValid);
        boolean isAgeValid = validator.validate(age);
        System.out.println("Age: " + age + ", Is Valid : " + isAgeValid);
    }
}
