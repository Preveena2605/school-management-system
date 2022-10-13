package entity;
import java.util.Scanner;

public class Teacher extends persons {
		double salary; 
		String sub;
		
		Scanner scanner = new Scanner(System.in);
		
		public Teacher ( String f_name, String l_name , int id, String gender, int phn_num , String dept , double salary, String sub) {
			super();
			
			
			this.f_name = f_name;
			this.gender = gender;
			this.id = id;
			this.l_name = l_name;
			this.phn_num = phn_num;
			this.dept = dept; 
			this.salary = salary;
			this.sub = sub;
			}

		public Teacher() {
			// TODO Auto-generated constructor stub
		}

		public	void insert() {
			System.out.println("Enter Teacher first name : ");
			f_name= scanner.next();
			System.out.println("Enter Teacher  last name : ");
			l_name= scanner.next();
			System.out.println("Enter Teacher id : ");
			id = scanner.nextInt();
			System.out.println("Enter Teacher gender : ");
			gender = scanner.next();
			System.out.println("Enter Teacher phone number : ");
			phn_num = scanner.nextInt();
			System.out.println("Enter Teacher department : ");
			dept = scanner.next();
			System.out.println("Enter Teacher subject : ");
			sub = scanner.next();
			System.out.println("Enter Teacher salary : ");
			salary = scanner.nextDouble();
		}
		
		public	void display() {
			System.out.println("       Teacher       ");
			System.out.println(" Name : " + (f_name + " " + l_name) +"\n "+"Id : "+id+"\n "+"Gender : " + gender +"\n "+"Phone number : " + phn_num +"\n "+
					"Dept : " + dept + "\n" + " Salary : " + salary +"\n "+ "Sub : " + sub);
			System.out.println("-".repeat(50));
		}
		public Teacher[] searchByName(Teacher[] arr , String name) {
			int j =0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i].getF_name().equals(name)) {
					arr[i].display();
					j++;				
				}
				
				}
			if (j == 0) {
				System.out.println("No record found");
			}
			return null;
			
		}
		
		public Teacher[] searchById(Teacher arr[] , int id) {
			int j =0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i].getId() == id) {
					arr[i].display();
					j++;				
				}
				
				}
			if (j == 0) {
				System.out.println("No record found");
			}
			return null;
			
		}
		public Teacher[] searchByPhnNum(Teacher arr[] , int num) {
			int j =0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i].getPhn_num() == num) {
					arr[i].display();
					j++;				
				}
				
				}
			if (j == 0) {
				System.out.println("No record found");
			}
			return null;
			
		}
		public Teacher[] searchByDept(Teacher arr[] , String dept) {
			int j =0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i].getDept().equals(dept)) {
					arr[i].display();
					j++;				
				}
				
				}
			if (j == 0) {
				System.out.println("No record found");
			}
			return null;
			
		}
		public void message() {
			System.out.println("Insert record first");
		}

		
	}


