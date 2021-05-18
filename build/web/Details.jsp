<%-- 
    Document   : index.jsp
    Created on : Mar 22, 2021, 4:26:47 PM
    Author     : PC
--%>
<%@page import="DAO.DAO"%>
<%@page import="DAO.DanhsachDAO"%>
<%@page import="model.Customer"%>
<%@page import="model.Insurance"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin chi tiết</title>
    </head>
    <body>
        <h1 align="center">Thông tin chi tiết</h1>
        <table border = 1 style="border-collapse: collapse;" width="80%" align="center">
            <tr>
                <th>Insurance ID</th>
                <th>Ngày bắt đầu</th>
                <th>Ngày kết thúc</th>
                <th>Tiền lương</th>
            </tr>
            
            <%
                int id = Integer.parseInt(request.getParameter("id")) ;
                ArrayList<Insurance> list1 = new DanhsachDAO().getInsuranceById(id);
                int i=1;
      
                for(Insurance in: list1){
            %>
            <tr>
                <td><%= in.getId() %></td>
                <td><%= in.getStartDate()%></td>
                <td><%= in.getEndDate() %></td>
                <td><%= in.getSalary() %></td>
            </tr>
            <% } %>
            
        </table>
    </body>
</html>