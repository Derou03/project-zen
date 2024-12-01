import java.util.Scanner;

public class Main {

    public static double calculateDropChance(double dropChance, int attempts) {

        double noDropChance = 1 - dropChance;
        
        double noDropInAllAttempts = Math.pow(noDropChance, attempts);
        
        double dropInAllAttempts = 1 - noDropInAllAttempts;
        
        return dropInAllAttempts;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the drop chance (as a decimal, e.g., 0.2 for 20%): ");
        double dropChance = scanner.nextDouble();
        
        System.out.print("Enter the number of attempts: ");
        int attempts = scanner.nextInt();
        
        double result = calculateDropChance(dropChance, attempts);
        System.out.printf("The chance of the item dropping at least once after %d attempts is: %.2f%%\n", 
                          attempts, result * 100);
        
        scanner.close();
    }
}
