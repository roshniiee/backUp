package ui;

import java.util.Scanner;

import service.VehicleService;

public class Main {
	public static void main(String args[]) {
		int ch;
		char choice;
		VehicleView vobj=new VehicleView();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n *********************\n MENU\n 1.Add vehicle details  \n  "
					+ "2.Get vehicle details\n 3.exit\n");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				vobj.addVehicleDetails();
				break;
		
             case 2:
            	 vobj.getVehicleDetails();
				break;
          
             case 3:
				System.out.println("exit");
				System.exit(0);
			}
			System.out.print("Do you want to continue (y/n)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You !");
				System.exit(0);
			}
	}while(ch!=3);
		sc.close();

}
}



