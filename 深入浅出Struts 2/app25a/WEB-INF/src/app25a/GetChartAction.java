package app25a;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import com.opensymphony.xwork2.ActionSupport;

public class GetChartAction extends ActionSupport {

    private JFreeChart chart;

    public String execute() throws Exception {
        ValueAxis xAxis = new NumberAxis("Input Increase");
        ValueAxis yAxis = new NumberAxis("Production");
        XYSeries xySeries = new XYSeries(new Integer(1)); 
        
        xySeries.add(0, 200);
        xySeries.add(1, 300);
        xySeries.add(2, 500);
        xySeries.add(3, 700);
        xySeries.add(4, 700);
        xySeries.add(5, 900);
        
        XYSeriesCollection xyDataset = 
                new XYSeriesCollection(xySeries);

        // create XYPlot
        XYPlot xyPlot = new XYPlot(xyDataset, xAxis, yAxis,
                new StandardXYItemRenderer(
                        StandardXYItemRenderer.SHAPES_AND_LINES));
        chart = new JFreeChart(xyPlot);
        return SUCCESS;
    }

    public JFreeChart getChart() {
        return chart;
    }

}