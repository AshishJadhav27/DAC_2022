class Ex5{
	public static void main(String args[]){
	Student student = new Student();
	student.init("Ashish",80,90,70);
	student.average();
	student.display();
	}
}
	
	 class Student{
		String name;
		int marks1;
		int marks2;
		int marks3;
		int avg;
		
		void init(String name, int marks1, int marks2, int marks3){
			this.name=name;
			this.marks1=marks1;
			this.marks2=marks2;
			this.marks3=marks3;
		}
		
		int average(){
			 avg= (marks1+marks2+marks3)/3;
			return avg;
		}
		
		void display(){
			
			int total= marks1+marks2+marks3;
			
			System.out.println("Name= "+name);
			System.out.println("Total marks= "+total);
			System.out.println("Average marks= "+avg);
		}
	}
