// write a program to check the given number is even or odd with help of swtitch case statement

class pro15{
public static void main(String[] args){

int number = 20;


int check = (number % 2);

switch(check){

case 0:
	System.out.println("the number is even "+ number);
break;

case 1:
	System.out.println("the number is odd "+ number);
break;


}

}

}