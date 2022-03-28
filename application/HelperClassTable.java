package application;

import javafx.beans.property.SimpleStringProperty;

public class HelperClassTable {

	private SimpleStringProperty name;
	private SimpleStringProperty item;
	private SimpleStringProperty quality;
	
	public HelperClassTable(String name, String item, String quality) {
		//super();
		this.name = new SimpleStringProperty(name);
		this.item = new SimpleStringProperty(item);
		this.quality = new SimpleStringProperty(quality);
	}
	
	public String getName() {
		return name.get();
	}
	public String getItem() {
		return item.get();
	}
	public String getQuality() {
		return quality.get();
	}
}
