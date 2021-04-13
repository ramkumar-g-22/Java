import java.util.Scanner;

public class BookingCar {
 	private static final int amountPerKilometerForSmallCar = 10;
	private static final int amountPerKilometerForBigCar = 15;
	static byte smallCar = 1;
	static byte bigCar = 2;
	static Scanner scanner = new Scanner(System.in);
	static byte carType;

	public static void main(String[] args) {
		getCarType();
	}

	
	/**
	 * This method get the car type from the user.
	 */
	private static void getCarType() {
		// TODO Auto-generated method stub
		System.out.println("1 - Small Car " + "\n" + "2 - Big Car");
		System.out.print("Enter Car Type : ");
		carType = scanner.nextByte();
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
			calculateAmountForSmallCar();
		}
		else if(carType == bigCar) {
			System.out.println("You have Chosen Big Car");
			calculateAmountForBigcar();
		}
		else {
				System.out.println("Invalid Car Type. Please enter valid car type");
				getCarType();
			}
		}

	/**
	 * Gets the kilometer from the user and calculate the amount for it.
	 */
	private static void calculateAmountForBigcar() {
		int kilometer = getKilometer();
		int amount = calculateAmount(amountPerKilometerForBigCar, kilometer);
		System.out.println("Amount : " + amount);
	}

	/**
	 * Gets the kilometer from the user and calculate the amount for it.
	 */
	private static void calculateAmountForSmallCar() {
		int kilometer = getKilometer();
		int amount = calculateAmount(amountPerKilometerForSmallCar, kilometer);
		System.out.println("Amount : " + amount);
	}
	
	/**
	 * Calculating the amount for small and big car.
	 * @param amountPerKilometer
	 * @param kilometer
	 * @return amount
	 */
	private static int calculateAmount(int amountPerKilometer, int kilometer) {
		int amount = amountPerKilometer * kilometer;
		return amount;
	}


	/**
	 * Gets the kilometer from the user.
	 * @return kilometer
	 */
	private static int getKilometer() {
		System.out.print("How many kilometer you wanna go : ");
		Scanner scanner = new Scanner(System.in);
		int kilometer = scanner.nextInt();
		scanner.close();
		return kilometer;
	}

}
