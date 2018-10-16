import java.util.Scanner;
public class Review {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(n != 1) {
			System.out.println("Enter a number from 1 to 7");
			int z = sc.nextInt();
			switch(z) {
				case 1:
					int y, r, even = 0;
					System.out.println("Enter a number");
					y = Integer.parseInt(sc.next());
					while (y != 0) {
						r = y & 10;
						y = y / 10;
						if (r % 2 == 0) {
							even ++;
						}
						}
						System.out.println("There are " + even + " even numbers in this number");
					System.out.println("Do you want to choose another number?");
					int anothernum = sc.nextInt();
					if (anothernum < 1);
						n = 1;	
					break;
				case 2:
					System.out.println("Do you want to choose another number?");
					int anothernum2 = sc.nextInt();
					if (anothernum2 < 1);
						n = 1;
					break;
				case 3:
					System.out.println("Enter a number to know its inverted");
					int x, inverted = 0, r3;
					x = sc.nextInt();
					while (x > 0) {
						r3= x % 10;
						inverted = inverted * 10 + r3;
						x /= 10;
					}
					System.out.println("Inverted number " + inverted);
					
					System.out.println("Do you want to choose another number?");
					int anothernum3 = sc.nextInt();
					if (anothernum3 < 1);
						n = 1;
						
					break;
				case 4:
					System.out.println("Do you want to choose another number?");
					int anothernum4 = sc.nextInt();
					if (anothernum4 < 1);
						n = 1;
					break;
				case 5:
					System.out.println("Do you want to choose another number?");
					int anothernum5 = sc.nextInt();
					if (anothernum5 < 1);
						n = 1;
					break;
				case 6:
					System.out.println("Do you want to choose another number?");
					int anothernum6 = sc.nextInt();
					if (anothernum6 < 1);
						n = 1;
					break;
				case 7:
					System.out.println("Do you want to choose another number?");
					int anothernum7 = sc.nextInt();
					if (anothernum7 < 1);
						n = 1;
					break;
				default:
					System.out.println("Enter a valid number");
					break;
		}
			
		}
		}
	}


