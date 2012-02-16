package flotjf.options.graphseries;

/**
 * For bars, fillColor can be a gradient, see the gradient documentation
 * below.
 * <pre>
 * bars: {
 *   barWidth: number
 *   align: "left" or "center"
 *   horizontal: boolean
 * }
 * </pre>
 */
public final class BarsOptions extends SeriesOptions {
	/** */
	private Integer barWidth;
	/** */
	private String align;
	/** */
	private Boolean horizontal;

	/**
	 * "barWidth" is the width of the bars in units of the x axis (or
	 * the y axis if "horizontal" is true), contrary to most other measures
	 * that are specified in pixels. For instance, for time series the unit
	 * is milliseconds so 24 * 60 * 60 * 1000 produces bars with the width of
	 * a day.
	 * <p>
	 * @param barWidth the barWidth to set
	 */
	public void setBarWidth(final Integer barWidth) {
		this.barWidth = barWidth;
	}

	/**
	 * @return the barWidth
	 */
	public Integer getBarWidth() {
		return barWidth;
	}

	/**
	 * "align" specifies whether a bar should be left-aligned
	 * (default) or centred on top of the value it represents.
	 * <p>
	 * @param align "left" or "center"
	 */
	public void setAlign(final String align) {
		this.align = align;
	}

	/**
	 * @return the align
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * When "horizontal" is on, the bars are drawn horizontally, i.e. from the y
	 * axis instead of the x axis; note that the bar end points are still
	 * defined in the same way so you'll probably want to swap the
	 * coordinates if you've been plotting vertical bars first.
	 * <p>
	 * @param horizontal the horizontal to set
	 */
	public void setHorizontal(final Boolean horizontal) {
		this.horizontal = horizontal;
	}

	/**
	 * @return the horizontal
	 */
	public Boolean getHorizontal() {
		return horizontal;
	}
}
