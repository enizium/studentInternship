
<%@include file="header.jsp"%>


<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			General Edit User <small>Form</small>
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
					<form role="form"
						action="${pageContext.request.contextPath}/Admin/User/Update"
						method="post">
						<div class="box-body">
							<div class="form-group">
								<label for="exampleInputText">User Id</label>
								<input type ="text" class ="form-control" id="id" name="id" readonly="readonly"
									value="${userdata.id}">
							</div>
							<div class="form-group">
								<label for="exampleInputText">First Name</label> 
								<input
									type="text" class="form-control" id="firstname"
									name="firstname" placeholder="Enter First Name"
									value="${userdata.firstName}">
							</div>
							<div class="form-group">
								<label for="exampleInputText">Last Name</label> <input
									type="text" class="form-control" id="lastname" name="lastname"
									placeholder="Enter Last Name" value="${userdata.lastName}">
							</div>

							<div class="form-group">
								<label for="exampleInputText">Contact Number</label> <input
									type="text" class="form-control" id="phone" name="phone"
									placeholder="Enter Contact Number" value="${userdata.phone}">
							</div>
							<div class="form-group">
								<label for="exampleInputText">Email</label> <input type="email"
									class="form-control" id="email" name="email"
									value="${userdata.email}" placeholder="Enter Current Email">
									
							</div>
							
							<div class="form-group">
								<label for="exampleInputText">Username</label> <input type="text"
									class="form-control" id="username" name="username" value="${userdata.username}"
									placeholder="Enter Your Username">
							</div>
							<div class="form-group">
								<label>Active Status</label> <select class="form-control"
									id="active" name="active">
									<option value="1" <c:if test ="${userdata.active.equals('1')}"> selected </c:if>> Enable</option>
									<option value="0" <c:if test="${userdata.active.equals('0')}">selected </c:if>>Disable</option>
                    
								</select>
							</div>				
							
							<div class="form-group">
								<label>ROLE</label> <select class="form-control"
									id="role" name="role">
										<option value="ROLE_ADMIN" <c:if test="${userdata.user_role.role.equals('ROLE_ADMIN')}">selected </c:if>>ADMIN</option>
									<option value="ROLE_USER" <c:if test="${userdata.user_role.role.equals('ROLE_USER')}">selected </c:if>>USER</option>
									<option value="ROLE_STUDENT" <c:if test="${userdata.user_role.role.equals('ROLE_STUDENT')}">selected </c:if>> STUDENT</option>
								
								</select>
							</div>

						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<button type="submit" class="btn btn-primary">Update
								User</button>
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

<%@include file="footer.jsp"%>