package service;

import java.util.Map;

import bean.Person;

public interface ServiceInterface {
	String userNamePattern="[A-Z][a-z]{9}";
	boolean validateUserName(String userName);
	void storeIntoMap(Person person);
	//public abstract
	Map<Integer,Person> displayPersons();
}
