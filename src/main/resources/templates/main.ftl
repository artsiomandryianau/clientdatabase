<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>



<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
Add new client
</a>
<div class="collapse" id="collapseExample">
<div class="form-group mt-3">
    <form method="post" enctype="multipart/form-data">
        <div class="form-group">
            <input type="text" class="form-control" name="name" placeholder="enter client name">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="surname" placeholder="enter client's surname">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="email" placeholder="enter client's email">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="dateOfBirth" placeholder="enter client's date of birth">
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Add</button>
        </div>
    </form>
</div>
</div>








<div class="w3-table-all w3-hoverable">

    <table>
        <thead>
        <tr class="w3-light-grey">
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Date of birth</th>
            <th>Email</th>
            <th>Account number</th>
            <th>Ballance</th>
        </tr>
        </thead>
        <#list clients as client>
        <tr>

            <td>${client.id}</td>
            <td>${client.name}</td>
            <td>${client.surname}</td>
            <td>${client.dateOfBirth}</td>
            <td>${client.email}</td>
            <td>${client.accountNumber}</td>
            <td>${client.ballance}</td>
        </tr>
    <#else>
No clients
</#list>
    </table>
</div>


</@c.page>