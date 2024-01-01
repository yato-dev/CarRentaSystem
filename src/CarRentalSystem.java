import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {
    Scanner scanner= new Scanner(System.in);

        public HashMap<String, Boolean> carAvailabilityMap;
        public HashMap<String, Customer> customerMap;
        public HashMap<String, Car> carDetailsMap;
        public HashMap<String, RentalTransaction> rentalHistoryMap;
        

        public CarRentalSystem(){
            this.carAvailabilityMap=new HashMap<>();
            this.customerMap=new HashMap<>();
            this.carDetailsMap=new HashMap<>();
            this.rentalHistoryMap=new HashMap<>();
        }

  
       

        

        public void addCar(String registrationNumber,Car car){
            carAvailabilityMap.put(registrationNumber,true);
            carDetailsMap.put(registrationNumber,car);
            System.out.println("Car with details " + car.toString() + " added successfully");
        }

        public void updateCar(String registrationNumber, Car updatedCar)
        {
            if(carDetailsMap.containsKey(registrationNumber))
            {
                carDetailsMap.put(registrationNumber, updatedCar);
                System.out.println("Car with details " + updatedCar.toString() + " updated successfully");

            }
            else
            System.out.println("Car not found");
        }

        public void deleteCar(String registrationNumber){
            carAvailabilityMap.remove(registrationNumber);
            carDetailsMap.remove(registrationNumber);
            System.out.println("Car deleted successfully");
        }

        public void addCustomer(String customerId, Customer customer){
            customerMap.put(customerId, customer);
            System.out.println("Customer with details " +customer.toString() + " added successfully");
        }

        public void updateCustomer(String customerId, Customer updatedCustomer){
            if(customerMap.containsKey(customerId))
            {
                customerMap.put(customerId, updatedCustomer);
                System.out.println("Customer with details " + updatedCustomer.toString() + " updated successfully");
            }
            else
            System.out.println("Customer not found");
        }

        public void deleteCustomer(String customerId)
        {
            customerMap.remove(customerId);
            System.out.println(" Customer deleted successfully");
        }


        public void rentCar(String registrationNumber,String customerId,String rentalDate, int rentalDuration){
           if(carAvailabilityMap.containsKey(registrationNumber)&& carAvailabilityMap.get(registrationNumber)){
            Customer customer=customerMap.get(customerId);
            Car car=carDetailsMap.get(registrationNumber);

            carAvailabilityMap.put(registrationNumber,false);

            RentalTransaction rentalTransaction= new RentalTransaction(rentalDate, null, rentalDuration, customer, car);
            rentalHistoryMap.put(registrationNumber, rentalTransaction);
            System.out.println("Car with registration number " + registrationNumber + " Successfully rented out");
           }
           else
           {
            System.out.println("Car with registration number " + registrationNumber + " not available for rent");
           }
        }


        public void returnCar(String registrationNumber, String returnDate){
            if(carAvailabilityMap.containsKey(registrationNumber) && !carAvailabilityMap.get(registrationNumber)){
                carAvailabilityMap.put(registrationNumber, true);

                RentalTransaction rentalTransaction=rentalHistoryMap.get(registrationNumber);
                rentalTransaction.setReturnDate(returnDate);
                System.out.println("Car with registration number " +registrationNumber + " successfully returned");
            }
            else{
                System.out.println("Car with registration number" + registrationNumber + " not rented");
            }

        }

        public void viewRentalHistoryByCustomer(String customerId){
            System.out.println("Rental History for Customer ID" + customerId + " :");
            for(RentalTransaction rentalTransaction: rentalHistoryMap.values()){
                if(rentalTransaction.getCustomer().equals(customerMap.get(customerId))){
                    System.out.println(rentalTransaction);
                }
            }
        }

        public void viewRentalHistoryByCar(String registrationNumber){
            System.out.println("Rental History for Car with registration numner:" + registrationNumber + " :");
            if(rentalHistoryMap.containsKey(registrationNumber)){
                System.out.println(rentalHistoryMap.get(registrationNumber));
                
            }
            else{
                System.out.println("No history was found");
            }
        }

        public void displayAvailableCars() {
            System.out.println("Available Cars:");
            for (String registrationNumber : carAvailabilityMap.keySet()) {
                if (carAvailabilityMap.get(registrationNumber)) {
                    System.out.println(registrationNumber);
                }
            }
        }
    
   
}

