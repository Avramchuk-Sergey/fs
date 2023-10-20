<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Base Page</title>
    </head>
    
    <body>
        <h1>Main page</h1><br />
        <form action="controller" method="get">
            <input type="hidden" name="command" value="do_sign_in" />
            <input type="submit" value="Sign in"/>
        </form>
        <br />
        <form action="controller" method="get">
            <input type="hidden" name="command" value="do_registration"/>
            <input type="submit" value="Registration"/>
        </form>
        <br />
        <form action="controller" method="get">
            <input type="hidden" name="command" value="do_search"/>
            <input type="submit" value="Search"/> 
        </form>
        <br />
    </body>
</html>