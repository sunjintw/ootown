package com.thoughtworks.ootown.Model;

import java.util.Scanner;

/**
 * Created by yuchen on 8/12/16.
 */
public class Hotel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Warmly Home!How many rooms do you want to rent?");
        int wanted_room_count = scanner.nextInt();
        Register temp = new Register();

        boolean room_available = temp.check_room_available(wanted_room_count);
        if(room_available) {

            for(int i = 0; i < wanted_room_count; i++) {
                System.out.print("Please input renter user name:");
                String userName = scanner.next();
                System.out.print("Please input renter user age:");
                int age = scanner.nextInt();
                boolean fail = temp.register(new Person(userName, age));
                if(fail) {
                    i--;
                }
            }
        }else {
            System.out.println("Room is not available");
        }
    }
}
