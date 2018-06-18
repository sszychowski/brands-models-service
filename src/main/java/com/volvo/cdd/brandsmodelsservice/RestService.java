package com.volvo.cdd.brandsmodelsservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RestService {
	
	@RequestMapping("/brands")
	public List<String> getBrands() {
		List<String> result = new ArrayList<>();
		result.add("eicher");
		result.add("mack");
		result.add("renault");
		result.add("ud");
		result.add("volvo");
		
		return result;
	}
	
	@RequestMapping("/brands/{brand}/models")
	public List<String> getModelsForBrand(@PathVariable(value="brand") String brand) {
		List<String> result = Brands.valueOf(brand).models();
		return result; 
	}
}
