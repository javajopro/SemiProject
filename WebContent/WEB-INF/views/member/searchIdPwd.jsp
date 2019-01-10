<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface" rel="stylesheet">
  <link rel="stylesheet" href="<%=request.getContextPath() %>/css/header.css">
  <title>아이디/비밀번호 찾기</title>
  <script src="<%=request.getContextPath() %>/js/jquery-3.3.1.js"></script>
<style>
#table1 {
	border: 1px solid black;
	width: 50%;
	height: 200px;
	position:absolute;
}

#table2{
	border: 1px solid black;
	width: 50%;
	height: 200px;
	
	/* position: right; */
}
#table3{
	border: 1px solid black;
	width:100%;
	height:52px;
	text-align: center;
}
#button1{
	text-align: center;
	
}
#button2{
	padding-left: 170px;
}
#searchid{
	text-align: center;
}
#searchId2{
	
	text-align: center;
	
}
</style>
<script>
function chk(){
	console.log("??????");
	var param = {
			"pname":$("#userName_").val(),
			"pemail":$("#email_").val()
	}
	$.ajax({
		type: "post",
		url:"<%=request.getContextPath()%>/member/searchId",
		data: param,
	success: function(data){
		console.log(data);
		var html="<table>";
		if(data != null){
			html +="<tr><td id='searchId2'>"+"당신의 아이디는 "+data.memberId+" 입니다."+"</td></tr>";
			/* html +="<td>"+param.pemail+"</td></tr>"; */
		}
		html+="</table>";
		
		$("#table1").html(html);
	},
	error:function(){
		
	}
	});
}
<%-- $("#searchPwd__").on("click",function(){
	var param = {
			"pId":$("#userId_").val(),
			"pemail":$("#email_").val()
			
	}
	$.ajax({
		type: post,
		url:"<%=request.getContextPath()%>/member/searchIdPwdd",
		data: param,
	success: function(data){
		console.log(data);
		var html="<table>";
		for(var i in data){
			var search =data[i];
			/* html +="<tr><td>"++"</td>"; */
		//	html +="<td>"+param.pemail+"</td></tr>";
		}
		html+="</table>";
		$("#table2").html(html);
	},
	error:function(){
		
	}
	});
}); --%>
</script>
</head>

<body>
<nav class="header">
    <div class="logo">
      <img src="<%=request.getContextPath() %>/images/logo.png" width="50px" height="50px" >
      <span class="logofont">7' Scheduler
      </span>
    </div>  
</nav>
	<div id="userIdPwd">
	<form action="<%=request.getContextPath()%>/member/searchIdPwd"
			name="searchIdPwd_" method="post">
			<table id="table1" style="float: left">
				<tr>
					<th class="searchid">아이디 찾기</th>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="userName" id="userName_" placeholder="찾아야한다.." required /></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email" id="email_" placeholder="찾아야한다.." required /></td>
				</tr>
				 <tr>
                  	<td colspan="2" id="button1">
                  		<input type="button" value="아이디 찾기" onclick="chk()" />
                  		
                  	</td>
                  </tr>
			</table>
			</form>
			<form action="<%=request.getContextPath()%>/member/searchIdPwd"
			name="searchIdPwd_" method="post">
			<table id="table2" style="float: right">
			<tr>
					<th id="searchid">비밀번호 찾기</th>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="userId" id="userId_" placeholder="찾아야한다.." required /></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email" id="email_" placeholder="찾아야한다.." required /></td>
				 <tr>
                  	<td colspan="2" id="button2">
                  		<input type="button" onclick="return searchPwd__();" value="비밀번호 찾기" />
                  		
                  	</td>
                  </tr>
			</table>
	
			<table id="table3">
				 <tr>
					<td>
                  		<input type="button" onclick="self.close();" value="취소"  />
                  	</td>
                  </tr>
			</table>

		</form>

	</div>

</body>
</html>