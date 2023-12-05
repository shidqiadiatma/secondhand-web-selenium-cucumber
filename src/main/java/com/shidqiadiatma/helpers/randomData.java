package com.shidqiadiatma.helpers;

import com.github.javafaker.Avatar;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class randomData {

    static List<String> indexList = Arrays.asList("4", "3", "1", "5", "2");
    static Random random = new Random();
    static Faker faker = new Faker();

    public static Faker getJaveFaker() {
        return faker;
    }

    public static String getStringLimit(int numberOfChars) {
        return faker.lorem().fixedString(numberOfChars);
    }

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getFullName() {
        return faker.name().fullName();
    }
    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getValue() {
        int randomIndex = Integer.parseInt(indexList.get(random.nextInt(indexList.size())));
        return indexList.get(randomIndex);
    }
    public static String getProductName() {
        return faker.commerce().productName();
    }

    public static String getProductPrice() {
        return faker.commerce().price();
    }

    public static String getDescription() {
        return faker.lorem().sentence();
    }
    public static String password(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial, boolean includeDigit) {
        if (includeSpecial) {
            char[] password = faker.lorem().characters(minimumLength, maximumLength, includeUppercase, includeDigit).toCharArray();
            char[] special = new char[]{'!', '@', '#', '$', '%', '^', '&', '*'};
            for (int i = 0; i < faker.random().nextInt(minimumLength); i++) {
                password[faker.random().nextInt(password.length)] = special[faker.random().nextInt(special.length)];
            }
            return new String(password);
        } else {
            return faker.lorem().characters(minimumLength, maximumLength, includeUppercase, includeDigit);
        }
    }

    public static String getPhoneNumberLimit(int limit) {
        return faker.phoneNumber().subscriberNumber(limit);
    }

    public static String getPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String getCity() {
        return faker.address().city();
    }

    public static String getCountry() {
        return faker.address().country();
    }

    public static String getStreetAddress() {
        return faker.address().streetAddress();
    }

    public static String getBuildingNumber() {
        return faker.address().buildingNumber();
    }

    public static String getZipCode() {
        return faker.address().zipCode();
    }

    public static String getJobTitle() {
        return faker.job().title();
    }

    public static String getJobField() {
        return faker.job().field();
    }

    public static String getJobSeniority() {
        return faker.job().seniority();
    }

    public static String getJobPosition() {
        return faker.job().position();
    }

    public static String getJobKeySkills() {
        return faker.job().keySkills();
    }

    public static Avatar getJobEmployer() {
        return faker.avatar();
    }

    public static String getJobUniversity() {
        return faker.university().name();
    }

    private void FakerData() {
        throw new IllegalStateException("Utility class");
    }
}