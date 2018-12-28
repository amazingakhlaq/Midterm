package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int i;
		int num = 0;
		int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
		boolean isPrime = true;

		//Empty String
		String primeNumbersFound = "";

		//Start loop 1 to maxCheck
		for (i = 1; i <= maxCheck; i++) {
			isPrime = CheckPrime(i);
			if (isPrime) {
				primeNumbersFound = primeNumbersFound + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + maxCheck + " are:");

		/*for (Integer in : list)
			System.out.println(in);*/
		//List<String> lowestValue = new ArrayList<String>();
		//ConnectDB connectDB = new ConnectDB();


		try {
			//connectDB.insertDataFromArrayListToMySql(list, "mathTable", "number");
			//lowestValue = connectDB.readDataBase("mathTable", "number");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Data is reading from the Table (mathTable) and displaying to the console");
		//for (String st : lowestValue) {
		//System.out.println(st);
		// Print prime numbers from 1 to maxCheck
		System.out.println(primeNumbersFound);


	}
	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			//if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}

	}


