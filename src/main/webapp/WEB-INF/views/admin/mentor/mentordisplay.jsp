
 <%@include file="header.jsp" %>
 
 
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Data Tables
        <small>Mentors</small>
      </h1>
    
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Mentor's Data Table</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>S.N</th>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Address</th>
                  <th>Contact</th>
                  <th>Mentorship</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
                          <tbody>
                          			<% int i = 1; %>
                                    <c:forEach items="${mentordata}" var="mentor" >
                                        <tr>                                     
                                        	<td><%= i %> <% i++; %></td>                                             
                                            <td>${mentor.firstname}</td>
                                            <td>${mentor.lastname}</td>
                                            <td>${mentor.address}</td>
                                            <td>${mentor.phone}</td>
                                            <td>${mentor.mentorship}</td>
                                            
                                            <td><a  class="btn btn-secondary btn-block" href="${pageContext.request.contextPath}/Admin/Mentor/Edit/${mentor.id}">EDIT</a></td>
                                            <td><a class="btn  btn-warning btn-block" href="${pageContext.request.contextPath}/Admin/Mentor/Delete/${mentor.id}">DELETE</a></td>

                                        </tr>
                                    </c:forEach>
                                </tbody>

                <tfoot>


                <tr>
                 <th>S.N</th>
                 <th>First Name</th>
                  <th>Last Name</th>
                  <th>Address</th>
                  <th>Contact</th>
                  <th>Mentorship</th>
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
 