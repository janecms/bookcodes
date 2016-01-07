<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>Tree</title>
<sx:head debug="true"/>
</head>
<body>
<sx:tree id="root" label="Root">
   <sx:treenode id="F1" label="F1" />
   <sx:treenode id="F2" label="F2">
       <sx:treenode id="F2a" label="F2a" />
       <sx:treenode id="F2b" label="F2b" />
   </sx:treenode>
   <sx:treenode id="F3" label="F3" />
</sx:tree>
</body>
</html>
