package com.brainysoftware.jfreechartplugin;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.dispatcher.StrutsResultSupport;
import org.jfree.chart.JFreeChart;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;

public class BrainyJFreeChartResult extends StrutsResultSupport {
    private int chartWidth = 200;
    private int chartHeight = 200;
    protected void doExecute(String finalLocation, 
            ActionInvocation invocation) throws Exception {
        ValueStack valueStack = (ValueStack) 
                invocation.getInvocationContext().getValueStack();
        
        JFreeChart chart = (JFreeChart) valueStack.findValue("chart");
        if (chart != null) {
            try {
                chartWidth = (Integer) valueStack.findValue("chartWidth");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            try {
                chartHeight = (Integer) valueStack.findValue("chartHeight");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            HttpServletResponse response = (HttpServletResponse) 
                    invocation.getInvocationContext().get(HTTP_RESPONSE);
            BufferedImage image = chart.createBufferedImage(
                    chartWidth, chartHeight);
            response.setContentType("image/jpg");
            ImageIO.write(image, "jpg", response.getOutputStream());
        }
    }
}
