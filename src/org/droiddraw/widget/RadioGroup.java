package org.droiddraw.widget;

import org.droiddraw.property.StringProperty;

public class RadioGroup extends LinearLayout {
	StringProperty checkedItem;
	public RadioGroup() {
		super();
		checkedItem = new StringProperty("Default Button", "android:checkedButton", "");
		addProperty(checkedItem);
		this.tagName = "RadioGroup";
	}
}
