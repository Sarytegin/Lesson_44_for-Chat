<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Список книг</title>
</head>
<body>
<h1>Список книг</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Название</th>
        <th>Автор</th>
        <th>Статус</th>
        <th>Кому выдана</th>
        <th>Действие</th>
    </tr>
    <#list books as book>
    <tr>


        <td>${book.id}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>
            <#if book.issued>
            Выдана
            <#else>
            В наличии
        </#if>
        </td>
        <td>
            <#if book.issued>
            ${book.issuedTo.firstName} ${book.issuedTo.lastName}
            <#else>
            -
        </#if>
        </td>
        <td><a href="/book/${book.id}">Просмотр</a></td>
    </tr>
</#list>
</table>
</body>
</html>