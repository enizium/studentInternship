
 <%@include file="header.jsp" %>
 
 
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Data Tables
        <small>User</small>
      </h1>
    
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">User's Data Table</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>S.N</th>
                  <th>First Name</th>
                  <th>Last Name</th>
               
                  <th>Contact</th>
                  <th>Email</th>
                  <th>Username</th>
                  <th>Active Status</th>
                  <th>Role</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
                          <tbody>
                          			<% int i = 1; %>
                                    <c:forEach items="${userinfo}" var="user" >
                                        <tr>                                     
                                        	<td><%= i %> <% i++; %></td>                                             
                                            <td>${user.firstName}</td>
                                            <td>${user.lastName}</td>
                                           
                                            <td>${user.phone}</td>
                                            <td>${user.email}</td>
                                          <td>${user.username}</td>
                                            <td>${user.active}</td>
                                            <td>${user.user_role.role}</td>
                                            
                                            <td><a  class="btn btn-secondary btn-block" href="${pageContext.request.contextPath}/Admin/User/Edit/${user.id}">EDIT</a></td>
                                            <td><a class="btn  btn-warning btn-block" href="${pageContext.request.contextPath}/Admin/User/Delete/${user.id}">DELETE</a></td>

                                        </tr>
                                    </c:forEach>
                                </tbody>

                <tfoot>


                <tr>
                   <th>S.N</th>
                  <th>First Name</th>
                  <th>Last Name</th> 
                  <th>Contact</th>
                  <th>Email</th>
                  <th>Username</th>
                  <th>Active Status</th>
                  <th>Role</th>
                  
                </tr>
                </tfoot>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->

        
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <%@include file="footer.jsp" %>
 