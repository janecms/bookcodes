<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Tabbed Panel</title>
<sx:head/>
</head>
<body>
<sx:tabbedpanel id="test">
   <sx:div label="Server Time" cssStyle="height:200px"
           href="ServerTime.action">
       Server Time
   </sx:div>
   <sx:div label="Closable" closable="true">
       This pane can be closed.
   </sx:div>
</sx:tabbedpanel>
</body>
</html>
