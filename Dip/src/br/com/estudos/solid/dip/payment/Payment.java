package br.com.estudos.solid.dip.payment;

import br.com.estudos.solid.dip.factory.DbProductFactory;
import br.com.estudos.solid.dip.model.Db;
import br.com.estudos.solid.dip.model.IDbProduct;

public class Payment {

	public void pay(String productID) {
		//MySQLProduct dbProduct = new MySQLProduct();
		
		IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
		
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}
}
