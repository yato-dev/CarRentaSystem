import java.util.Scanner;

public class CarRentalSystemMain {
    public static void main(String[] args) throws Exception {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        Scanner scanner = new Scanner(System.in);

        int x = 1;
        while (x == 1) {

            int y;
            System.out.println("---Welcome to car rental System---");
            System.out.println("Choose from the following services");
            System.out.println("1. Add a car");
            System.out.println("2. update a car");
            System.out.println("3. delete a car");
            System.out.println("4. Add a customer");
            System.out.println("5. Update a customer");
            System.out.println("6. Delete a customer");
            System.out.println("7. Rent a car ");
            System.out.println("8. Return a car");
            System.out.println(" 9. view history by customer");
            System.out.println("10. view history by car");
            System.out.println("11. view available cars");
            System.out.println("12. exit");
            System.out.println("Enter your choice");
            try {
                y = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (y) {
                case 1: {
                    System.out.println("Enter registration number");
                    String temp = scanner.nextLine();
                    System.out.println("Enter car make");
                    String make = scanner.nextLine();
                    System.out.println("Enter car model");
                    String model = scanner.nextLine();
                    System.out.println("Enter car year");
                    String year = scanner.nextLine();
                    System.out.println("Enter car color");
                    String color = scanner.nextLine();
                    System.out.println("Enter car price");
                    String price = scanner.nextLine();

                    carRentalSystem.addCar(temp, new Car(make, model, year, color, price));

                }
                    break;
                case 2: {
                    System.out.println("Enter registration number");
                    String temp = scanner.nextLine();
                    System.out.println("Enter car make");
                    String make = scanner.nextLine();
                    System.out.println("Enter car model");
                    String model = scanner.nextLine();
                    System.out.println("Enter car year");
                    String year = scanner.nextLine();
                    System.out.println("Enter car color");
                    String color = scanner.nextLine();
                    System.out.println("Enter car price");
                    String price = scanner.nextLine();

                    carRentalSystem.updateCar(temp, new Car(make, model, year, color, price));

                }
                    break;
                case 3: {
                    System.out.println("Enter registration number");
                    String temp = scanner.nextLine();
                    carRentalSystem.deleteCar(temp);

                }
                    break;
                case 4: {
                    System.out.println("Enter Customer ID");
                    String temp = scanner.nextLine();
                    System.out.println("Enter Customer Name");
                    String temp2 = scanner.nextLine();
                    System.out.println("Enter Contact Information");
                    String temp3 = scanner.nextLine();

                    Customer customer = new Customer(temp2, temp3);
                    carRentalSystem.addCustomer(temp, customer);

                }
                    break;
                case 5: {
                    System.out.println("Enter Customer ID");
                    String temp = scanner.nextLine();
                    System.out.println("Enter Customer Name");
                    String temp2 = scanner.nextLine();
                    System.out.println("Enter Contact Information");
                    String temp3 = scanner.nextLine();

                    Customer customer = new Customer(temp2, temp3);
                    carRentalSystem.updateCustomer(temp, customer);

                }
                    break;
                case 6: {
                    System.out.println("Enter Customer ID");
                    String temp = scanner.nextLine();

                    carRentalSystem.deleteCustomer(temp);

                }
                    break;
                case 7: {

                    System.out.println("Enter Registration ID");
                    String temp = scanner.nextLine();
                    System.out.println("Enter Customer ID");
                    String temp2 = scanner.nextLine();
                    System.out.println("Enter rental Date");
                    String temp3 = scanner.nextLine();
                    System.out.println("Enter rental Duration");
                    int temp4 = scanner.nextInt();
                    scanner.nextLine();
                    carRentalSystem.rentCar(temp, temp2, temp3, temp4);

                }
                    break;
                case 8: {

                    System.out.println("Enter Registration ID");
                    String temp = scanner.nextLine();
                    System.out.println("Enter Return Date");
                    String temp2 = scanner.nextLine();

                    carRentalSystem.returnCar(temp, temp2);

                }
                    break;
                case 9: {
                    System.out.println("Enter Customer ID");
                    String temp2 = scanner.nextLine();

                    carRentalSystem.viewRentalHistoryByCustomer(temp2);

                }
                    break;
                case 10: {
                    System.out.println("Enter registration number");
                    String temp2 = scanner.nextLine();

                    carRentalSystem.viewRentalHistoryByCar(temp2);

                }
                    break;
                case 11: {
                    carRentalSystem.displayAvailableCars();
                }
                    break;
                    case 12:
                    {
                        x=0;
                    }
                default: {
                    System.out.println("invalid value");
                }

            }

        }
        scanner.close();
    }
}
