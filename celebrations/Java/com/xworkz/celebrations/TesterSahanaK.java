package com.xworkz.celebrations;

import java.util.Optional;

public class TesterSahanaK {

	public static void main(String[] args) {
		String email = null;
		
		System.out.println(email);
		
//		if(email!=null) {
//			System.out.println(email.toUpperCase());
//		}
		Optional<String> optional = Optional.of("sahana@workz.com");
		
		System.out.println(optional.isPresent());
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		Optional<Integer> yearOptional = Optional.empty();
		
		System.out.println(yearOptional.isPresent());
		
		yearOptional.ifPresent((v)->System.out.println(v));
		
		Optional<String> country = Optional.ofNullable("India");
		
		country.ifPresent(e->{
			String value = country.map(String::toUpperCase).get();
			System.out.println(value);
		});
		
		String def = country.orElse("srilanka");
		System.out.println(def);
	}

}
