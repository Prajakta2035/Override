import java.util.Scanner;

class Add{
	public void ope(int x,int y){
		int a=x;
		int b=y;
		int c=a+b;
		
		System.out.println("Addition is:: "+c);
	}
}
class Sub extends Add{
	public void ope(int x,int y){
		int a=x;
		int b=y;
		int c=a-b;
		System.out.println("Substraction is:: "+c);
	}
}
class Mul extends Sub{
	public void ope(int x,int y){
		int z=x*y;
		System.out.println("Multiplication is:: "+z);
	}
}
class Div extends Sub{
	public void ope(int x,int y){
		int z=x/y;
		System.out.println("Division is:: "+z);
	}
}
class Calci_63{
	public static void main(String args []){
		int ch,ans;
		do{
		System.out.println("enter any two values:: ");
		Scanner sc=new Scanner(System.in);
	        int p=sc.nextInt();
		int q=sc.nextInt();	
		
		    System.out.println("Which operation you want to perform?\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
		    ch=sc.nextInt();
		    switch(ch){
		    	case 1:
				Add a=new Add();
				a.ope(p,q);
				break;
			case 2:
				Sub s=new Sub();
				s.ope(p,q);
				break;
			case 3:
				Mul m=new Mul();
				m.ope(p,q);
				break;
			case 4:
				Div d=new Div();
				d.ope(p,q);
				break;
			default:
				System.out.println("Invalid input");

		    }
		    System.out.println("Do you want to continue?\n1.yes\n2.no");
		    ans=sc.nextInt();

		}while(ans==1);
	}
}

