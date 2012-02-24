/**
 * 
 */
package flotjf.options.graphseries;

import java.util.ArrayList;

import flotjf.options.graphseries.color.Gradient;

/**
 * @author PJ
 *
 */
public class Colors {
	private ArrayList<Object> colors;

	public Colors() {
		//
	}

	/**
	 * Create new colors option in format:<br>
	 * colors: [ color1, color2 ]
	 */
	public Colors(final String... colors) {
		this.colors = new ArrayList<Object>();
		for (String color : colors) {
			this.colors.add(color);
		}
	}

	/**
	 * @return the colors
	 */
	public ArrayList<Object> getColors() {
		return colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(final String... colors) {
		this.colors = new ArrayList<Object>();
		for (String color : colors) {
			this.colors.add(color);
		}
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(Gradient... gradients) {
		if( this.colors == null ) { this.colors = new ArrayList<Object>();}
		for (Gradient gradient : gradients) {
			this.colors.add(gradient);
		}
	}

}
