package app06a;
import org.apache.struts2.util.IteratorGenerator;
import com.opensymphony.xwork2.ActionSupport;
public class GeneratorConverterTestAction extends ActionSupport {
    public IteratorGenerator.Converter getMyConverter() {
        return new IteratorGenerator.Converter() {
            public Object convert(String value) throws Exception {
                return value.toUpperCase();
            }
        };            
    }    
}