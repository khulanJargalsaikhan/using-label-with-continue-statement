
public class App {

	public static void main(String[] args) {
		// learning continue statement

		//EXAMPLE 1
		CLEANING: for(char stables='a'; stables<='d'; stables++) {
			for(int leopard=1; leopard<4; leopard++) {
				if(stables =='b' || leopard == 2) {
					//on the second execution of the outer loop, the inner loop immediately
					//exits without printing anything since b is encountered right away. 
					continue CLEANING;
				}
				System.out.println("Example 1: Cleaning: " + stables + "," + leopard);
				/* output
				Cleaning: a,1
				Cleaning: c,1
				Cleaning: d,1
				 */
			}
		}

		System.out.println();


		//EXAMPLE 2
		CLEANING: for(char stables='a'; stables<='d'; stables++) {
			for(int leopard=1; leopard<4; leopard++) {
				if(stables =='b' || leopard == 2) {
					//printing all stables and leopard except those labeled 2
					//or in stable b.
					continue;
				}
				System.out.println("Example 2: Cleaning: " + stables + "," + leopard);
				/* output
				Cleaning: a,1
				Cleaning: a,3
				Cleaning: c,1
				Cleaning: c,3
				Cleaning: d,1
				Cleaning: d,3
				 */
			}
		}
		System.out.println();
		

		//EXAMPLE 3
		CLEANING: for(char stables='a'; stables<='d'; stables++) {
			for(int leopard=1; leopard<4; leopard++) {
				if(stables =='b' || leopard == 2) {
					//without continue statement 
					//prints all the values
					
				}
				System.out.println("Example 3: Cleaning: " + stables + "," + leopard);
				/* output
			Example 3: Cleaning: a,1
			Example 3: Cleaning: a,2
			Example 3: Cleaning: a,3
			Example 3: Cleaning: b,1
			Example 3: Cleaning: b,2
			Example 3: Cleaning: b,3
			Example 3: Cleaning: c,1
			Example 3: Cleaning: c,2
			Example 3: Cleaning: c,3
			Example 3: Cleaning: d,1
			Example 3: Cleaning: d,2
				 */
			}
		}


	}

}
