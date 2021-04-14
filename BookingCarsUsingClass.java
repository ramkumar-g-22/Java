import java.util.Scanner;

public class BookingCarsUsingClass {
	private static final byte smallCar = 1;
	private static final byte bigCar = 2;

    public static void main(String[] args) {
        getCarType();
    }
    
    private static void getCarType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Small Car " + "\n" + "2 - Big Car");
		System.out.print("Enter Car Type : ");
		byte carType = scanner.nextByte();
		validatingCarType(carType);
		scanner.close();
	}

    	/**
	 * This method validate the car type. 
	 * If the car type is small, it will calculate amount for small car with 
	 * calculateAmountForSmallCar() function.
	 * Else if the car type is big, it will calculate amount for big car with 
	 * calculateAmountForBigCar() function.
	 * Otherwise calls the getCarType() function.
	 * @param carType
	 */
	private static void validatingCarType(byte carType) {
		if(carType == smallCar) {
			System.out.println("You have Chosen Small Car");
			// calculateAmountForSmallCar();
            SmallCar smallCar = new SmallCar();
            smallCar.calculateAmountForSmallCar();
		}
		else if(carType == bigCar) {
			System.out.println("You have Chosen Big Car");
			// calculateAmountForBigcar();
            BigCar bigCar = new BigCar();
            bigCar.calculateAmountForBigCar();
		}
		else {
				System.out.println("Invalid Car Type. Please enter valid car type");
				getCarType();
			}
		}
}

class SmallCar {
    private final int amountPerKilometerForSmallCar = 10;
    /**
	 * Gets the kilometer from the user and calculate the amount for it.
	 */
	public void calculateAmountForSmallCar() {
		int kilometer = getKilometer();
		int amount = calculateAmount(amountPerKilometerForSmallCar, kilometer);
		System.out.println("Amount : " + amount);
	}

    private int calculateAmount(int amountPerKilometer, int kilometer) {
		int amount = amountPerKilometer * kilometer;
		return amount;
	}

        /**
	 * Gets the kilometer from the user.
	 * @return kilometer
	 */
	private int getKilometer() {
		System.out.print("How many kilometer you wanna go : ");
		Scanner scanner = new Scanner(System.in);
		int kilometer = scanner.nextInt();
		scanner.close();
		return kilometer;
	}



}

class BigCar {
    private final int amountPerKilometerForBigCar = 15;
    /**
	 * Gets the kilometer from the user and calculate the amount for it.
	 */
	public void calculateAmountForBigCar() {
		int kilometer = getKilometer();
		int amount = calculateAmount(amountPerKilometerForBigCar, kilometer);
		System.out.println("Amount : " + amount);
	}

    private int calculateAmount(int amountPerKilometer, int kilometer) {
		int amount = amountPerKilometer * kilometer;
		return amount;
	}

        /**
	 * Gets the kilometer from the user.
	 * @return kilometer
	 */
	private int getKilometer() {
		System.out.print("How many kilometer you wanna go : ");
		Scanner scanner = new Scanner(System.in);
		int kilometer = scanner.nextInt();
		scanner.close();
		return kilometer;
	}

}

