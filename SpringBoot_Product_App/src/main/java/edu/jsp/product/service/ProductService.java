package edu.jsp.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import edu.jsp.product.dao.ProductDao;
import edu.jsp.product.dto.Product;
import edu.jsp.product.util.ResponseStructure;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao dao;
	
	public ResponseStructure<Product> saveProduct(Product p) {
//		return dao.saveProduct(p);
		ResponseStructure<Product> rs = new ResponseStructure<Product>();
		rs.setStatus(HttpStatus.CREATED.value());
		rs.setMessage("Product saved..");
		rs.setData(dao.saveProduct(p));
		return rs;
	}
	
	public ResponseStructure<Product> fetchById(int id) {
//		return dao.fetchById(id);
		ResponseStructure<Product> rs = new ResponseStructure<Product>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Product received...");
		rs.setData(dao.fetchById(id));
		return rs;
	}

	public ResponseStructure<List<Product>> fetchAll(){
//		return dao.fetchAll();
		ResponseStructure<List<Product>> rs = new ResponseStructure<List<Product>>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Product received");
		rs.setData(dao.fetchAll());
		return rs;
	}
	
	public ResponseStructure<String> deleteById(int id) {
//		return dao.deleteById(id);
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Data deleted");
		rs.setData(dao.deleteById(id));
		return rs;
	}
	
	public ResponseStructure<Product> fetchByName(String name) {
//		return dao.fetchByName(name);
		ResponseStructure<Product> rs = new ResponseStructure<Product>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Product Received using Product Name...");
		rs.setData(dao.fetchByName(name));
		return rs;
	}
	
	public ResponseStructure<Product> updateProduct(int id,Product p) {
		Product p1 =dao.fetchById(id);
		if(p1!=null) {
			p.setId(id);
			ResponseStructure<Product> rs = new ResponseStructure<Product>();
			rs.setStatus(HttpStatus.CREATED.value());
			rs.setMessage("Data Updated..");
			rs.setData(dao.updateProduct(p));
			return rs;
		}
		return null;
	}
}
