package _01FirstSteps_Lecture;

import java.util.Scanner;

public class _07ProjectsCreation {
    public static void main(String[] args) {
        String name;
        int projects;
        int totalTime;
        do {
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
            projects = Integer.parseInt(scanner.nextLine());
            //Един проект се изготвя за 3 часа
            totalTime = projects * 3;

        } while(projects < 0 || projects > 100);
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, projects);
    }
}