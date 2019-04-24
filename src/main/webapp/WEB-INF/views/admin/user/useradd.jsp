
<%@include file="./header.jsp"%>


<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			General ADD User <small>Form</small>
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
						action="${pageContext.request.contextPath}/Admin/User/Add"
						method="post">
						<div class="box-body">
							<div class="form-group">
								<label for="firstname">First Name</label> <input
									type="text" class="form-control" id="firstname"
									name="firstname" placeholder="Enter First Name">
							</div>
							<div class="form-group">
								<label for="exampleInputText">Last Name</label> <input
									type="text" class="form-control" id="lastname" name="lastname"
									placeholder="Enter Last Name">
							</div>

							<div class="form-group">
								<label for="exampleInputText">Contact Number</label> <input
									type="text" class="form-control" id="phone" name="phone"
									placeholder="Enter Contact Number">
							</div>
							<div class="form-group">
								<label for="exampleInputText">Email</label> <input type="email"
									class="form-control" id="email" name="email"
									placeholder="Enter Current Email">
							</div>
							
							<div class="form-group">
								<label for="exampleInputText">Username</label> <input type="text"
									class="form-control" id="username" name="username"
									placeholder="Enter Your Username">
							</div>
							<div class="form-group">
								<label for="exampleInputText">Password</label> <input
									type="password" class="form-control" id="password"
									name="password" placeholder="Enter Correct Password">
							</div>


							<div class="form-group">
								<label>Active Status</label> <select class="form-control"
									id="active" name="active">
									<option value="1">Enable</option>
									<option value="0">Disable</option>
								</select>
							</div>
							
							<div class="form-group">
								<label>Authority</label> <select class="form-control"
									id="role" name="role">
									<option value="ROLE_ADMIN">ADMIN</option>
									<option value="ROLE_USER" >USER</option>
									<option value="ROLE_STUDENT" selected> STUDENT</option>
								</select>
							</div>

						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<button type="submit" class="btn btn-primary">Submit</button>
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