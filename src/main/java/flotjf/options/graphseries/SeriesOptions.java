package flotjf.options.graphseries;

/**
 * Series options.
 * <pre>
 * lines, points, bars: {
 *   show: boolean
 *   lineWidth: number
 *   fill: boolean or number
 *   fillColor: null or color/gradient
 * }
 * </pre>
 */
public class SeriesOptions {
	/**
	 * Always set show to true.
	 * TODO
	 */
	private Boolean show = true;
	/** */
	private Integer lineWidth;
	/** */
	private String fill;
	/** */
	private Object fillColor;

	/**
	 * @param show the show to set
	 */
	public void setShow(final Boolean show) {
		this.show = show;
	}

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * "lineWidth" is the thickness of the line or outline in pixels. You can
	 * set it to 0 to prevent a line or outline from being drawn; this will
	 * also hide the shadow.
	 * <p>
	 * @param lineWidth the lineWidth to set
	 */
	public void setLineWidth(final Integer lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @return the lineWidth
	 */
	public Integer getLineWidth() {
		return lineWidth;
	}

	/**
	 * "fill" is whether the shape should be filled. For lines, this produces
	 * area graphs.
	 * <p>
	 * @param fill the fill to set
	 */
	public void setFill(final String fill) {
		this.fill = fill;
	}

	/**
	 * @return the fill
	 */
	public String getFill() {
		return fill;
	}

	/**
	 * You can use "fillColor" to specify the color of the fill.
	 * If "fillColor" evaluates to false (default for everything except
	 * points which are filled with white), the fill color is auto-set to the
	 * color of the data series. You can adjust the opacity of the fill by
	 * setting fill to a number between 0 (fully transparent) and 1 (fully
	 * opaque).
	 * <p>
	 * @param fillColor the fillColor to set
	 */
	public void setFillColor(final Object fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * @return the fillColor
	 */
	public Object getFillColor() {
		return fillColor;
	}
}
