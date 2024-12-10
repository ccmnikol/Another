package github;

import com.github.javafaker.Faker;
import pajes.RegistrationPajes;

import java.util.Locale;

public class TestData {

    RegistrationPajes registrationPajes = new RegistrationPajes();

    Faker faker = new Faker(new Locale("ru"));
    String userName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String userAdress = faker.address().streetAddress();
    String phoneNumber = "9506666937";
    String subjects = "sci";
}
