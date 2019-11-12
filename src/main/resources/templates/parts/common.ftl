<#macro page>

<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>mynotebook</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body style="background-color:powderblue;">
    <div class="container mt-5" >
        <#nested>
    </div>

</body>
</html>
</#macro>