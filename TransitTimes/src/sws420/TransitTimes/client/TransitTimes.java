package sws420.TransitTimes.client;

import sws420.TransitTimes.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.ListBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TransitTimes implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get("bodyContent");
		
		Label lblTransitTimes = new Label("Transit Times");
		rootPanel.add(lblTransitTimes, 308, 0);
		
		Label lblTransitService = new Label("Transit Service: ");
		rootPanel.add(lblTransitService, 128, 54);
		lblTransitService.setWidth("94px");
		
		VerticalPanel verticalPanel = new VerticalPanel();
		rootPanel.add(verticalPanel, 228, 54);
		verticalPanel.setSize("309px", "473px");
		
		ListBox comboBox = new ListBox();
		verticalPanel.add(comboBox);
		comboBox.addItem("TTC");
		comboBox.addItem("GO");
		comboBox.addItem("Metro");
		comboBox.addItem("York");
		comboBox.addItem("Viva");
		comboBox.setHeight("25px");
		
		ListBox comboBox_1 = new ListBox();
		verticalPanel.add(comboBox_1);
		
		ListBox comboBox_2 = new ListBox();
		verticalPanel.add(comboBox_2);
		
		ListBox comboBox_3 = new ListBox();
		verticalPanel.add(comboBox_3);
		
		ListBox comboBox_4 = new ListBox();
		verticalPanel.add(comboBox_4);
		
		ListBox comboBox_5 = new ListBox();
		verticalPanel.add(comboBox_5);
		
		ListBox comboBox_6 = new ListBox();
		verticalPanel.add(comboBox_6);
		
		Label lblStart = new Label("Start: ");
		rootPanel.add(lblStart, 190, 99);
		
		Label lblNewLabel = new Label("City: ");
		rootPanel.add(lblNewLabel, 200, 123);
		
		Label lblStation = new Label("Station: ");
		rootPanel.add(lblStation, 182, 190);
		
		Label lblStop = new Label("Stop: ");
		rootPanel.add(lblStop, 196, 256);
		
		Label lblDestination = new Label("Destination: ");
		rootPanel.add(lblDestination, 153, 298);
		
		Label lblCity = new Label("City: ");
		rootPanel.add(lblCity, 200, 322);
		
		Label lblStation_1 = new Label("Station: ");
		rootPanel.add(lblStation_1, 182, 392);
		
		Label lblStop_1 = new Label("Stop: ");
		rootPanel.add(lblStop_1, 196, 459);
		rootPanel.getElement().getStyle().setPosition(Position.RELATIVE);
	}
}
