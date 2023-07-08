package com.romulo.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.romulo.data.vo.v2.PersonVOV2;
import com.romulo.model.Person;

@Service
public class PersonMapper {
	
	public PersonVOV2 convertEntityToVO(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		 
		return vo;
	}
	
	public Person convertVOToEntity(PersonVOV2 personVOV2) {
		Person person = new Person();
		
		person.setId(personVOV2.getId());
		person.setAddress(personVOV2.getAddress());
		person.setFirstName(personVOV2.getFirstName());
		person.setLastName(personVOV2.getLastName());
		person.setGender(personVOV2.getGender());
		
		return person;
	}
}
