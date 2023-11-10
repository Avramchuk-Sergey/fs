<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
   <style> 
      <%@include file="/WEB-INF/styles/defaultFsElement.css"%> 
   </style>

   <script>
      <%@include file="/WEB-INF/scripts/editorScripts/createNewFsElement.js"%>
      <%@include file="/WEB-INF/scripts/editorScripts/dragElement.js"%> 
   </script>
</head>

<body>
   <button onclick="createNewElement()">Create element</button>
   <div id="container"></div>
</body>

</html>