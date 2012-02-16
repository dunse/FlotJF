package flotjf.options.graphseries;

/**
 * Points options.
 * <pre>
 * points: {
 *   radius: number
 *   symbol: "circle" or function
 * }
 * </pre>
 */
public final class PointsOptions extends SeriesOptions {
	/** */
	private Integer radius;
	/** */
	private String symbol;

	/**
	 * For points, you can specify the radius and the symbol. The only
	 * built-in symbol type is circles, for other types you can use a plugin
	 * or define them yourself.
	 * <p>
	 * @param radius the radius to set
	 */
	public void setRadius(final Integer radius) {
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public Integer getRadius() {
		return radius;
	}

	/**
	 * The only built-in symbol type is circles, for other types you
	 * can use a plugin or define them yourself by specifying a callback:
	 * <pre>
	 * function cross(ctx, x, y, radius, shadow) {
	 *   var size = radius * Math.sqrt(Math.PI) / 2;
	 *   ctx.moveTo(x - size, y - size);
	 *   ctx.lineTo(x + size, y + size);
	 *   ctx.moveTo(x - size, y + size);
	 *   ctx.lineTo(x + size, y - size);
	 * }
	 * </pre>
	 * The parameters are the drawing context, x and y coordinates of the
	 * center of the point, a radius which corresponds to what the circle
	 * would have used and whether the call is to draw a shadow (due to
	 * limited canvas support, shadows are currently faked through extra
	 * draws). It's good practice to ensure that the area covered by the
	 * symbol is the same as for the circle with the given radius, this
	 * ensures that all symbols have approximately the same visual weight.
	 * <p>
	 * @param symbol the symbol to set
	 */
	public void setSymbol(final String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
}
