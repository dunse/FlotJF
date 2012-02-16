package flotjf.options;

/**
 * The legend is generated as a table with the data series labels and
 * small label boxes with the color of the series. If you want to format
 * the labels in some way, e.g. make them to links, you can pass in a
 * function for "labelFormatter".
 * <pre>
 * legend: {
 *   show: boolean
 *   labelFormatter: null or (fn: string, series object -> string)
 *   labelBoxBorderColor: color
 *   noColumns: number
 *   position: "ne" or "nw" or "se" or "sw"
 *   margin: number of pixels or [x margin, y margin]
 *   backgroundColor: null or color
 *   backgroundOpacity: number between 0 and 1
 *   container: null or jQuery object/DOM element/jQuery expression
 * }
 * </pre>
 */
public final class Legend {
	/** */
	private Boolean show;
	/** */
	private String labelFormatter;
	/** */
	private String labelBoxBorderColor;
	/** */
	private Integer noColumns;
	/** */
	private String position;
	/** */
	private String margin;
	/** */
	private String backgroundColor;
	/** */
	private Integer backgroundOpacity;
	/** */
	private String container;


	/**
	 * Default constructor for {@link Legend}.
	 * The constructor default the value of <i>show</i> to true;
	 */
	public Legend() {
		this.show = true;
	}

	/**
	 * Set the "show:" value. This is to define if the legend should be visible or not.
	 * Default is true.
	 * <p>
	 * @param show boolean
	 */
	public void setShow(final Boolean show) {
		this.show = show;
	}

	/**
	 * Returns the runtime value of "show:". Default value is true.
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * If you want to format the labels in some way, e.g. make them to links,
	 * you can pass in a function for "labelFormatter".
	 * Here's an example that makes them clickable:
	 * <pre>
	 *   labelFormatter: function(label, series) {
	 *     // series is the series object for the label
	 *     return '<a href="#' + label + '">' + label + '</a>';
	 *   }
	 * </pre>
	 * @param labelFormatter null or (fn: string, series object -> string)
	 */
	public void setLabelFormatter(final String labelFormatter) {
		this.labelFormatter = labelFormatter;
	}

	/**
	 * @return the labelFormatter
	 */
	public String getLabelFormatter() {
		return labelFormatter;
	}

	/**
	 * @param labelBoxBorderColor color
	 */
	public void setLabelBoxBorderColor(final String labelBoxBorderColor) {
		this.labelBoxBorderColor = labelBoxBorderColor;
	}

	/**
	 * @return the labelBoxBorderColor
	 */
	public String getLabelBoxBorderColor() {
		return labelBoxBorderColor;
	}

	/**
	 * "noColumns" is the number of columns to divide the legend table into.
	 * <p>
	 * @param noColumns number
	 */
	public void setNoColumns(final Integer noColumns) {
		this.noColumns = noColumns;
	}

	/**
	 * @return the noColumns
	 */
	public Integer getNoColumns() {
		return noColumns;
	}

	/**
	 * "position" specifies the overall placement of the legend within the
	 * plot (top-right, top-left, etc.).
	 * <p>
	 * @param position the position to set
	 */
	public void setPosition(final String position) {
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * margin the distance to the plot edge (this can be either a number or
	 * an array of two numbers like [x,y]).
	 * <p>
	 * @param margin the margin to set
	 */
	public void setMargin(final String margin) {
		this.margin = margin;
	}

	/**
	 * @return the margin
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * "backgroundColor" and "backgroundOpacity" specifies the background.
	 * The default is a partly transparent auto-detected background.
	 * <p>
	 * @param backgroundColor null or color
	 */
	public void setBackgroundColor(final String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @return the backgroundColor
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * "backgroundColor" and "backgroundOpacity" specifies the background.
	 * The default is a partly transparent auto-detected background.
	 * <p>
	 * @param backgroundOpacity number between 0 and 1
	 */
	public void setBackgroundOpacity(final Integer backgroundOpacity) {
		this.backgroundOpacity = backgroundOpacity;
	}

	/**
	 * @return the backgroundOpacity
	 */
	public Integer getBackgroundOpacity() {
		return backgroundOpacity;
	}

	/**
	 * If you want the legend to appear somewhere else in the DOM, you can
	 * specify "container" as a jQuery object/expression to put the legend
	 * table into. The "position" and "margin" etc. options will then be
	 * ignored. Note that Flot will overwrite the contents of the container.
	 * <p>
	 * @param container null or jQuery object/DOM element/jQuery expression
	 */
	public void setContainer(final String container) {
		this.container = container;
	}

	/**
	 * Returns the value of "container:".
	 * By default this is <i>null</i>.
	 * <p>
	 * @return the container: null or jQuery object/DOM element/jQuery expression
	 */
	public String getContainer() {
		return container;
	}
}
