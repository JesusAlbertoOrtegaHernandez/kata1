package software.ulpgc.kata1;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alberto", LocalDate.of(2023, 03, 12));
        System.out.println(person);
    }
}
