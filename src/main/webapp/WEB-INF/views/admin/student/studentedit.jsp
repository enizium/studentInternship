 <%@include file="header.jsp" %>
 
 
   <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        General Edit Student
        <small>Form</small>
      </h1>
    
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Fill the Following Fields</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" action="${pageContext.request.contextPath}/Admin/Student/Update" method="post">
              <div class="box-body">
              <div class="form-group">
                  <label for="exampleInputText">Student Id</label>
                  <input type="text"  class="form-control" id="id" name="id" readonly="readonly" value="${studentdata.id}" >
                </div>
                <div class="form-group">
                  <label for="exampleInputText">First Name</label>
                  <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter First Name" value="${studentdata.firstname}" >
                </div>
                <div class="form-group">
                  <label for="exampleInputText">Last Name</label>
                  <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter Last Name" value="${studentdata.lastname}" >
                </div>

                 <div class="form-group">
                  <label for="exampleInputText">Contact Number</label>
                  <input type="text" class="form-control" id="phone"  name="phone" placeholder="Enter Contact Number" value="${studentdata.phone}" >
                </div>
                <div class="form-group">
                  <label for="exampleInputText">Address</label>
                  <input type="text" class="form-control" id="address" name ="address" placeholder="Enter Current Address" value="${studentdata.address}" >
                </div>
                
                

                <div class="form-group">
                  <label>Course</label>
                  <select class="form-control" id="course" name="course"  >
                    <option value="java" <c:if test="${studentdata.course.equals('java')}">selected </c:if>> Java</option>
                    <option value ="php" <c:if test="${studentdata.course.equals('php')}">selected </c:if>>PHP</option>
                    <option value="javascript" <c:if test="${studentdata.course.equals('javascript')}">selected </c:if>>Javascript</option>
                    <option value=".net" <c:if test="${studentdata.course.equals('.net')}">selected </c:if>>.net</option>
                    <option value="webdesign" <c:if test="${studentdata.course.equals('webdesign')}">selected </c:if>>Web Design</option>
                    
                  </select>
                </div>
                
                  <div class="form-group">
                  <label>Mentor</label>
                  <select class="form-control" id="mentor" name="mentor">
                    <c:forEach items="${mentordata}" var="mentor">
                    <option value="${mentor.id}">${mentor.firstname} &nbsp;${mentor.lastname}</option> 
                    </c:forEach>
                  </select>
                </div>
                
                
              
                
                  <div class="form-group">
                  <label for="exampleInputText">Date</label>
                  <input type="date" class="form-control" id="date" name ="date" placeholder="" value="${studentdata.date}" >
                </div>
              
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Update Student</button>
              </div>
            </form>
          
            <!-- /input-group -->
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->

       
        <!--/.col (left) -->
        <!-- right column -->
       
        <!--/.col (right) -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
 
   <%@include file ="footer.jsp"%>