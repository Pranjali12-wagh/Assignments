package Practice;

import java.util.Scanner;
public class BookDetails {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println("Enter book number : ");
		Scanner scan = new Scanner(System.in);
		book.setBookno(scan.nextInt());
		System.out.println("Enter the title of the book : ");
		book.setTitle(scan.next());
		System.out.println("Enter the name of the author : ");
		String author = scan.next();
		book.setAuthor(author);
		System.out.println("Enter the price of the book : ");
		book.setPrice(scan.nextFloat());
		
		System.out.println("Book No : "+ book.getBookno());
		System.out.println("Title : "+ book.getTitle());
		System.out.println("Author : "+ book.getAuthor());
		System.out.println("Price : "+ book.getPrice());
		
		EngineeringBook book1 = new EngineeringBook();
		System.out.println("\nEnter book number : ");
		book1.setBookno(scan.nextInt());
		System.out.println("Enter book category : ");
		book1.setCategory(scan.next());
		System.out.println("Enter the title of the book : ");
		book1.setTitle(scan.next());
		System.out.println("Enter the name of the author : ");
		String author1 = scan.next();
		book1.setAuthor(author1);
		System.out.println("Enter the price of the book : ");
		book1.setPrice(scan.nextFloat());
		
		System.out.println("Book No : "+ book1.getBookno());
		System.out.println("Book category : "+ book1.getCategory());
		System.out.println("Title : "+ book1.getTitle());
		System.out.println("Author : "+ book1.getAuthor());
		System.out.println("Price : "+ book1.getPrice());
		
		scan.close();
	}
}
