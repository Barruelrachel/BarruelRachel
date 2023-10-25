import java.util.Scanner;

public class RouteActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RouteActivity route = new RouteActivity();

        int one = 0;
        int two = 0;

        System.out.println("Going To Moalboal");
        route.Route_Barili();

        System.out.println("Is Barili Obstructed? (1 = yes or 0 = no)");
        one = scan.nextInt();

        double fixedSpeed = 60; // Fixed speed in km/hr
        double totalDistance = 0;

        if (one == 0) {
            System.out.println("Default Route:");
            totalDistance += route.Route_Barili(); // Update total distance
        } else {
            while (one != 0) {
                System.out.println("Is Dumanjug Obstructed? (1 = yes or 0 = no)");
                two = scan.nextInt();

                if (two == 0 && one == 1) {
                    System.out.println("Recommended Route:");
                    totalDistance += route.Route_Dumanjug(); // Update total distance
                    break;
                } else if (two == 0 && one == 0) {
                    System.out.println("Default Route:");
                    totalDistance += route.Route_Barili(); // Update total distance
                    break;
                } else {
                    totalDistance += route.Route_Argao(); // Update total distance
                    break;
                }
            }
        }

        // Prompt the user to enter the distance they plan to travel
        System.out.println("How far are you going (in km)?");
        double userDistance = scan.nextDouble();
        totalDistance += userDistance; // Update total distance

        // Calculate estimated time of arrival based on the fixed speed and total distance
        double estimatedTimeArrivalHours = totalDistance / fixedSpeed;
        int estimatedTimeArrivalMinutes = (int) ((estimatedTimeArrivalHours - (int) estimatedTimeArrivalHours) * 60);

        // Additional Data
        System.out.println("\nAdditional Data:");
        System.out.println("> Fixed Speed: " + fixedSpeed + " km/hr");
        System.out.println("> Total Distance: " + totalDistance + " km");
        System.out.println("> Estimated Time Arrival: " + (int) estimatedTimeArrivalHours + " hours and " + estimatedTimeArrivalMinutes + " minutes");
    }

    public double Route_Barili() {
        System.out.println("> Cebu City (Start)");
        System.out.println("> Minglanilla (Route 1)");
        System.out.println("> San Fernando (Route 2)");
        System.out.println("> CarCar (Route 3)");
        System.out.println("> Barili (Route 4)");
        System.out.println("> Dumanjug (Route 4.1)");
        System.out.println("> Alcantara (Route 4 1.1)");
        System.out.println("> Moalboal (End)\n");
        return 40; // Return the distance of this route (in km)
    }

    public double Route_Dumanjug() {
        System.out.println("> Cebu City (Start)");
        System.out.println("> Minglanilla (Route 1)");
        System.out.println("> San Fernando (Route 2)");
        System.out.println("> CarCar (Route 3)");
        System.out.println("> Sibonga (Route 4.2)");
        System.out.println("> Dumanjug (Route 4 2.1)");
        System.out.println("> Alcantara (Route 4 2.2)");
        System.out.println("> Moalboal (End)\n");
        return 30; // Return the distance of this route (in km)
    }

    public double Route_Argao() {
        System.out.println("> Cebu City (Start)");
        System.out.println("> Minglanilla (Route 1)");
        System.out.println("> San Fernando (Route 2)");
        System.out.println("> CarCar (Route 3)");
        System.out.println("> Sibonga (Route 4.2)");
        System.out.println("> Argao (Route 5)");
        System.out.println("> Ronda (Route 5.1)");
        System.out.println("> Alcantara (Route 5.2)");
        System.out.println("> Moalboal (End)\n");
        return 50; // Return the distance of this route (in km)
    }
}
