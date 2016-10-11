package demo;

import org.apache.beehive.netui.pageflow.PageFlowController;
import org.apache.beehive.netui.pageflow.Forward;
import org.apache.beehive.netui.pageflow.FormData;
import java.util.Date;

import org.apache.beehive.netui.pageflow.annotations.Jpf;

@Jpf.Controller public class Controller extends PageFlowController {
	private String value1;
	private Date today;

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults1.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "demoResults", path = "DemoResults1.jsp") }) public Forward DemoSubmit() {
		return new Forward("demoResults");
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demo" path="Demo.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "success", path = "htmltags.jsp") }) public Forward begin() {
	this.getDate();
		return new Forward("success");
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "demoResults", path = "anchorform.jsp") }) public Forward displayAnchor() {
		return new Forward("demoResults");
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "demoResults", path = "results.jsp") }) public Forward submitAnchor() {
		return new Forward("demoResults");
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "success", path = "attributeForm.jsp") }) public Forward displayAttribute(
			TestBean bean) {
		// bean=new TestBean();
		return new Forward("success", bean);
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "demoResults", path = "DemoResults1.jsp") }) public Forward submitAttribute(
			TestBean bean) {
		// bean=new TestBean();
		return new Forward("demoResults", bean);
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "demoResults", path = "DemoResults.jsp") }) public Forward sutmitBase() {
		return new Forward("demoResults");
	}

	/**
	 * @jpf:action
	 * @jpf:forward name="demoResults" path="DemoResults.jsp"
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "demoResults", path = "DemoResults.jsp") }) public Forward sutmitBindingUpdateErrors() {
		return new Forward("demoResults");
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue1() {
		return this.value1;
	}

	public Date getDate() {
		Date today = new java.util.Date();
		return today;
	}
	
	public void setToday(Date value1) {
		this.today = value1;
	}

	public Date getToday() {
		return this.today;
	}

}