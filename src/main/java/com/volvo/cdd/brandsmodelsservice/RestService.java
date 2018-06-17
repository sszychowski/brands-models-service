package com.volvo.cdd.brandsmodelsservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RestService {
	
	@RequestMapping("/brands")
	public List<String> getBrands() {
		List<String> result = new ArrayList<>();
		result.add("B1");
		result.add("B2");
		result.add("B3");
		return result;
	}
}
