package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programm {

	public static void main(String[] args) {

		Department obj = new Department(1, "books");
	
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== test 1: seller, findByID ===");
		
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);

	}

}
