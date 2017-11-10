package io.pisoft.wds.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	private int count;

	public HomePage() {

		add(new Label("num","sasadasd"));
	}

}
