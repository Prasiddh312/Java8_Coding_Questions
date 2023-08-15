package org.example.StreamFunction.Date_Time_API;

public class Date_Time_Api {
    public static void main(String[] args) {
        System.out.println("Current Local Date is:-" + java.time.LocalDate.now());

        System.out.println("Current Local Time is:-" + java.time.LocalTime.now());

        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
    }
}
