<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
    <head>
        <title>Search result</title>
    </head>
    
    <body>
        <h1>Search result page</h1><br/>
        
        <form action="controller" method="get">
            <input type="hidden" name="command" value="go_to_user_profile"/>
            <input type="submit" value="User profile"/>
        </form>
    </body>
</html>