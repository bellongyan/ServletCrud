<%@ page import="cn.nblg.emp.entity.Emp,java.util.List"
         pageEncoding="UTF-8"
         contentType="text/html; charset=utf-8"
%>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        job
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>

                <%
                    List<Emp> emps = (List<Emp>) request.getAttribute("emps");
                    for (Emp e : emps) {
                %>
                <tr class="row1">
                    <td>
                        <%=e.getId()%>
                    </td>
                    <td>
                        <%=e.getName()%>
                    </td>
                    <td>
                        <%=e.getSalary()%>
                    </td>
                    <td>
                        <%=e.getJob()%>
                    </td>
                    <td>
                        <a href="del?id=<%=e.getId()%>"
                           onclick="return confirm('确认删除<%=e.getName()%>嘛？')">delete emp</a>
                        <a href="load?id=<%=e.getId()%>">update emp</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='addEmp.html'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
