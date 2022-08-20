package com.example.officina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficinaService {
	
	@Autowired
	OfficinaRepository officinarepository;
	
	public OfficinaService (OfficinaRepository or) {
		officinarepository=or;
	}

	
}
