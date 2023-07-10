<%@ page import="cn.nblg.emp.entity.Emp" %>
<%@page
        pageEncoding="UTF-8"
        contentType="text/html;charset=utf-8" %>
<html>
<head>
    <title>update Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="css/style.css"/>
</head>

<%
    Emp emp = (Emp) request.getAttribute("emp");
%>

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
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                update Emp info:
            </h1>
            <form action="update" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            id:
                        </td>
                        <td valign="middle" align="left">
                            <%=emp.getId()%>
                            <input type="hidden" name="id"
                                   value="<%=emp.getId()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            name:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" value="<%=emp.getName()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            salary:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="salary" value="<%=emp.getSalary()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            job:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="job" value="<%=emp.getJob()%>"/>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="Confirm"/>
                </p>
            </form>
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
