package entity;

import java.util.Scanner;

public class Student extends persons {
	int sem1_mark;
	int sem2_mark;
	
	Scanner scanner = new Scanner(System.in);
	
	public Student(int sem1_mark, int sem2_mark, String f_name, String l_name , int id, String gender, int phn_num , String dept) {
		super();
		
		this.sem1_mark = sem1_mark;
		this.sem2_mark = sem2_mark;
		this.f_name = f_name;
		this.gender = gender;
		this.id = id;
		this.l_name = l_name;
		this.phn_num = phn_num;
		this.dept = dept; 
		}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void insert() {
		
		System.out.println("Enter student first name : ");
		f_name= scanner.next();
		System.out.println("Enter student last name : ");
		l_name= scanner.next();
		System.out.println("Enter student roll number : ");
		id = scanner.nextInt();
		System.out.println("Enter student gender : ");
		gender = scanner.next();
		System.out.println("Enter student phone number : ");
		phn_num = scanner.nextInt();
		System.out.println("Enter student department : ");
		dept = scanner.next();
		System.out.println("Enter student sem 1 percent : ");
		sem1_mark = scanner.nextInt();
		System.out.println("Enter student sem 2 percent : ");
		sem2_mark = scanner.nextInt();
	}
	
	public	void display() {
		System.out.println("       Student Record       ");
		System.out.println(" Name : " + (f_name +" " + l_name) +"\n "+"Roll Number : "+id+"\n "+"Gender : " + gender +"\n "+"Phone Number : " + phn_num +"\n "+
				"Dept : " + dept + "\n" + " Sem 1_Percent : " + sem1_mark +"\n "+ "Sem_2 Percent : " + sem2_mark);
		System.out.println("-".repeat(50));
	}
	public Student[] searchByName(Student[] arr , String name) {
				for(int i = 0 , j=0; i < arr.length ; i++) {
			if(arr[i].getF_name().equals(name)) {
					
				arr[i].display();			
			}
			else {
				System.out.println("No record");
			}
			
			
			}
		return null;
	
	
		
	}
	
	public Student[] searchByRollno(Student arr[] , int rollnos) {
		int j =0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getId() == rollnos) {
			   arr[i].display();
			   j++;
			   				
			}
			if(j==0) {
				System.out.println("No record");
			}
		}
		return null;
		
			}
		
	@Override
	public String toString() {
		return "Student [f_name="+ f_name + ", l_name=" + l_name + ", id=" + id + ", phn_num=" + phn_num + ", gender=" + gender
				+ ", dept=" + dept + "sem1_mark=" + sem1_mark + ", sem2_mark=" + sem2_mark +"]";
	}

	public Student[] searchByPhnNum(Student arr[] , int num) {
		int j =0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getPhn_num() == num) {
				arr[i].display();
				j++;
								
			}
			
			
			
			}
		
		return null;
		
	}
	public Student[]  searchByDept(Student arr[] , String dept) {
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

