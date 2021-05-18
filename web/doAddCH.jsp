<%@page import="service.Configservice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("txtname");
    float hso = Float.parseFloat(request.getParameter("txthso"));

    int records = Configservice.AddConfig(name, hso);
    if(records > 0) {
%>
<script type="text/javascript">
    alert("Thêm thành công");
    window.location.replace("ListConfig.jsp");
</script>
<%
    }
else {
%>
<script type="text/javascript">
    alert("Xảy ra lỗi,không thể sửa");
    window.location.replace("UpdateConfig.jsp");
</script>
<% }%>