package com.volvo.cdd.brandsmodelsservice;

import java.util.ArrayList;
import java.util.List;

public enum Brands {
	eicher("e1", "e2"),
	mack("m1", "m2"), 
	renault("r1", "r2"), 
	ud("u1", "u2"),
	volvo("v1", "v2");

	private List<String> models = new ArrayList<>();
	
	

	private Brands(String... param) {
		for (String model : param) {
			models.add(model);
		}
	}
	
	public List<String> models() {
		return models;
	}
	
}
