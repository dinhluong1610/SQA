<%@page import="service.Configservice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("txtname");
    float hso = Float.parseFloat(request.getParameter("txthso"));

    int records = Configservice.EditConfig(id, name, hso);
    if (records > 0) {
%>
<script type="text/javascript">
    alert("Sửa thành công");
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