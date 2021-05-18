<%@page import="model.Config"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.CauHinhDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý cấu hình</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    </head>
    <body>

        <div class="container">
            <div class = "panel panel-primary">
                <div class="panel-heading" align="center">
                    <h2 align="left"> Bảo hiểm xã hội 1 lần</h2>
                    <h2>Quản lý mức điều chỉnh hàng năm</h2>
                    
                </div>
                <br>
                <% ArrayList<Config> list = (new CauHinhDAO()).getConfigs(); %>
                <div class=" panel body">
                    <form>
                        <table class="table table-hover hover-bordered">
                            <tr>
                                <td colspan="4" align="right"> <a  href="AddConfig.jsp"><button  type="button" class='btn btn-success'>Thêm cấu hình</button></a></td>
                            </tr>
                            <tr>
                                <th>ID</th>
                                <th>Tên cấu hình</th>
                                <th>Hệ số nhân</th>
                                <th></th>
                            </tr>
                            <% for (int i = 0; i < list.size(); i++) {%>
                            <tr>
                                <td><%= i + 1%></td>
                                <td><%=list.get(i).getName()%></td>
                                <td><%=list.get(i).getHeso()%></td>
                                <td><a href="UpdateConfig.jsp?id=<%= list.get(i).getId() %>"><button type="button" class='btn btn-warning'>Sửa</button></a></td>
                                
                            </tr>
                            <% }%>
                        </table>
                    </form>
                    
                </div>
            </div>
        </div>
    </body>
</html>
