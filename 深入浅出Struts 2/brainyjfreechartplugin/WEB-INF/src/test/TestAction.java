package test;

import java.awt.Color;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
    private JFreeChart chart;
    private int chartWidth = 250;
    private int chartHeight = 300;
    
    public String execute() {
        ValueAxis xAxis = new NumberAxis("Input Increase");
        ValueAxis yAxis = new NumberAxis("Production");
        XYSeries xySeries = new XYSeries(new Integer(1)); 
        
        xySeries.add(0, 200);
        xySeries.add(1, 300);
        xySeries.add(2, 500);
        xySeries.add(3, 700);
        xySeries.add(4, 700);
        xySeries.add(5, 900);
        
        XYSeriesCollection xyDataset = new XYSeriesCollection(xySeries);

        // create XYPlot
        XYPlot xyPlot = new XYPlot(xyDataset, xAxis, yAxis,
                new StandardXYItemRenderer(StandardXYItemRenderer.SHAPES_AND_LINES));//
        chart = new JFreeChart(xyPlot);
        chart.setBackgroundPaint(Color.WHITE);

        return SUCCESS;
    }

    public JFreeChart getChart() {
        return chart;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }

    public int getChartHeight() {
        return chartHeight;
    }

    public void setChartHeight(int chartHeight) {
        this.chartHeight = chartHeight;
    }

    public int getChartWidth() {
        return chartWidth;
    }

    public void setChartWidth(int chartWidth) {
        this.chartWidth = chartWidth;
    }

}
