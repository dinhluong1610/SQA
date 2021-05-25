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
        <form action="doXuatbaocao.jsp" method="post">
            
            <label for="bao cao">Chọn loại báo cáo:</label>
            <select name="bao cao" id="bao cao">
            <option value="tien bao hiem ">Tiền BHXH chi trả 1 lần</option>
            </select>
        
            <button type="submit" id="submit">Xuất báo cáo</button>
        </form>
                
    </body>
</html
