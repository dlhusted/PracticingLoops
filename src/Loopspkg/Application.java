package Loopspkg;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 //for loops - if you know how many times you want to iterate
	
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		for(int i = 1; i <= 10; i++) {
		System.out.println(i);
		}
		
//print even numbers		
		for (int i = 0; i < 100; i ++) {
			if (i %2 == 0) {
				System.out.println(i);
			}
		}
// while loop	do somehting over and over until condition is met dont knnow how many times needed
		
		int x = 0;
		while(x < 1) {
			System.out.println(x);
			x++;
		}
// do while loop
		do {
			System.out.println(x);
			x++;
		} while (x < 2);
		
		
// do while loop practice openclass 1
		
	String userWord = "Java";
		
	int wordLength = userWord.length();
	int counter = wordLength;
	
	if (userWord.length() < 5) {
		System.out.println(userWord);
	} else {
	
	do {
		System.out.println(userWord);
		counter --;
	} while (counter > 0);
	}
// instructor version	you can use a break to stop after the first iteration of the do while code since it is guaranteed to at least run once
	do {
		    System.out.println(userWord);
		    if ( wordLength < 5 ) {
		        break;
		    } 
		    counter--;
		} while ( counter > 0 );
		
	}

	
// FOR LOOP practice openclass: userValue increments
		
		int userValue;
		userValue = 15;
	
		int i;
		
		for (i = 1; i <= 100; i+= userValue) {
			if (userValue > 0) {
				System.out.println(i);
			} else {
				System.out.println("Your number needs to be greater than 0.");
				break;
			}
		}
 //instructor version
		if ( userValue > 0 ) {
            for (i = 1; i <= 100; i = i + userValue ) {
                System.out.println(i);
            }
        } else {
            System.out.println("Your number needs to be greater than 0.");
        }

// while loop practice openclass
		
		
	int userNumber = 7;
	int counter;
	int i;
	
	if (userNumber >= 1 && userNumber <= 100) {
		 while(userNumber <= 100) {
			 for (i= userNumber; i <= 100; i++ ) {
				 System.out.println(i);
			 }break;
		 }
	} else {
		System.out.println("Your number was not between 1 and 100.");
	}
	
	//instructor version
	
	
	counter = userNumber;
    if ( userNumber <= 100 && userNumber >= 1 ) {
        while ( counter <= 100 ) {
            System.out.println(counter++);
        }
    } else {
        System.out.println("Your number was not between 1 and 100.");
    }

			
// openclass:  exponents	
	int base = 5;
	int power = 2;
	int result = 1;
	int i;
	
	
	for (i = 1; i <= power; i++) {
		result *= base;
		System.out.println(result);
		}
	
// while loop example		
int userNumber = 34;
int counter = userNumber;
int i;

counter = userNumber;
if ( userNumber > 10 && userNumber < 100 ) {
    while ( counter > 10 ) {
        System.out.println(counter--);
    }
} else {
    System.out.println("Your number is not between 10 and 100.");
}

// for loop example to concatenate the word by however many characters it has.
String userWord = "Java";
String longString = " ";
int i;


for (i = 0; i < userWord.length(); i++) {
	longString += userWord;
		}
System.out.println(longString);

// for loop prints number 50		
		int counter = 0;
		for ( int i = 1; i < 100; i += 2) {
			counter ++;
		}
		System.out.println(counter);
		

		
//do while loop
int numToAdd = 4;
int howManyTimes = 7;
int sumResult = 0;	

	
do{
	sumResult += numToAdd;
	howManyTimes--;
} while (howManyTimes > 0);
		
System.out.println(sumResult);		
		

		
// another for loop
	int countDown = 8;
	int i;
		for (i = countDown; i > 0; i--) {
			if (countDown <= 10 && countDown >= 3)
			  System.out.println(i + "...");
			   
			} System.out.println("We have lift off!");

		
// for loop example multiplication tables
		
	int num = 10;
	int i;
	
	
	System.out.println("Multiplication Table of " + num);	
	
	for (i = 1; i <= 10; i++) {
		int e = num * i;
	System.out.println(num + " x " + i + " = " + e);
	}
// instructor version
	System.out.println("Multiplication Table of " + num);

    for(int i=1; i<=10; i++) {
        System.out.println(num +" x " + i + " = " + (num*i) );
    }
	
*/			
		
		
		
	
	
		
		
		}
		
		
	}

	
