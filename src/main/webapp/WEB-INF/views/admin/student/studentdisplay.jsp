
 <%@include file="header.jsp" %>
 
 
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Data Tables
        <small>Students</small>
      </h1>
    
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Student's Data Table</h3>
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
                  <th>Course</th>
                  <th>Mentor</th>
                  <th>Date</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
                          <tbody>
                          			<% int i = 1; %>
                                    <c:forEach items="${studentdata}" var="student" >
                                        <tr>                                     
                                        	<td><%= i %> <% i++; %></td>                                             
                                            <td>${student.firstname}</td>
                                            <td>${student.lastname}</td>
                                            <td>${student.address}</td>
                                            <td>${student.phone}</td>
                                            <td>${student.course}</td>
                                          <td>${student.mentor_id.firstname} &nbsp;${student.mentor_id.lastname}</td>
                                            <td>${student.date}</td>
                                            
                                            <td><a  class="btn btn-secondary btn-block" href="${pageContext.request.contextPath}/Admin/Student/Edit/${student.id}">EDIT</a></td>
                                            <td><a class="btn  btn-warning btn-block" href="${pageContext.request.contextPath}/Admin/Student/Delete/${student.id}">DELETE</a></td>

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
                  <th>Course</th>
                  <th>Mentor</th>
                  <th>Date</th>
                  
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
 