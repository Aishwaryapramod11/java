// inheritance question mod2 slide 11//
package mod2;
class Book {
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
	    this.author=author;
		this.price=price;
	
	}
	public void displayDetails() {
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
		
	}		
	
}
class Ebook extends Book{
	double fileSize;
	Ebook(String title,String author,double price,double fileSize){
		super(title,author,price);
		this.fileSize=fileSize;
	}
	public void displayDetails() {
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
		//super.displayDetails();//
		System.out.println("fileSize:"+fileSize);
	}		
		
}
class PrintEbook extends Book{
	int numofPages;
	PrintEbook(String title,String author,double price,int numofPages){
		super(title,author,price);
		this.numofPages=numofPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("numofPages:"+numofPages);
	}
	
}

public class Oops {
  public static void main(String[]args) {
	  Ebook ebook=new Ebook("title","jk",545.6,22.28);
	  ebook.displayDetails();
	  System.out.println();
	  PrintEbook books=new PrintEbook("c","k",45.9,100);
	  books.displayDetails();
	  System.out.println();
	  
  }
}
