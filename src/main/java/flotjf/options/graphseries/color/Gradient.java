package flotjf.options.graphseries.color;

/**
 * For the series you can specify the gradient as an object that
 * specifies the scaling of the brightness and the opacity of the series
 * color, e.g.
 * <pre>  { colors: [{ opacity: 0.8 }, { brightness: 0.6, opacity: 0.8 } ] }</pre>
 *
 */
public class Gradient {
	private Double opacity;
	private Double brightness;

	public Gradient(Double opacity, Double brightness) {
		this.opacity = opacity;
		this.brightness = brightness;
	}
	/**
	 * @return the opacity
	 */
	public Double getOpacity() {
		return opacity;
	}

	/**
	 * @param opacity the opacity to set
	 */
	public void setOpacity(Double opacity) {
		this.opacity = opacity;
	}

	/**
	 * @return the brightness
	 */
	public Double getBrightness() {
		return brightness;
	}

	/**
	 * @param brightness the brightness to set
	 */
	public void setBrightness(Double brightness) {
		this.brightness = brightness;
	}
}
