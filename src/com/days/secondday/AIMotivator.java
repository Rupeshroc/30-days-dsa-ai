package com.days.secondday;

import java.util.Scanner;
import java.util.Random;

public class AIMotivator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String[] quotes = {
            "Keep pushing forward, the results are loading...",
            "Bug today, boss tomorrow!",
            "Every DSA problem solved is a step closer to mastery!",
            "AI doesn't sleep, and neither does your passion.",
            "You're coding your future—one line at a time."
        };

        Random rand = new Random();
        int index = rand.nextInt(quotes.length);

        System.out.println("\nHey " + name + ", here's your AI Motivator:");
        System.out.println("\"" + quotes[index] + "\"");
    }
}
