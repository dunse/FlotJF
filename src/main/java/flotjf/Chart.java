package flotjf;

import java.util.ArrayList;

import com.google.gson.Gson;

import flotjf.data.PlotData;
import flotjf.options.Axis;
import flotjf.options.Grid;
import flotjf.options.PlotOptions;
import flotjf.options.plugins.CrossHair;

/**
 * 
 * @author PJ
 *
 */
public final class Chart {
	/** */
	private ArrayList<PlotData> chartsdata;
	/** */
	private PlotOptions options;

	/**
	 * 
	 */
	public Chart() {
		chartsdata = new ArrayList<PlotData>();
		options = new PlotOptions();
	}

	/**
	 * 
	 * @param chart TODO
	 */
	public void addElements(final PlotData chart) {
		chartsdata.add(chart);
	}


	/**
	 * 
	 * @return JSON {@link String} of data
	 */
	public String printChart(){
		Gson gson = new Gson();
		StringBuffer json = new StringBuffer();

		json.append("[");
		for (PlotData chartdata: this.chartsdata) {
			if (json.length() > 1) {
				json.append(",");
			}
			json.append(gson.toJson(chartdata, chartdata.getClass()));
		}
		json.append("]");

		return json.toString();
	}

	/**
	 * 
	 * @return JSON {@link String} of options
	 */
	public String printChartOptions(){
		Gson gson = new Gson();
		return gson.toJson(options, options.getClass());
	}

	/**
	 * 
	 * @param xAxis TODO
	 */
	public void addXAxis(final Axis xAxis) {
		this.options.addXAxis(xAxis);
	}

	/**
	 * 
	 * @param yAxis TODO
	 */
	public void addYAxis(final Axis yAxis) {
		this.options.addYAxis(yAxis);
	}

	/**
	 * 
	 * @param grid TODO
	 */
	public void addGrid(final Grid grid) {
		this.options.setGrid(grid);
	}

	/**
	 * Helper method to use crosshair plugin.
	 * To use crosshair, add the following line to {@code <HEAD>}:
	 * <pre>
	 * {@code <script src="/path/to/flot/jquery.flot.crosshair.js" type="text/javascript" />}
	 * </pre>
	 * Adding the above script inclusion and calling this method will set the following options:
	 * <pre>
	 *   crosshair: {
	 *     mode: "x",
	 *     lineWidth: linkWidth
	 *     color: color
	 *   }
	 *   grid: {
	 *     hoverable: true,
	 *     autoHighlight: false
	 *   }
	 * </pre>
	 * @param lineWidth null or Integer number
	 * @param color null or String represented colour
	 */
	public void useCrossHair(final Integer lineWidth, final String color) {
		if (options.getCrossHair() == null) {
			CrossHair crosshair = new CrossHair();
			options.setCrossHair(crosshair);
		}
		options.getCrossHair().setMode("x");
		options.getCrossHair().setColor(color);
		options.getCrossHair().setLineWidth(lineWidth);

		if (options.getGrid() == null) {
			Grid grid = new Grid();
			options.setGrid(grid);
		}
		options.getGrid().setHoverable(true);
		options.getGrid().setAutoHighlight(false);
	}

	/**
	 * Helper method to use crosshair plugin.
	 * <p>
	 * To use crosshair, add the following line to {@code <HEAD>}:
	 * <pre>
	 * {@code <script src="/path/to/flot/jquery.flot.crosshair.js" type="text/javascript" />}
	 * </pre>
	 * Adding the above script inclusion and calling this method will set the following options:
	 * <pre>
	 *   crosshair: {
	 *     mode: "x"
	 *   }
	 *   grid: {
	 *     hoverable: true,
	 *     autoHighlight: false
	 *   }
	 * </pre>
	 */
	public void useCrossHair() {
		useCrossHair(null, null);
	}
}
