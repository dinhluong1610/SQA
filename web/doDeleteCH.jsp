<%@page import="service.Configservice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("id"));

    
    int records = Configservice.deleteConfig(id);
    if (records > 0) {
%>
<script type="text/javascript">
    //alert("Soá thành công");
    window.location.replace("ListConfig.jsp");
</script>
<%
} else {
%>
<script type="text/javascript">
    alert("Error");
    window.location.replace("AddConfig.jsp");
</script>
<% }%>