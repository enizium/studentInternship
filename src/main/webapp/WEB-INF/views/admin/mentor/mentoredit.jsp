 <%@include file="header.jsp" %>
 
 
   <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        General Edit Mentor
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
            <form role="form" action="${pageContext.request.contextPath}/Admin/Mentor/Update" method="post">
              <div class="box-body">
              <div class="form-group">
                  <label for="exampleInputText">Mentor Id</label>
                  <input type="text" class="form-control" id="id" name="id" readonly="readonly" value="${mentordata.id}" >
                </div>
                <div class="form-group">
                  <label for="exampleInputText">First Name</label>
                  <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter First Name" value="${mentordata.firstname}" >
                </div>
                <div class="form-group">
                  <label for="exampleInputText">Last Name</label>
                  <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter Last Name" value="${mentordata.lastname}" >
                </div>
      
                 <div class="form-group">
                  <label for="exampleInputText">Contact Number</label>
                  <input type="text" class="form-control" id="phone"  name="phone" placeholder="Enter Contact Number" value="${mentordata.phone}" >
                </div>
                <div class="form-group">
                  <label for="exampleInputText">Address</label>
                  <input type="text" class="form-control" id="address" name ="address" placeholder="Enter Current Address" value="${mentordata.address}" >
                </div>

                <div class="form-group">
                  <label>Mentorship</label>
                  <select class="form-control" id="mentorship" name="mentorship"  value="${mentordata.mentorship}">
                    <option value="java" <c:if test="${mentordata.mentorship.equals('java')}">selected </c:if>> Java</option>
                    <option value ="php" <c:if test="${mentordata.mentorship.equals('php')}">selected </c:if>>PHP</option>
                    <option value="javascript" <c:if test="${mentordata.mentorship.equals('javascript')}">selected </c:if>>Javascript</option>
                    <option value=".net" <c:if test="${mentordata.mentorship.equals('.net')}">selected </c:if>>.net</option>
                    <option value="webdesign" <c:if test="${mentordata.mentorship.equals('webdesign')}">selected </c:if>>Web Design</option>
                  </select>
                </div>
              
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Update Mentor</button>
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