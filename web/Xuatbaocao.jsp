<%-- 
    Document   : Xuatbaocao
    Created on : Mar 20, 2021, 5:08:56 PM
    Author     : This PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xuất báo cáo</title>
    </head>
    <body>
        <form name="form1" onSubmit="actionOnSubmit()" method="post">
            
            <label for="bao cao">Chọn loại báo cáo:</label>
            <select name="bao cao" id="bao cao">
                <option value="None">-- Loại báo cáo --</option>
                <option value="doXuatbaocao.jsp ">Tiền BHXH chi trả 1 lần</option>
                <option value="doXuatbaocao2.jsp ">Tiền BHXH khách hàng đã đóng</option>
            </select>
            
            <button type="submit">Xuất báo cáo</button>
        </form>
            
            <script>

                function actionOnSubmit()
                {
                var e = document.getElementById("bao cao");
                var baocao = e.options[e.selectedIndex].value;
                document.form1.action = baocao;
                }
             </script>
                
    </body>
    
</html
