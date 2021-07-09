package pro1;
import java.sql.*;
import java.util.Scanner;
public class Lab3A {
	Connection m1() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","mahaakrish","Mahaan@1997");
			System.out.println("Connection created...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	void m2(Connection con,int sid,String name,int age,String addr,String deg) {
		try {
			Statement st = con.createStatement();
			String qry = "insert into student value("+sid+",'"+name+"',"+age+",'"+addr+"','"+deg+"');";
			st.execute(qry);
			System.out.println("Record inserted...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void m3(Connection con) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student;");
			System.out.println("Displaying table data...");
			while(rs.next()) {
				System.out.println("USN: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Age: "+rs.getInt(3));
				System.out.println("Address: "+rs.getString(4));
				System.out.println("Degree: "+rs.getString(5));
				System.out.println("******************************");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void m4(Connection con,int sid,String name) {
		try {
			Statement st = con.createStatement();
			String qry = "update student set name='"+name+"' where sid="+sid+";";
			st.executeUpdate(qry);
			System.out.println("Record updated...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void m5(Connection con,int sid) {
		try {
			Statement st = con.createStatement();
			String qry = "delete from student where sid="+sid+";";
			st.executeUpdate(qry);
			System.out.println("Record deleted...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void m6(Connection con,String deg) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where degree='"+deg+"';");
			System.out.println("Students from Degree: "+deg);
			while(rs.next()) {
				System.out.println("USN: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Age: "+rs.getInt(3));
				System.out.println("Address: "+rs.getString(4));
				System.out.println("******************************");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lab3A obj = new Lab3A();
		int flag = 1,ch;
		int usn,age;
		String name,addr,deg;
		Connection con = null;
		try {
			while(flag==1) {
				System.out.println("1. Create connection\n2. Insert record\n3. Display data\n4. Update record\n5. Delete record\n6. Search\n7. Exit");
				System.out.println("Enter your choice: ");
				ch = sc.nextInt();sc.nextLine();
				switch(ch) {
				case 1:
					con = obj.m1();
					break;
				case 2:
					System.out.println("Enter USN: ");
					usn = sc.nextInt();sc.nextLine();
					System.out.println("Enter Name: ");
					name = sc.nextLine();
					System.out.println("Enter Age: ");
					age = sc.nextInt();sc.nextLine();
					System.out.println("Enter Address: ");
					addr = sc.nextLine();
					System.out.println("Enter Degree: ");
					deg = sc.nextLine();
					obj.m2(con, usn, name, age, addr, deg);
					break;
				case 3:
					obj.m3(con);
					break;
				case 4:
					System.out.println("Enter USN: ");
					usn = sc.nextInt();sc.nextLine();
					System.out.println("Enter Name to replace: ");
					name = sc.nextLine();
					obj.m4(con, usn, name);
					break;
				case 5:
					System.out.println("Enter USN to delete record: ");
					usn = sc.nextInt();sc.nextLine();
					obj.m5(con, usn);
					break;
				case 6:
					System.out.println("Enter Degree to display: ");
					deg = sc.nextLine();
					obj.m6(con, deg);
					break;
				case 7:
					flag=0;
					break;
				default:
					System.out.println("Invalid choice!!");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}