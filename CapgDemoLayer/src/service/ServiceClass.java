package service;

import java.util.Map;

import bean.Person;
import dao.DaoClass;

public  class ServiceClass implements ServiceInterface {

	DaoClass dao = new DaoClass();
	
	@Override
	public boolean validateUserName(String userName) {
		if(userName.matches(userNamePattern))
			return true;
		else
			return false;
	}
	
public void storeIntoMap(Person person){
		dao.storeIntoMap(person);
		
	}
	public void test(){
		
	}

	@Override
	public Map<Integer, Person> displayPersons() {
		
		return dao.displayPersons();
	}
	
	

}
