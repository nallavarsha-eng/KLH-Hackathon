import java.util.Scanner;
public class SolarEnergy2c {
    static double calculateSolarEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the morning energy (in kWh): ");
        double morningEnergy = sc.nextDouble();
        System.out.println("Enter the evening energy (in kWh): ");
        double eveningEnergy = sc.nextDouble();
        double totalEnergy = calculateSolarEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total solar energy (in kWh): " + totalEnergy);
        sc.close();
    }
    }
