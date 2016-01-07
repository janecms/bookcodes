package app27a;
import com.opensymphony.xwork2.ActionSupport;
public class TreeSupport extends ActionSupport {
	public Node getRootNode() {
		return new Node("root", "ROOT");
	}
}
