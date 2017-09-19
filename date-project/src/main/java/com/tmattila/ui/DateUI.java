package com.tmattila.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/ui")
@Theme("valo")
@Title("Date Storage")
public class DateUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout root = new VerticalLayout();
		root.addComponent(new Label("This is a test"));
		setContent(root);
	}

}
