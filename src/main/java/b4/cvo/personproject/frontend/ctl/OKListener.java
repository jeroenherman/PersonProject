package b4.cvo.personproject.frontend.ctl;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import b4.cvo.personproject.frontend.NameAgeLayout;
import b4.cvo.personproject.service.dto.PersonDTO;
import b4.cvo.personproject.service.manager.PersonManager;

public class OKListener implements ClickListener {

	private NameAgeLayout gui;
	private PersonManager pm;

	public OKListener(NameAgeLayout gui, PersonManager pm) {
		this.gui = gui;
		this.pm = pm;
	}

	@Override
	public void buttonClick(ClickEvent event) {
		System.out.println("in listener " + this);
		
		String name = gui.getNameField().getValue();
		String age = gui.getAgeField().getValue();
		
		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setAge(age);
		
		pm.sayHello(dto);
		
	}

}
