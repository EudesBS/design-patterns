package br.com.estudos.solid.dip.factory;

import br.com.estudos.solid.dip.model.Db;
import br.com.estudos.solid.dip.model.IDbProduct;
import br.com.estudos.solid.dip.model.MongoDBProduct;
import br.com.estudos.solid.dip.model.MySQLProduct;

public class DbProductFactory {

	public static IDbProduct create(Db type) {
		if(type == Db.MYSQL) {
			return new MySQLProduct();
		}else {
			return new MongoDBProduct();
		}
		
	}
}
