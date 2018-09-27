package b4.cvo.personproject.frontend;

import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import b4.cvo.personproject.frontend.ctl.OKListener;
import b4.cvo.personproject.service.manager.PersonManager;

public class NameAgeLayout extends VerticalLayout {
	
	private PersonManager pm;
	private TextField nameField;
	private TextField ageField;

	public NameAgeLayout(PersonManager pm) {
		this.pm = pm;
		setMargin(true); // je verliest de marge wanneer je ?
		addFields();
		addButton();
	}
	
	private void addFields() {
		nameField = new TextField("Name");
		ageField = new TextField("Age");
		addComponent(nameField);
		addComponent(ageField);
		
	}
	
	public TextField getNameField() {
		return nameField;
	}
	
	public TextField getAgeField() {
		return ageField;
	}
	

	private void addButton() {
		Button button = new Button("OK");
		button.addClickListener(new OKListener(this, pm));
		addComponent(button);
	}

}
