package schoolManagementSystem;
import java.util.Scanner;
import entity.Teacher;
import entity.Student;


public class Menu {
	static Student stu = new Student();	
	static Student[] array = null;
	static Teacher teac = new Teacher();
	static Teacher[] arrays = null;
	
	static void options() {
		int option=0 , option1 = 0 , num =0 , num1 =0;
				
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("-".repeat(50));
			System.out.println("Choose an option" + "\n" + "1 . Student " + "\n" + "2 . Teacher " + "\n" + "3 . Exit");
			System.out.println("-".repeat(50));
			option = scanner.nextInt();
			int insert =0;
			switch(option) {
			case 1 :
				
				do {
					System.out.println("-".repeat(50));
				System.out.println(" 1. Insert student record \n 2. View student record\n 3. Search student by first name\n "
						+ "4. Search student by roll no\n 5. Search student by phone number\n 6. Search student by Department\n "
						+ "7. Enter any other number to exit ");
				System.out.println("-".repeat(50));
				
				option1 = scanner.nextInt();
			
				switch(option1) { // For Student
				case 1 : 
					System.out.println("Enter no of records to insert : ");
					 num = scanner.nextInt();
					array = new Student[num];
					for (int i = 0 ;i < num; i++) {
						array[i] = new Student();
						array[i].insert();
						insert++;
					
					}
					break;
						
					
				case 2 : 
					if(insert == 0) {
						stu.message();
						break;
						
					}
					for(int i=0 ; i<num ; i++ ) {
							array[i].display();			
						
						
					}
					break;
				case 3 :
					if(insert == 0) {
						stu.message();
						break;
					}
					System.out.println("Enter the student first name to search : ");
					String name = scanner.next();
					Student[] st = stu.searchByName(array, name);
					break;
			      
				case 4 :
					if(insert != 0) {
						
					
					System.out.println("enter roll no to search");
					int rollnos = scanner.nextInt();
					Student[] rollno = stu.searchByRollno(array, rollnos);}
					else {
						stu.message();
						
					}
					break;
					
				case 5:
					if(insert != 0) {
						
					
					System.out.println("enter phone number to search");
					int phn_nums = scanner.nextInt();
					Student[] nums = stu.searchByPhnNum(array, phn_nums);}
					else {
						stu.message();
						
					}
					break;
				case 6:
					if(insert != 0) {
						
					
					System.out.println("enter department to search");
					String depts = scanner.next();
					Student[] depart = stu.searchByDept(array, depts);}
					else {
						stu.message();
						break;
					}
					break;
				case 7:
					scanner.close();
					System.exit(0);							
					
				}
			}while(option1 < 8);
				
				// For teacher
				
			case 2:
				do {
					System.out.println("-".repeat(50));
					System.out.println(" 1. Insert teacher record \n 2. View teacher record\n 3. Search teacher by first name\n "
							+ "4. Search teacher by id \n 5. Search teacher by phone number\n 6. Search teacher by Department\n "
							+ "7. Enter any other number to exit ");
					System.out.println("-".repeat(50));
					option1 = scanner.nextInt();
					int insert1 =0;
					switch(option1) {
					case 1:
						System.out.println("Enter number of records to insert");
						num1 = scanner.nextInt();
						arrays = new Teacher[num1];
						for(int i =0 ; i<arrays.length ; i++) {
							arrays[i] = new Teacher();
							insert++;
							arrays[i].insert();				
						
							
								
						}
						break;
					case 2:
						if(insert !=0) {
							for (int i=0; i<arrays.length; i++) {
								arrays[i].display();
								
							}
						}
						
						else {
							teac.message();							
						}
						break;
					
					case 3:
						if (insert !=0) {
							System.out.println("Enter first name to search");
							String name = scanner.next();
							Teacher[] teach = teac.searchByName(arrays, name);
						}
						else {
							teac.message();
						}
						break;
					case 4:
						if(insert!=0) {
							System.out.println("Enter id to search");
							int ids = scanner.nextInt();
							Teacher[] idd = teac.searchById(arrays, ids);
						}
						else {
							teac.message();
						}
						break;
					case 5:
						if(insert!=0) {
							System.out.println("Enter phone number to serach : ");
							int phone = scanner.nextInt();
							Teacher[] phnum = teac.searchByPhnNum(arrays, phone);
						}
						else {
							teac.message();
						}
						break;
					case 6:
						if(insert!=0) {
							System.out.println("Enter department to search");
							String dep = scanner.next();
							Teacher[] dpeart = teac.searchByDept(arrays, dep);
						}
						else {
							teac.message();
						}
						break;
					case 7:
						scanner.close();
						System.exit(0);
						
						
					}
					
						
						
					
					
				}while(option1<8);
			case 3:
				scanner.close();
				System.exit(0);
			
				
				
			}
			
			
			
	
		 
		
	}while(option < 3);

}
}