package myListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener{
	
	
	public static Connection dbconnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?", "root", "Ab@230596");
			System.out.println("Connection successful");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	public void contextInitialized(ServletContextEvent event) {
		try {
			Connection con = dbconnection();
			String sql1 = "create database campusestock";
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.executeUpdate();
			
			String sql2 = "create table campusestock.vendor(vendorId varchar(200), vendorName varchar(200), vendorDepartment varchar(200), vendorMatricNo varchar(200), vendorUsername varchar(200), vendorPassword varchar(200), vendorBrandName varchar(200), vendorSchoolId longBlob)";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.executeUpdate();
			
			String sql3 = "create table campusestock.product(productId varchar(200), vendorId varchar(200), productName varchar(200), datePosted date, productStatus varchar(200), productSample1 longBlob, prodcutSample2 longBlob, productSample3 longblob, adsStatus varchar(200), brandName varchar(200), keywords varchar(500))";
			PreparedStatement ps3 = con.prepareStatement(sql3);
			ps3.executeUpdate();
			
			String sql4 = "create table campusestock.productads(productId varchar(200), vendorId varchar(200), adsId varchar(200), adsAmount varchar(200), adsStartDate date, adsEndDate date, adsStatus varchar(200), adsDuration varchar(200))";
			PreparedStatement ps4 = con.prepareStatement(sql4);
			ps4.executeUpdate();
			
			String sql5 = "create table campusestock.admin(adminUsername varchar(200), adminPassword varchar(200), adminId varchar(200))";
			PreparedStatement ps5 = con.prepareStatement(sql5);
			ps5.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println("Schema/table already exsit!");
			e.printStackTrace();
		}
	}
	
	 public void contextDestroyed(ServletContextEvent arg0) {}

}
