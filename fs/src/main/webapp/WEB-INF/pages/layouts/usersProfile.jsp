<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>User's profile</title>
    </head>
    
    <body>
        <h1>User's profile page</h1><br/>
        <form action="controller" method="get">
            <input type="hidden" name="command" value="show_user_info"/>
            <input type="submit" value="User info"/>
        </form>
        <br/>
        
        <form action="controller" method="get">
            <input type="hidden" name="command" value="go_to_fs_project"/>
            <input type="submit" value="View project"/>
        </form>
    </body>
</html>