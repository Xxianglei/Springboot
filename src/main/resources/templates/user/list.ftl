<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SpringBootDemo</title>
    <script src="${request.contextPath}/js/jquery.js"></script>
    <script>
        $(function () {
            $("#xl").click(function () {
                alert("OJBK");
            });
        });

    </script>
</head>
<body>
<h1> 用户列表</h1>
<img src="${request.contextPath}/imgs/1.jpg" width="300px" height="300px" id="xl">
<table>
    <tr>
        <td>ID</td>
        <td>账号</td>
        <td>密码</td>
        <td>email</td>
    </tr>
    <#list list as li>
        <tr>
            <td> ${li.id}</td>
            <td> ${li.username}</td>
            <td> ${li.password}</td>
            <td> ${li.email}</td>
        </tr>
    </#list>
</table>
</body>
</html>