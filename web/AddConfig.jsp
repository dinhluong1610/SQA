<%-- 
    Document   : AddConfig
    Created on : Mar 23, 2021, 12:03:49 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm cấu hình</title>
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
        <h2>Thêm cấu hình</h2>
        
        <form name = "form1" action="doAddCH.jsp">
            <table>
                <tr>
                    <td><b>Tên cấu hình:</b></td>
                    <td><input type="text" name="txtname" /></td>
                </tr>
                <tr>
                    <td><b>Hệ số nhân:</b></td>
                    <td ><input type="text" name="txthso" /></td>
                </tr>
                <tr>
                    <td colspan="2" align = "center"> <input type="button" value="Thêm" onclick="Chẹck()" />
                        <input type="reset" value="Tạo mới" />
                        <a href="ListConfig.jsp"> <button>Quay lại</button></a> <br>
                    </td>
                </tr>
            </table>
        </form>
       
    </body>
</html>
