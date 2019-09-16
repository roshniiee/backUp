package dao;

import java.util.HashMap;
import java.util.Map;

import bean.Person;

public interface DaoInterface {
	
	
	void storeIntoMap(Person person);
	Map<Integer,Person> displayPersons();
}
