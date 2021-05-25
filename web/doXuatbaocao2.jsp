<%-- 
    Document   : doXuatbaocao
    Created on : Mar 20, 2021, 5:45:24 PM
    Author     : This PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*,model.*,DAO.*"%>
  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Báo cáo Tiền bảo hiểm xã hội 1 lần</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script src="https://cdn.rawgit.com/rainabba/jquery-table2excel/1.1.0/dist/jquery.table2excel.min.js"></script>
    <style type="text/css">
        h2{
           
            margin-right:100px;
            margin-left:100px;
            
        }
    </style>
    </head>
    <%
        ArrayList<Baocao> b= (new BaocaoDAO()).getBaocao2();
        
        
    %>
    <body>
    <h2> Báo cáo tiền đóng bảo hiểm của khách hàng </h2>
   
    
        <table id="table2excel" class="table " style="border: 1px solid black;border-collapse: collapse;" >
        <tr>
        <th style="border: 1px solid black; padding:0 15px 0 15px;">ID</th>
        <th style="border: 1px solid black; padding:0 15px 0 15px;">Tên khách hàng</th>
        <th style="border: 1px solid black; padding:0 15px 0 15px;">Số điện thoại</th>
        <th style="border: 1px solid black; padding:0 15px 0 15px;">Email</th>
        <th style="border: 1px solid black; padding:0 15px 0 15px;">Địa chỉ</th>
        <th style="border: 1px solid black; padding:0 15px 0 15px;">Tiền đóng bảo hiểm(đơn vị: đồng)</th>
        </tr>     
        <%
            if(b!=null)
            for(int i=0;i<b.size();i++){
                
        %>
        <tr> 
            <td style="border: 1px solid black; padding:0 15px 0 15px;"><%=i+1 %></td>
            <td style="border: 1px solid black; padding:0 15px 0 15px;text-align: left"><%=b.get(i).getName()%></td>
            <td style="border: 1px solid black; padding:0 15px 0 15px;text-align: left"><%=b.get(i).getSdt()%></td>
            <td style="border: 1px solid black; padding:0 15px 0 15px;text-align: left"><%=b.get(i).getEmail()%></td>
            <td style="border: 1px solid black; padding:0 15px 0 15px;text-align: left"><%=b.get(i).getAddress()%></td>
            <td style="border: 1px solid black; padding:0 15px 0 15px;text-align: right"><%=b.get(i).getMoney()%></td>
        </tr>
        
      <%   ; }%>
        <tr> 
            <td colspan="6" style="text-align:right">Thời gian lập báo cáo: <%=b.get(0).getD()%></td>
        </tr>
        
        </table>
        
        <button id= "bt" onclick="myFunction()">Xuất ra Excel</button>

    
    <script>
    $('#bt').click(function () {
        $("#table2excel").table2excel({
            filename: "Baocao.xls"
        });
    });
</script>
    
    </body>
</html>
