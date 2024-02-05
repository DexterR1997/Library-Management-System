package LibraryManagementSystem;

//importing java utility package to access Scanner class
import java.util.*;

//class Book
public class Book {

//instance variables
private int sNo;
private String bookName;
private String authorName;

//parameterized constructor
Book(int sN, String bookN,String authorN){
  //assigning values to instance variables
  this.sNo = sN;
  this.bookName = bookN;
  this.authorName = authorN;
}

//Default constructor
Book(){

}

//getter method to return value of instance variable sNo
public int getsNo(){
  return sNo;
}

//getter method to return value of instance variable bookName
public String getBookName(){
  return bookName;
}

//getter method to return value of instance variable authorName
public String getAuthorName(){
  return authorName;
}

//setter method to assign value to instance variable sNo
public void setsNo(int sNo){
  this.sNo = sNo;
}

//setter method to assign value to instance variable bookName
public void setBookName(String bookName){
  this.bookName = bookName;
}

//setter method to assign value to instance variable authorName
public void setAuthorName(String authorName){
  this.authorName = authorName;
}

//creating an object of Scanner class to take input from user
Scanner sc = new Scanner(System.in);

//method to display book menu
public void bookMenu() {
  System.out.println("Enter Serial Number of a Book.");
  //taking integer input from user and assigning it to instance variable sNo
  this.sNo = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter Book Name: ");
  //taking string input from user and assigning it to instance variable bookName
  this.bookName = sc.nextLine();
  System.out.println("Enter Author Name: ");
  //taking string input from user and assigning it to instance variable authorName
  this.authorName = sc.nextLine();
}


//override toString method to print Book information
@Override
public String toString(){
  return sNo  + ", " + bookName + ", " + authorName;
}
}