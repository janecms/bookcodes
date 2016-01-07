<%@ taglib prefix="s" uri="/struts-tags" %>
[
<s:iterator value="carMakes" status="status">
	['<s:property/>','<s:property/>']
	<s:if test="!#status.last">,</s:if>
</s:iterator>
]