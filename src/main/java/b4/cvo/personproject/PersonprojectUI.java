/*
package b4.cvo.personproject;

import java.util.Observable;
import java.util.Observer;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import b4.cvo.personproject.frontend.NameAgeLayout;
import b4.cvo.personproject.frontend.ctl.OKListener;
import b4.cvo.personproject.service.dto.PersonDTO;
import b4.cvo.personproject.service.manager.PersonManager;

import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("personproject")
public class PersonprojectUI extends UI implements Observer {

	private PersonManager pm;

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = PersonprojectUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		pm = new PersonManager();
		pm.addObserver(this);
		setContent(new NameAgeLayout(pm));
	}

	@Override
	public void update(Observable o, Object arg) {
		PersonDTO dto = ((PersonManager)o).getCurrent();
		Notification.show("Hello, " + dto.getName() + " - " + dto.getAge());
	}

	

}*/
