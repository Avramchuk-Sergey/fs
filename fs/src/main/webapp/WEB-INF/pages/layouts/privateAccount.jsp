<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
    <head>
        <title>Private Account</title>
    </head>
    
    <body>
        <h1>Your private account</h1><br/>
        
        <form action="controller" method="get">
            <input type="hidden" name="command" value="edit_personal_data"/>
            <input type="submit" value="edit personal data"/>
        </form>
        <br/>
        
        <form action="controller" method="get">
            <input type="hidden" name="command" value="go_to_fs_project"/>
            <input type="submit" value="view project"/>
        </form>
        <br/>
        
        <form action="controller" method="get">
            <input type="hidden" name="command" value="go_to_fs_editor"/>
            <input type="submit" value="create new project"/>
        </form>
        <br/>
    </body>
</html>