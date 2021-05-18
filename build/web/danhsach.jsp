<%-- 
    Document   : index.jsp
    Created on : Mar 22, 2021, 4:26:47 PM
    Author     : PC
--%>
<%@page import="DAO.DAO"%>
<%@page import="DAO.DanhsachDAO"%>
<%@page import="model.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Theo dõi danh sách</title>
    </head>
    <body>
        <h1 align="center">Thông tin khách hàng</h1>
        <table border = 1 style="border-collapse: collapse;" width="80%" align="center">
            <tr>
                <th>STT</th>
                <th>Tên khách hàng</th>
                <th>ID</th>
                <th>Thông tin</th>
            </tr>
            
            <%
                ArrayList<Customer> list = new DanhsachDAO().getList();
                int i=1;
      
                for(Customer c: list){
            %>
            <tr>
                <td><%= i++ %></td>
                <td><%= c.getName() %></td>
                <td><%= c.getId() %></td>
                <td><a href="Details.jsp?id=<%= c.getId() %>">Chi tiết</a></td>
            </tr>
            <% } %>
            
        </table>
    </body>
</html>