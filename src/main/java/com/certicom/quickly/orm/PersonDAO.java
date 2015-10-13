package com.certicom.quickly.orm;

import java.util.List;

import com.certicom.quickly.entity.Person;

public interface PersonDAO {

	List<Person> getPersons();
}
