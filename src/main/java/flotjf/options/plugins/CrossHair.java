package flotjf.options.plugins;

/**
 * CrossHair options.
 * <b>JSON Data format for CrossHair:</b>
 * <pre>
 * crosshair: {
 *   mode: null, // one of null, "x", "y" or "xy",
 *   color: "rgba(170, 0, 0, 0.80)",
 *   lineWidth: 1
 * }
 * </pre>
 */
public final class CrossHair {
	/** */
	private String mode;
	/** */
	private String color;
	/** */
	private Integer lineWidth;

	/**
	 * @param mode one of null, "x", "y" or "xy"
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

	/**
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
}
