import java.util.*;
	public class ArrList1 {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("DAA");
		list1.add("Maths-I");
		list1.add("EME");
		list1.add("Database");
		ArrayList<String> list2 = new ArrayList<>();
		System.out.print("press 1 to move subject into select subject: ");
		int x = input.nextInt();
		while (x==1) {
		System.out.println("List of subjects: "+list1);
		System.out.print("enter subject : ");
		String y = input.next();
		list2.add(y);
		list1.remove(y); 
		System.out.println(); 
		System.out.print("press 1 to move subject into select subject else press 0: "); 
		x = input.nextInt();
		}
		System.out.println("---------------------------------------------");
		System.out.println("Subjects: ");
		for(String str : list1){
		System.out.println(str);
		}
		System.out.println("---------------------------------------------");
		System.out.println("\nSelected Subjects: "); 
		for(String str : list2){
		System.out.println(str);
		}
	}
}