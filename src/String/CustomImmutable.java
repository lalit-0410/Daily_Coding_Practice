package String;

import java.util.Date;

public final class CustomImmutable {
    private String name;
    private int age;
    private java.util.Date birthDate;

    public CustomImmutable(String name, int age, Date birthDate) {
        if(name==null || birthDate==null)
        {
            throw new IllegalArgumentException("Field cannot be null");
        }
        this.name = name;
        this.age = age;
        // Defensive copy for mutable object
        this.birthDate = new java.util.Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    // Getter for mutable field returns a copy
    public java.util.Date getBirthDate() {
        return new java.util.Date(birthDate.getTime());
    }


    @Override
    public String toString() {
        return "CustomImmutable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }

    public static void main(String[] args) {
        Date date=new Date();
        CustomImmutable person=new CustomImmutable("Lalit",25,date);
        System.out.println("Original Person: " + person);

        date.setTime(0);
        System.out.println("After modify: " + person);
        // Trying to modify via getter
        person.getBirthDate().setTime(0);
        System.out.println("After modifying via getter: " + person);

    }
}
