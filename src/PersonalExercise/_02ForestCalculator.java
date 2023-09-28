package PersonalExercise;

import java.util.Scanner;

public class _02ForestCalculator {
    public static Scanner scanner = new Scanner(System.in);
    public static String command;
    public static int people;
    public static int logs;
    public static int rocks;
    public static int sticks;
    public static int materials;

    public static void printError(String str) {
        System.out.println();
        System.out.println("!==========Error==========!");
        System.out.println();
        System.out.println("Try with a whole number");
        System.out.println();
        switch (str) {
            case "logs" -> System.out.print("Desired amount of logs for a building: ");
            case "rocks" -> System.out.print("Amount of rocks needed: ");
            case "sticks" -> System.out.print("Amount of sticks: ");
        }
        command = scanner.nextLine();
    }

    public static void msgOnZero() {
        System.out.println();
        System.out.println("!==========Oh no==========!");
        System.out.println();
        System.out.println("Survivors are too lazy today");
        System.out.println("They are waiting for Shrek...");
        System.out.println();
    }

    public static int printOnZero(String str) {
        msgOnZero();

        switch (str) {
            case "logs" -> System.out.print("Desired amount of logs for a building: ");
            case "rocks" -> System.out.print("Amount of rocks needed: ");
            case "sticks" -> System.out.print("Amount of sticks: ");
        }

        command = scanner.nextLine();
        while(!command.matches("-?\\d+")) {
            printError(str);
        }
        return Integer.parseInt(command);
    }

    public static void msgOnLess(String str) {
        System.out.println();
        System.out.println("!==========Oh crap==========!");
        System.out.println();

        switch (str) {
            case "logs" -> {
                System.out.println("Shrek says no deforestation");
                System.out.println("A tree for an onion...");
                System.out.println();
                System.out.print("Desired amount of logs for a building: ");
            }
            case "rocks" -> {
                System.out.println("Shrek says no bedrock");
                System.out.println("A rock for an onion...");
                System.out.println();
                System.out.print("Amount of rocks needed: ");
            }
            case "sticks" -> {
                System.out.println("Shrek says no stick");
                System.out.println("A rod for an onion...");
                System.out.println();
                System.out.print("Amount of sticks: ");
            }
        }
    }

    public static int printOnLess(String str) {
        System.out.println();
        System.out.println("!==========Oh crap==========!");
        System.out.println();

        switch (str) {
            case "logs" -> {
                System.out.println("Shrek says no deforestation");
                System.out.println("A tree for an onion...");
                System.out.println();
                System.out.print("Desired amount of logs for a building: ");
            }
            case "rocks" -> {
                System.out.println("Shrek says no bedrock");
                System.out.println("A rock for an onion...");
                System.out.println();
                System.out.print("Amount of rocks needed: ");
            }
            case "sticks" -> {
                System.out.println("Shrek says no stick");
                System.out.println("A rod for an onion...");
                System.out.println();
                System.out.print("Amount of sticks: ");
            }
        }

        command = scanner.nextLine();
        while(!command.matches("-?\\d+")) {
            printError(str);
        }
        return Integer.parseInt(command);
    }

    private static void printErrorPeople(String str) {
        System.out.println();
        System.out.println("!==========Error==========!");
        System.out.println();
        System.out.println("Try with a whole number");
        System.out.println();

        switch (str) {
            case "logs" -> System.out.println("Desired amount of logs for a building: " + logs);
            case "rocks" -> System.out.println("Amount of rocks needed: " + rocks);
            case "sticks" -> System.out.println("Amount of sticks: " + sticks);
        }
        System.out.print("Number of people: ");
        command = scanner.nextLine();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println(" # THE FOREST CALCULATOR # ");
        System.out.println("========================");
        System.out.println(" 1. Calculate # Logs #");
        System.out.println(" 2. Calculate # Rocks #");
        System.out.println(" 3. Calculate # Sticks #");
        System.out.println();
        System.out.println(" 0. Exit");
        System.out.println("========================");
        System.out.println();
        System.out.print("Choice: ");
    }

    public static void calc(String strMaterial, String msg) {
        System.out.println();

        System.out.print(msg);
        command = scanner.nextLine();

        while(true) {
            while(!command.matches("-?\\d+")) {
                printError(strMaterial);
            }
            materials = Integer.parseInt(command);
            logs = materials;
            rocks = materials;
            sticks = materials;

            if(materials == 0) {
                materials = printOnZero(strMaterial);
            } else if(materials < 0) {
                materials = printOnLess(strMaterial);
            } else {
                break;
            }
        }

        do {
            System.out.print("Number of people: ");
            command = scanner.nextLine();

            while(!command.matches("-?\\d+")) {
                printErrorPeople(strMaterial);
            }
            people = Integer.parseInt(command);

            if(people == 0) {
                msgOnZero();
                System.out.println("Desired amount of logs for a building: " + materials);
            } else if(people < 0) {
                msgOnLess(strMaterial);
                System.out.print(materials);
                System.out.println();
            }
        } while(people <= 0);
    }

    public static void calcLogs() {
        String strLogs = "logs";
        String msg = "Desired amount of logs for a building: ";
        calc(strLogs, msg);

        System.out.println();
        System.out.println("---------------------------------------------------");

        int trees = 0;
        int courseCounter = 0;
        int logsLeft = 0;

        String strTrees;
        String strCourses;
        String strLogsLeft;

        boolean done = false;

        while(logs > 0) {
            courseCounter++;
            int currentTrees = 0;

            for (int i = 1; i <= people; i++) {
                int currentLogs = 0;

                while(currentLogs < 12) {
                    //double a = Math.random() * (max - min + 1) + min;
                    //Math random: [0.0 - 0.9] ---> [0.0 - 0.9] * 2 = [0.0 - 1.9] ---> [0.0 - 1.9] + 4 = [4.0 - 5.9] ---> (int)[4.0 - 5.9] = [4 - 5]
                    int randomLogs = (int)(Math.random() * 2 + 4);

                    if(logsLeft > 0) {
                        currentLogs += logsLeft;
                        logsLeft = 0;
                    }

                    currentLogs += randomLogs;
                    trees++;
                    currentTrees++;

                    if(logs <= currentLogs) {
                        done = true;
                        break;
                    }
                }

                if(currentLogs >= 12) {
                    logsLeft = currentLogs - 12;
                } else {
                    logsLeft = currentLogs - logs;
                }

                logs -= 12;

                if(done) {
                    break;
                }
            }

            if(currentTrees == 1) {
                strTrees = "tree";
            } else {
                strTrees = "trees";
            }

            if(logsLeft == 1) {
                strLogsLeft = "log left";
            } else {
                strLogsLeft = "logs left";
            }

            System.out.printf("Course %d: %d %s | %d %s%n", courseCounter, currentTrees, strTrees, logsLeft, strLogsLeft);
        }

        if(trees == 1) {
            strTrees = "tree";
        } else {
            strTrees = "trees";
        }

        if(courseCounter == 1) {
            strCourses = "course";
        } else {
            strCourses = "courses";
        }

        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.printf("We need to chop %d %s and to take %d %s%n", trees, strTrees, courseCounter, strCourses);

        System.out.println("===================================================");
    }

    public static void calcRocks() {
        String strRocks = "rocks";
        String msg = "Amount of rocks needed: ";
        calc(strRocks, msg);

        System.out.print("Use sled (Y/N)? ");
        String useSled = scanner.nextLine();

        while (!"y".equalsIgnoreCase(useSled) && !"n".equalsIgnoreCase(useSled)) {
            System.out.println();
            System.out.println("Lord Farquaad - heart of a dragon, soul of a donkey, hair of justice...");
            System.out.println();
            System.out.println("Amount of sticks: " + sticks);
            System.out.println("Number of people: " + people);
            System.out.print("Use sled (Y/N)? ");
            useSled = scanner.nextLine();
        }

        boolean isUsing = useSled.equalsIgnoreCase("Y");

        System.out.println();
        System.out.println("---------------------------------------------------");

        String strCourses;
        String strRocksLeft;
        int rocksLimit;

        if(isUsing) {
            rocksLimit = 26;
        } else {
            rocksLimit = 10;
        }

        int courseCounter = 0;
        int rocksLeft = 0;

        while(rocks > 0) {
            courseCounter++;
            int currentRocks = 0;   //course

            for (int i = 1; i <= people; i++) {
                currentRocks += rocksLimit;   //rocks this course

                if(rocks < currentRocks) {
                    rocksLeft = currentRocks - rocks;
                    break;
                }
            }

            System.out.printf("Course %d: %d rocks%n", courseCounter, currentRocks);   //display rocks per course
            rocks -= currentRocks;   //use rocks
        }

        if(courseCounter == 1) {
            strCourses = "course";
        } else {
            strCourses = "courses";
        }

        if(rocksLeft == 1) {
            strRocksLeft = "rock left";
        } else {
            strRocksLeft = "rocks left";
        }

        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.printf("We need to take %d %s%n", courseCounter, strCourses);
        System.out.printf("There are %d %s%n", rocksLeft, strRocksLeft);

        System.out.println("===================================================");
    }

    public static void calcSticks() {
        String strSticks = "sticks";
        String msg = "Amount of sticks: ";
        calc(strSticks, msg);

        System.out.print("Use sled (Y/N)? ");
        String useSled = scanner.nextLine();

        while (!"y".equalsIgnoreCase(useSled) && !"n".equalsIgnoreCase(useSled)) {
            System.out.println();
            System.out.println("Lord Farquaad - heart of a dragon, soul of a donkey, hair of justice...");
            System.out.println();
            System.out.println("Amount of sticks: " + sticks);
            System.out.println("Number of people: " + people);
            System.out.print("Use sled (Y/N)? ");
            useSled = scanner.nextLine();
        }

        boolean isUsing = useSled.equalsIgnoreCase("Y");

        System.out.println();
        System.out.println("---------------------------------------------------");

        String strCourses;
        String strSticksLeft;
        int sticksLimit;

        if(isUsing) {
            sticksLimit = 58;
        } else {
            sticksLimit = 20;
        }

        int courseCounter = 0;
        int sticksLeft = 0;

        while(sticks > 0) {
            courseCounter++;
            int currentSticks = 0;   //course

            for (int i = 1; i <= people; i++) {
                currentSticks += sticksLimit;   //sticks this course

                if(sticks < currentSticks) {
                    sticksLeft = currentSticks - sticks;
                    break;
                }
            }

            System.out.printf("Course %d: %d sticks%n", courseCounter, currentSticks);   //display sticks per course
            sticks -= currentSticks;   //use sticks
        }

        if(courseCounter == 1) {
            strCourses = "course";
        } else {
            strCourses = "courses";
        }

        if(sticksLeft == 1) {
            strSticksLeft = "lonely stick left";
        } else {
            strSticksLeft = "lonely sticks left";
        }

        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.printf("We need to take %d %s%n", courseCounter, strCourses);
        System.out.printf("There are %d %s%n", sticksLeft, strSticksLeft);

        System.out.println("===================================================");
    }

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            command = scanner.nextLine();

            while(!command.matches("-?\\d+")) {
                System.out.println();
                System.out.println("!==========Error==========!");
                System.out.println();
                System.out.println("Option must be a whole number");
                displayMenu();
                command = scanner.nextLine();
            }
            choice = Integer.parseInt(command);

            switch (choice) {
                case 0 -> {
                    System.out.println();
                    System.out.println("Open the window and watch the stars at night...");
                    System.out.println("Shrek will come, don't worry everything will be alright :)");
                    System.out.println();
                    System.exit(0);
                }
                case 1 -> calcLogs();
                case 2 -> calcRocks();
                case 3 -> calcSticks();
            }
        } while (true);
    }
}