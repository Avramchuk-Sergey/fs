<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <title>Registration form</title>
</head>

    <body>
        <h1>Registration form</h1> <br/>
        
        <form action="controller" method="get">
            <input type="hidden" name="command" value="confirm_registration"/>
            <input type="submit" value="confirm registration"/>
        </form>
    </body>
</html>