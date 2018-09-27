package b4.cvo.personproject.service.manager;

import java.util.Observable;

import b4.cvo.personproject.service.dto.PersonDTO;

public class PersonManager extends Observable{
	
	private PersonDTO current;

	public void sayHello(PersonDTO dto){
		System.out.println("in manager" + this + " - " + dto);
		this.current = dto;
		setChanged();
		notifyObservers();
	}

	public PersonDTO getCurrent() {
		return current;
	}

}
