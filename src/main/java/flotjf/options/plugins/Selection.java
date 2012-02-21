package flotjf.options.plugins;

/**
 * Flot plugin for selecting regions.
 * <p>
 * The plugin defines the following options:
 * <pre>
 * selection: {
 *   mode: null or "x" or "y" or "xy",
 *   color: color
 * }
 * </pre>
 * Selection support is enabled by setting the mode to one of "x", "y" or
 * "xy". In "x" mode, the user will only be able to specify the x range,
 * similarly for "y" mode. For "xy", the selection becomes a rectangle
 * where both ranges can be specified. "color" is color of the selection
 * (if you need to change the color later on, you can get to it with
 * plot.getOptions().selection.color).
 * <p>
 * When selection support is enabled, a "plotselected" event will be
 * emitted on the DOM element you passed into the plot function. The
 * event handler gets a parameter with the ranges selected on the axes,
 * like this:
 * <pre>
 * placeholder.bind("plotselected", function(event, ranges) {
 *   alert("You selected " + ranges.xaxis.from + " to " + ranges.xaxis.to)
 *   // similar for yaxis - with multiple axes, the extra ones are in
 *   // x2axis, x3axis, ...
 * });
 * </pre>
 * The "plotselected" event is only fired when the user has finished
 * making the selection. A "plotselecting" event is fired during the
 * process with the same parameters as the "plotselected" event, in case
 * you want to know what's happening while it's happening,
 * <p>
 * A "plotunselected" event with no arguments is emitted when the user
 * clicks the mouse to remove the selection.
 * <p>
 * The plugin allso adds the following methods to the plot object:
 * <pre>
 * - setSelection(ranges, preventEvent)
 * </pre>
 * Set the selection rectangle. The passed in ranges is on the same
 * form as returned in the "plotselected" event. If the selection mode
 * is "x", you should put in either an xaxis range, if the mode is "y"
 * you need to put in an yaxis range and both xaxis and yaxis if the
 * selection mode is "xy", like this:
 * <pre>
 * setSelection({ xaxis: { from: 0, to: 10 }, yaxis: { from: 40, to: 60 } });
 * </pre>
 * setSelection will trigger the "plotselected" event when called. If
 * you don't want that to happen, e.g. if you're inside a
 * "plotselected" handler, pass true as the second parameter. If you
 * are using multiple axes, you can specify the ranges on any of those,
 * e.g. as x2axis/x3axis/... instead of xaxis, the plugin picks the
 * first one it sees.
 * <pre>
 * - clearSelection(preventEvent)
 * </pre>
 * Clear the selection rectangle. Pass in true to avoid getting a
 * "plotunselected" event.
 * <pre>
 * - getSelection()
 * </pre>
 * Returns the current selection in the same format as the
 * "plotselected" event. If there's currently no selection, the
 * function returns null.
 */
public class Selection {
	/** */
	private String mode;
	/** */
	private String color;

	/**
	 * @param mode the mode to set
	 */
	public void setMode(final String mode) {
		this.mode = mode;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(final String color) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
}
