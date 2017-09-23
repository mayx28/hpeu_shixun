<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>轻实训-登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="keywords" content="实训,教育,IT">
<meta name="description" content="轻实训用户登录案例">
<meta name="author" content="轻实训">

<style>
html {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
}

body {
	text-align: center;
}

#loginContainer {
	margin: 10% auto 0 auto;
	padding: 15px;
	width: 780px;
	height: 360px;
	border: solid 1px #ccc;
}

.container-left {
	float: left;
	width: 40%;
}

.container-right {
	float: left;
	width: 60%;
}

.login-container h1 {
	border-bottom: 1px solid #ddd;
	background: url('images/logo.png') no-repeat 90px;
	background-size: 50px;
	font-weight: 700;
	font-size: 25px;
	line-height: 60px;
}

form {
	position: relative;
	width: 100%;
	text-align: center;
}

.input-group .input {
	margin-top: 20px;
	padding: 0 10px;
	width: 50%;
	height: 30px;
	font-size: 14px;
}

.remember-me {
	margin-top: 10px;
	margin-left: 15%;
	width: 100%;
	text-align: left;
	position: relative;
}

.remember-me font {
	position: absolute;
	left: 60px;
}

.login-control {
	margin-top: 20px;
}

.login-control button {
	margin: 15px;
	width: 80px;
	height: 25px;
}
</style>
</head>

<body>
	<div id="loginContainer" class="login-container">
		<div class="container-left">
			<img src="images/login.jpg">
		</div>
		<div class="container-right">
			<h1>系统登录</h1>
			<form name="loginForm" action="LoginServlet"
				onsubmit="return login()" method="post">
				<div class="input-group">
					<label>用户名：</label> <input type="text" name="username"
						class="input" id="username" placeholder="请输入您的用户名！">
				</div>
				<div class="input-group">
					<label class="letter">密&nbsp;&nbsp;&nbsp;码：</label> <input
						type="password" name="password" class="input" id="passWord"
						placeholder="请输入您的登录密码！">
				</div>
				<div class="remember-me">
					<font color="#d93a49" size="3px">${message}</font> <br> <input
						type="checkbox" name="remember"> <label for="remember">记住密码</label>
				</div>
				<div class="login-control">
					<button type="submit" class="">登陆</button>
					<button type="reset" class="">重置</button>
					<button type="button" class="">注册</button>

				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		// 登陆验证函数
		function login() {
			//获取用户输入的用户名
			var username = document.getElementById("username").value;
			//获取用户输入的密码
			var password = document.getElementById("passWord").value;

			//验证用户输入项
			if (username == "") {
				alert("用户名不允许为空！");
				return false;
			} else if (password == "") {
				alert("密码不允许为空！");
				return false;
			}

		}
	</script>
</body>

</html>
