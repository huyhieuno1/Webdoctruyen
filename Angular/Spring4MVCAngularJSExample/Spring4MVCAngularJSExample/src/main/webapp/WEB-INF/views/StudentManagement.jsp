<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<title>Insert title here</title>
<link href="<c:url value='/bower_components/bootstrap/dist/css/bootstrap.min.css' />" rel="stylesheet"></link>
<link href="<c:url value='/bower_components/bootstrap/dist/css/bootstrap-theme.min.css' />" rel="stylesheet"></link>
<link href="<c:url value='/resource/css/app.css'/>" rel="stylesheet"></link>
<script src="<c:url value='/bower_components/jquery/dist/jquery.min.js' />"></script>
<script src="<c:url value='/bower_components/bootstrap/dist/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/bower_components/angular/angular.js' />"></script>
<script src="<c:url value='/resource/js/app.js' />"></script>
<script src="<c:url value='/resource/js/service/students_service.js' />"></script>
<script src="<c:url value='/resource/js/controller/students_controller.js' />"></script>
</head>
<body ng-app="myApp" class="ng-cloak">
<h1>Test</h1>
<div class="generic-container" ng-controller="StudentController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">User Registration Form </span></div>
              <div class="formcontainer">
                  <form ng-submit="submit(student)" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="student.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Tên SV</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="student.username" name="uname" class="username form-control input-sm" placeholder="Nhập Tên Sinh Viên" required ng-minlength="3"/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                      <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                      <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                        
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Địa Chỉ</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="student.address" class="form-control input-sm" placeholder="Nhập Địa Chỉ."/>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Email</label>
                              <div class="col-md-7">
                                  <input type="email" ng-model="student.email" name="email" class="email form-control input-sm" placeholder="Nhập Email" required/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.email.$error.required">This is a required field</span>
                                      <span ng-show="myForm.email.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Tên Lớp</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="student.classname" name="classname" class="form-control input-sm" placeholder="Nhập Tên Lớp"/>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Điểm Toán</label>
                              <div class="col-md-7">
                                  <input type="number" ng-model="student.diemtoan" name="diemtoan" class="form-control input-sm" placeholder="Nhập Điểm Toán" required/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.number.$error.required">This is a required field</span>
                                      <span ng-show="myForm.number.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>

					<div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Điểm Lý</label>
                              <div class="col-md-7">
                                  <input type="number" ng-model="student.diemly" name="diemly" class="form-control input-sm" placeholder="Nhập Điểm Lý" required/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.number.$error.required">This is a required field</span>
                                      <span ng-show="myForm.number.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Điểm Hóa</label>
                              <div class="col-md-7">
                                  <input type="number" ng-model="student.diemhoa" name="diemhoa" class="form-control input-sm" placeholder="Nhập Điểm Hóa" required/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.number.$error.required">This is a required field</span>
                                      <span ng-show="myForm.number.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!student.id ? 'Save' : 'Update'}}" class="btn btn-success btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Users </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>Mã SV.</th>
                              <th>Name</th>
                              <th>Điểm Toán</th>
                              <th>Điểm Lý</th>
                              <th>Điểm Hóa</th>
                              <th>Điểm TB</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="student in lstStudent">
                              <td><span ng-bind="student.id"> </span></td>
                              <td><span ng-bind="student.username | uppercase"></span></td>
                              <td><span ng-bind="student.diemtoan"></span></td>
                              <td><span ng-bind="student.diemly"></span></td>
                              <td><span ng-bind="student.diemhoa"></span></td>
                              <td><span> {{(student.diemtoan + student.diemly + student.diemhoa)/3}}</span></td>
                              <td>
                              <button type="button" ng-click="edit(student.id)" class="btn btn-success custom-width">Edit</button>  
                              <button type="button" ng-click="remove(student.id)" class="btn btn-danger custom-width">Remove</button>
                              </td>
                          </tr>
                      </tbody>
                  </table>
                  
              </div>
          </div>
      </div>
</body>
</html>