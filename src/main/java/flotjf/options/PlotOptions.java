package flotjf.options;

import java.util.ArrayList;

import flotjf.options.plugins.*;

/**
 * 
 */
public class PlotOptions {
	/** */
	private ArrayList<Axis> xaxes;
	/** */
	private ArrayList<Axis> yaxes;
	/** */
	private Grid grid;
	/** */
	private Legend legend;
	/** */
	private Series series;
	/** */
	private CrossHair crosshair;
	/** */
	private Selection selection;

	/**
	 *
	 */
	public PlotOptions() {
		xaxes = new ArrayList<Axis>();
		yaxes = new ArrayList<Axis>();
	}

	/**
	 *
	 * @param xAxis TODO
	 */
	public final void addXAxis(final Axis xAxis) {
		this.xaxes.add(xAxis);
	}

	/**
	 *
	 * @param yAxis TODO
	 */
	public final void addYAxis(final Axis yAxis) {
		this.yaxes.add(yAxis);
	}

	/**
	 *
	 * @param grid TODO
	 */
	public final void setGrid(final Grid grid) {
		this.grid = grid;
	}

	/**
	 *
	 * @param crosshair TODO
	 */
	public final void setCrossHair(final CrossHair crosshair) {
		this.crosshair = crosshair;
	}

	/**
	 *
	 * @param selection TODO
	 */
	public final void setSelection(final Selection selection) {
		this.selection = selection;
	}

	/**
	 *
	 * @return TODO
	 */
	public final Grid getGrid() {
		return this.grid;
	}

	/**
	 *
	 * @return TODO
	 */
	public final CrossHair getCrossHair() {
		return crosshair;
	}

	/**
	 * @return the selection
	 */
	public final Selection getSelection() {
		return selection;
	}
}
