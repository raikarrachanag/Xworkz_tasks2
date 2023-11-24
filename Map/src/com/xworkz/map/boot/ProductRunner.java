package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.CompanyDTO;
import com.xworkz.map.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in Runner");
		
		ProductDTO productDTO1=new ProductDTO("Book", 40, 1, 8, "28-05-2023");
		ProductDTO productDTO2=new ProductDTO("Milk", 50, 2, 10, "22-11-2023");
		ProductDTO productDTO3=new ProductDTO("MysorePak", 30, 3, 20, "21-11-2023");
		
		CompanyDTO companyDTO1=new CompanyDTO("TCS", "Whitefield", 234567);
		CompanyDTO companyDTO2=new CompanyDTO("Infosys", "Electronic City", 14576);
		CompanyDTO companyDTO3=new CompanyDTO("IBM", "WhiteField", 4444);
		
		Map<ProductDTO, CompanyDTO> productAndCompany=new HashMap<ProductDTO, CompanyDTO>();
		productAndCompany.put(productDTO1, companyDTO1 );
		productAndCompany.put(productDTO2, companyDTO2);
		productAndCompany.put(productDTO3, companyDTO3);
		
		System.out.println(productAndCompany.isEmpty());
		
		System.out.println(productAndCompany.keySet());
		Set<ProductDTO> a =productAndCompany.keySet();
		a.forEach(f->System.out.println(f));
		
		Collection<CompanyDTO> value=productAndCompany.values();
        value.forEach(v->System.out.println(v));
        
        
	}
}
