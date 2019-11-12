<#import "parts/common.ftl" as c>

<@c.page>

<div>
<form method="post">
    <input type="text" name="name" placeholder="enter client's name" />
    <input type="text" name="surname" placeholder="enter client's surname">
    <input type="text" name="email" placeholder="enter client's email">

    <input type="text" name="dateOfBirth" placeholder="enter client's date of birth">

    <button type="submit">ADD</button>
</form>
</div>

<div>
<#list clients as client>
<table class="w3-table-all">
    <div>

        ${client.id}
        ${client.name}
        ${client.surname}
        ${client.dateOfBirth}
        ${client.email}
        ${client.accountNumber}
        ${client.ballance}
</table>
    </div>
<#else>
No clients
</#list>
</div>


</@c.page>