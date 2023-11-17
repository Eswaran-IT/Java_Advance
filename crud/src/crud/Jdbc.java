package crud;

import java.sql.*;

public class Jdbc {
    private Connection connection;

    public Jdbc() {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/crud";
            String username = "root";
            String password = "@127700Es.";
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            String createTableSQL = "CREATE TABLE IF NOT EXISTS info ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255),"
                    + "age INT,"
                    + "salary DOUBLE)";
            Statement st = connection.createStatement();
            st.execute(createTableSQL);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createdata(String name, int age, double salary) {
        try {
            String query = "INSERT INTO info (name, age, salary) VALUES (?, ?, ?)";
            PreparedStatement pt = connection.prepareStatement(query);
            pt.setString(1, name);
            pt.setInt(2, age);
            pt.setDouble(3, salary);
            pt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readdata() {
    	String query="select * from info";
    	try {
			Statement st=connection.createStatement();
			ResultSet rt=st.executeQuery(query);
			  while (rt.next()) {
	                int id = rt.getInt("id");
	                String name = rt.getString("name");
	                int age = rt.getInt("age");
	                double salary = rt.getDouble("salary");

	                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }

    public void updatedata(String name, int id) {
        String query = "UPDATE info SET name=? WHERE id=?";
        try {
            PreparedStatement pt = connection.prepareStatement(query);
            pt.setString(1, name);
            pt.setInt(2, id);
            int rowsUpdated = pt.executeUpdate();
            System.out.println("Data Updated. Rows affected: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletedata(int id) {
        String query = "DELETE FROM info WHERE id=?";
        try {
            PreparedStatement pt = connection.prepareStatement(query);
            pt.setInt(1, id);
            int rowsDeleted = pt.executeUpdate();
            System.out.println("Data deleted. Rows affected: " + rowsDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println("JDBC CRUD OPERATIONS");
       // Jdbc jdbc = new Jdbc();
		
		 //  jdbc.createdata("John", 20, 57000.0); 
		 // jdbc.createdata("Raj", 18, 26000.0);
		 //jdbc.createdata("Vino", 19, 32000.0); 
		 //jdbc.createdata("Siva", 22, 14000.0);
		 //jdbc.createdata("Sakthi", 35,250000.0); 
		 //jdbc.createdata("Venkat", 25,50000.0);
		 
        
        //jdbc.updatedata("Eswaran", 4);
        //jdbc.readdata();
        
      //  jdbc.deletedata(5);
      //  jdbc.readdata();
        
    }
}
