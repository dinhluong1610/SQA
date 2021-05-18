<%-- 
    Document   : UpdateConfig
    Created on : Mar 23, 2021, 12:11:30 AM
    Author     : Admin
--%>

<%@page import="service.Configservice"%>
<%@page import="model.Config"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sửa cấu hình</title>
        <script>
            function Chẹck() {
                name = document.form1.txtname.value;
                hso = document.form1.txthso.value;
                if (name === "") {
                    alert("Nhập tên cấu hình");
                    document.form1.txtname.focus();
                    return;
                }
                if (hso === "") {
                    alert(" Xin nhập hệ số");
                    document.form1.txthso.focus();
                    return;
                }
                if (hso <= 0 || isNaN(hso)) {
                    alert("hệ số phải la số dương.");
                    document.form1.txthso.focus();
                    return;
                }
                document.form1.submit();
            }

        </script>
    </head>
    <body>
        <h1>Sửa cấu hình</h1>

        <%
            
            int id = Integer.parseInt(request.getParameter("id"));
            if(id >0) {
            Config config1 = Configservice.getConfigByID(id);
            
        %>

        <form name="form1" action="doEditCH.jsp" method="post"  >
            <input type="hidden" name="id" value="<%= config1.getId()%>" />
            <table>
                <tr>
                    <td>Tên cấu hình:</td> 
                    <td><input type="text" id="name" name="txtname" value="<%= config1.getName()%>"/></td>
                </tr>
                <tr>
                    <td>Hệ số nhân:</td>
                    <td><input type="text" id="hso" name="txthso" value="<%= config1.getHeso()%>" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="button" value="Update" onclick="Chẹck()"></td>
                </tr>
            </table>
        </form>
        <% } else {%>
        <script type="text/javascript">
            alert("Xảy ra lỗi,không thể sửa");
            window.location.replace("ListConfig.jsp");
        </script>
        <% }%>

</html>
