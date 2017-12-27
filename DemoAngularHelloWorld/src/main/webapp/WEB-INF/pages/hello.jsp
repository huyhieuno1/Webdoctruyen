<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="<c:url value="/resources/jquery/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/angular/angular.min.js" />"></script>
	<script src="<c:url value='/resources/js/app.js' />"></script>
	<script src="<c:url value='/resources/js/service/hello_service.js' />"></script>
	<script src="<c:url value='/resources/js/controller/hello_controller.js' />"></script>
	<title>Hello</title>
</head>
<body ng-app="hello" ng-controller="HelloController as ctrl">
	 Hello {{he}} 
	<h1>{{he.xxx}}</h1>
</body >

</html>