
import java.util.Scanner;
class author
{
	String name,email;
	char gender;
	public author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
	String getname()
	{
		return name;
	}
	String getemail()
	{
		return email;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	char getgender()
	{
		return gender;
	}
	public String toString()
	{
		return " "+name+" "+email+" "+gender;
	}
}
    class Book 
    {
    	//String name;String email;char gender;
    	String name1;
    	double price;
    	int qty=0;
    	author Author;
    	//author Author=new author(name,email, gender);
    	public Book(String name, author Author, double price)
    	{
    		this.Author=Author;
    		name1=name;
    		this.price=price;
    	}
    	public Book(String name1, author Author, double price, int qty)
    	{
    		this.name1=name1;
    		this.Author=Author;
    		this.price=price;
    		this.qty=qty;
    	}
    	String getName()
    	{
    		return name1;
    	}
    	author getAuthor()
    	{
    		return Author;
    	}
    	double getPrice()
    	{
    		return price;
    	}
    	void setPrice(double price)
    	{
    		this.price=price;
    	}
    	int getqty()
    	{
    		return qty;
    	}
    	void setqty(int qty)
    	{
    		this.qty=qty;
    	}
    	public String toString()
    	{
    		return " "+name1+" "+Author+" "+price+" "+qty;
    	}
    }
   
	class Student
	{
		String name;
		int roll;
		date issuedate;
		date returndate;
		Student(String name,int roll,date issuedate,date returndate)
		{
			this.name=name;
			this.roll=roll;
			this.issuedate=issuedate;
			this.returndate=returndate;
		}
		String getName()
		{
			return name;
		}
		int getroll()
		{
			return roll;
		}
		Book issuebook(Book b)
		{
			if(b.getqty()>0)
			{     System.out.println("Book issued");
			b.qty=b.qty-1;
			
			}
			else {
				System.out.println("Sorry!Book cant be issued");
	      } return b;
		}
		Book depositbook(Book b)
		{ 
		b.qty=b.qty+1;
		double fine=0;
		if(returndate.dd>issuedate.dd&&returndate.mm==(issuedate.mm+1)||returndate.mm>(issuedate.mm+1)||returndate.year>issuedate.year)
		{
			fine =1*(returndate.dd-issuedate.dd)+30*(returndate.mm-issuedate.mm)+365*(returndate.year-issuedate.year);
		
		}
		System.out.println("Fine to be paid="+fine);
		return b;
		}
	}
	class date
	{
		int dd,mm,year;
		date(int d,int m,int y)
		{
		     dd=d;
		     mm=m;
		     year=y;
		}
		int getdd()
		{
			return dd;
		}
		int getmm()
		{
			return mm;
		}
		int getyy()
		{
			return year;
		}
		public String toString()
		{
		  return " "+dd+" "+mm+" "+year;
		}
		
	}
public class P1
{
public static void main(String[] args) 
{// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter no of books");
n=s.nextInt();
Book b[]=new Book[n]; 
author a[]=new author[n];
for(int i=0;i<n;i++)
{
	System.out.println("*****************Book "+(i+1)+" details*********************");
	System.out.println("Enter name of book");
	String nm=s.next();
	System.out.println("Enter name of author");
	String na=s.next();
	System.out.println("Enter gender");
	char g=s.next().charAt(0);
	System.out.println("Enter email");
	String email=s.next();
	System.out.println("Enter quantity of books present in the library");
	int q=s.nextInt();
	System.out.println("Enter price of book");
	double price=s.nextDouble();
	a[i]=new author(nm,email,g);
	b[i]=new Book(na,a[i],price,q);
}
System.out.println("Enter no of students");
int no=s.nextInt();
Student s1[]=new Student[no];
date d[]=new date[no];
date d1[]=new date[no];
for(int i=0;i<no;i++)
{
	
	String name;int roll;date issuedate;date returndate;
    System.out.println("****************Student "+(i+1)+" Details************************");
	System.out.println("Enter student name");
    name=s.next();
    System.out.println("Enter roll");
    roll=s.nextInt();
    System.out.println("Enter issue day");
    int md=s.nextInt();
    System.out.println("Enter issue month");
    int month=s.nextInt();
    System.out.println("Enter issue year");
    int year=s.nextInt();
    d[i]=new date(md,month,year);

    System.out.println("Enter return day");
    int md1=s.nextInt();
    System.out.println("Enter return month");
    int month1=s.nextInt();
    System.out.println("Enter return year");
    int year1=s.nextInt();
    d1[i]=new date(md1,month1,year1);	
    s1[i]=new Student(name,roll,d[i],d1[i]);
    System.out.println("Select from the list of books");
    for(int j=0;j<n;j++)
    {
    	System.out.println("("+j+")"+"."+b[j].getName()+" with quantity:"+b[j].getqty());
    }
    System.out.println("Enter no of books you want to issue");
    int p=s.nextInt();
    for(int z=0;z<p;z++) {
    System.out.println("Enter the book number you want to choose");
    int k=s.nextInt();
    b[k]=s1[i].issuebook(b[k]);
    System.out.println("After issue status of book");
    System.out.println(b[k].toString());
    }
    System.out.println("Enter the number of books you want to return");
    int g=s.nextInt();
    for(int h=0;h<g;h++)
    {
    	System.out.println("Enter the book number you want to return");
    	int k=s.nextInt();
    	b[k]=s1[i].depositbook(b[k]);
    	System.out.println("After return status of book");
    	System.out.println(b[k].toString());
    }
}
s.close();
}
}


