# About
This is a Java Framework for [Flot](http://code.google.com/p/flot/).

Its main purpose is to simplify backend coding for generating graphs using Flot.


_Please note this javadoc have been put together based on documentation found
here: [http://people.iola.dk/olau/flot/API.txt](http://people.iola.dk/olau/flot/API.txt)_

# Building

**Dependencies:**

Maven 2+  
  
**Setup workspace:**
    
    
    git clone git://github.com/dunse/FlotJF.git
    

**Build FlotJF**
    
    cd FlotJF
    mvn package

This will create the compiled jar under _target_ directory.

# Usage

**Dependencies:**  
FlotJF is dependent on GSON which can be found [here](http://code.google.com/p/google-gson/downloads/list). (JAR file is found inside google-gson-X.X-release.zip)

Flot is required to draw the graphs. Download Flot from
[here](http://code.google.com/p/flot/downloads/list) and unzip into WebContent/javascripts/.

  
**Setup:**  
Copy _FlotJF/target/FlotJF-*.jar_ into _WEB-INF/lib/_ of your web project.

Make sure _GSON's .jar_ has been included in _WEB-INF/lib/_. (See dependencies)

Make sure _jquery.flot.js_ can be found in _WebContent/javascripts/flot/_

## Examples

Find a set of examples in the FlotJFExamplesWeb project: [https://github.com/dunse/FlotJFExamplesWeb](https://github.com/dunse/FlotJFExamplesWeb)

Or use the step by step guide below to quickly get started.

### Step-by-step Example

Create a file called _flotjfexample.html_ in _WebContent/_ directory with
content:

    
    
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FlotJF Example</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <!--[if lte IE 8]><script src="javascripts/flot/excanvas.min.js" type="text/javascript" charset="UTF-8"></script><![endif]-->
    <script src="javascripts/flot/jquery.flot.js" type="text/javascript" charset="UTF-8"></script>
    </head>
    <body>
    <div id="placeholder" style="width:95%;height:400px;" ></div>
    <script type="text/javascript">
    <!--
        // setup plot
        var options = [];
        var data = [];
    
    	$.ajaxSetup({async:false});
        $.post('GetGraphOptions',{},
    			function(response) {
        			options = response
    				} )
        $.post('GetGraph',{},
    	    	function(response) {
    	    		data = response
    	    		} )
    	var plot = $.plot($("#placeholder"), data, options);
        plot.setupGrid();
    	plot.draw();
        $.ajaxSetup({async:true});
    //-->
    </script>
    </body>
    </html>
    

Create a file called _GetGraph.java_ in _src/_ directory with content:

    
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    import flotjf.Chart;
    import flotjf.data.PlotData;
    
    /**
     * Servlet implementation class GetGraph
     */
    @WebServlet("/GetGraph")
    public class GetGraph extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("application/json");
    		PrintWriter out = response.getWriter();
    
    		PlotData sinPlot = new PlotData("sin(x)", null);
    		
    		int i = 0;
    		while( i++ < 100 ) {
    			sinPlot.addPoint(i, Math.sin(i));
    		}
    	
    		Chart chart = new Chart();
    		chart.addElements(sinPlot);
    
    		out.println(chart.printChart());
    		out.close();
    	}
    
    }
    

Create a file called _GetGraphOptions.java_ in _src/_ directory with content:

    
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    import flotjf.Chart;
    import flotjf.options.Axis;
    
    /**
     * Servlet implementation class GetGraphOptions
     */
    @WebServlet("/GetGraphOptions")
    public class GetGraphOptions extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("application/json");
    		PrintWriter out = response.getWriter();
    
    		Chart chart = new Chart();
    	
    		Axis yAxis = new Axis();
    		chart.addYAxis(yAxis);
    	
    		Axis xAxis = new Axis();
    		chart.addXAxis(xAxis);
    
    		out.println(chart.printChartOptions());
    		out.close();
    	}
    
    }
    

Deploy the code to an application server and verify the output of
http://hostname/ContextRoot/flotjfexample.html as:

![](/dunse/FlotJF/raw/master/src/main/java/doc-files/flotjfexample.jpg)

