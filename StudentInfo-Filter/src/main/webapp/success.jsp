<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" 
    				uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html lang="zh-CN">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<title>学生信息筛选系统</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row" id="studentInfo">
			<div class="col-xs-0 col-sm-1 col-md-2 col-lg-3"></div>
			<div class="col-xs-12 col-sm-10 col-md-8 col-lg-6">
				<div class="row">
					<ul class="nav nav-tabs">
						<li><a href="javascript:void(0)">方向</a></li>
						<li><a href="getStu">全部</a></li>
						<li class="li1"><a href="javascript:void(0)" >Java开发</a></li>
						<li class="li1"><a href="javascript:void(0)">大数据</a></li>
						<li class="li1"><a href="javascript:void(0)">软件测试</a></li>
						<li class="li1"><a href="javascript:void(0)">Web前端</a></li>
					</ul>
					<ul class="nav nav-tabs">
						<li><a href="javascript:void(0)">性别</a></li>
						<li><a href="getStu">全部</a></li>
						<li class="li2"><a  href="javascript:void(0)">男</a></li>
						<li class="li2"><a href="javascript:void(0)">女</a></li>
					</ul>
					
				</div>
				
				<div class="row">
					<table class="table table-bordered table-striped show_tab">
						<thead class="tableInfo">
							<tr class="success" id="show_tab_one">
								
								<th>编号</th>
								<th>学号</th>
								<th>姓名</th>
								<th>性别</th>
								<th>专业</th>
								<th>方向</th>
								<th>技术</th>
								<th>能力</th>
							</tr>
						</thead>
						<tbody class="info">
						<c:forEach items="${students }" var ="student" >
							<tr class="show_tab_tr">
								<td>${student.id }</td>
								<td>${student.stuNum }</td>
								<td>${student.stuName }</td>
								<td>${student.stuSex }</td>
								<td>${student.stuPro }</td>
								<td>${student.stuDir }</td>
								<td>${student.stuSkill }</td>
								<td>${student.stuAbility }</td>
							</tr>
							</c:forEach>
						</tbody>
						<tfoot></tfoot>
					</table>
					
				<div class="box" id="box">              
                <input id="lastpage" type="button" value="上一页" 
                class="btn">
                <input id="curPage"  type="text" size="5">
                <input id="npage" type="button" class="btn" 
                value="确定">
                <input id="nextpage" type="button" class="btn" 
                value="下一页">
                <strong>共</strong>
                <input id="page" type="text" 
                size="1"  
                readonly="readonly" >
                <strong>页</strong>
                <strong>每页显示</strong>                   
                <input id="pageSize" type="text" value="4" 
                size="5" > <strong>行</strong>
                <input type="button"  value="确定" 
                class="btn sure">  
              </div>
				</div>
			</div>
			<div class="col-xs-0 col-sm-1 col-md-2 col-lg-3"></div>
		</div>
		<div class="row   information" id="addStudent" style="margin-top:20px;margin-left:-120px;">
			<div class="col-xs-0 col-sm-1 col-md-2 col-lg-3"></div>
			<div class="col-xs-12 col-sm-10 col-md-8 col-lg-6">
				<form class="form-horizontal"  action="addStu">
					<div class="form-group">
						<label for="studentNumber" class="col-sm-2 control-label" >编号</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="studentNumber"
								placeholder="请输入学号" name="stuNum">
						</div>
					</div>
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label" >姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="username" name="stuName"
								placeholder="请输入用户名">
						</div>
					</div>
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label" >专业</label>
						<div class="col-sm-10">
							<select class="form-control" name="stuPro">
								<option value="软件工程" >软件工程</option>
								<option value="计算机科学与技术">计算机科学与技术</option>
								<option value="电子商务">电子商务</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label">方向</label>
						<div class="col-sm-10">
							<select class="form-control" name="stuDir">
								<option value="Java开发">Java开发</option>
								<option value="大数据">大数据</option>
								<option value="Web前端">Web前端</option>
								<option value="软件测试">软件测试</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="technology" class="col-sm-2 control-label">技术</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="technology" name="stuSkill"
								placeholder="请输入技术分数">
						</div>
					</div>
					<div class="form-group">
						<label for="power" class="col-sm-2 control-label">能力</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="power" name="stuAbility"
								placeholder="请输入能力分数">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="radio">
								<label> <input type="radio" name="stuSex" checked value="男">男
								</label> &nbsp;&nbsp; <label> <input type="radio" name="stuSex" value="女">女
								</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-success">新增</button>
							<button type="reset" class="btn btn-error">重置</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-xs-0 col-sm-1 col-md-2 col-lg-3"></div>
		</div>
	</div>
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript">
		var pageSize=4;  // 每页显示的记录条数
	        var curPage=0;   // 显示第curPage页
	        var len;         // 总行数
	        var page;        // 总页数
	       $(function(){    
	       len =$(".show_tab tr").length-1;   // 去掉表头
	        page=len % pageSize==0 ? len/pageSize : Math.floor(len/pageSize)+1;// 根据记录条数，计算页数
	        $("#page").val(page);
	        curPage=1;
	        displayPage();// 显示第一页
	      $("#nextpage").click(function(){// 下一页
	          if(curPage<page){
	              curPage+=1;
	          }
	          else{
	              alert("已是最后一页！");
	          }
	         displayPage();
	         });
	      $("#lastpage").click(function(){// 上一页
	          if(curPage>1){
	              curPage-=1;
	          }
	          else{
	              alert("已是第一页！");
	          }
	          displayPage();
	          });
	      $("#npage").click(function(){// 跳到固定某一页
	          var npage=parseInt(document.getElementById("curPage").value);
	          if(npage>page||npage<1){
	              alert("该页不存在！");
	          }
	          else{
	              curPage=npage;
	          }
	          displayPage();
	          });
	 });
	     // 首页滚动效果
	 function displayPage(){  
	     var begin=(curPage-1)*pageSize;// 起始记录号
	     var end = begin + pageSize;
	     if(end > len ) end=len;
	     $(".show_tab tr").hide();
	     $(".show_tab tr").each(function(i){
	         if(i-1>=begin && i-1<end)// 显示第page页的记录
	             {
	             $("#show_tab_one").show();
	             $(this).show();
	             document.getElementById("curPage").value=curPage;
	             }         
	     });

	 }        
	 $(".sure").click(function(){
		   curPage=0;   // 显示第curPage页
		     pageSize=parseInt($("#pageSize").val());
		      len =$(".show_tab tr").length-1;   // 去掉表头
		      page=len % pageSize==0 ? len/pageSize : Math.floor(len/pageSize)+1;// 根据记录条数，计算页数
		      $("#page").val(page);
		      curPage=1;
		      displayPage();// 显示第一页
	 });
	 var index=$(".li1");
	 var a=$(".li2 ");
	 $(index).on("click",function(){
	 	var i =$(index).index(this);
	 	var direction=$(index).eq(i).text();
	 	$.ajax({
	 		type:"POST",
	 		url:"getInfo",
	 		dataType:"JSON",
	 		data:{
	 			direction:direction
	 		},
	 		success: function(data){
	 			if(data==""){
	 				alert("无该方向学生！");
	 			}
	 			else{
	 				var html;
	 				$(".info").remove();
	 				$(".show_tab").append("<tbody class='info'>");
	 			$.each(data,function(i,item){
	 				
	 				html="<tr><td>"+item.id+"</td><td>"+item.stuNum+"</td><td>"+
	 				item.stuName+"</td><td>"+item.stuSex+"</td><td>"+item.stuPro+
	 				"</td><td>"+item.stuDir+"</td><td>"+item.stuSkill+"</td><td>"+item.stuAbility+
	 				"</td></tr>";
	 				$(".show_tab").append(html);
	 			})
	 			$(".show_tab").append("</tbody>");
	 			
	 			}
	 			}
	 	})
	 })
	$(a).on("click",function(){
		var j=$(a).index(this);
		var sex=$(a).eq(j).text();
		$.ajax({
	 		type:"POST",
	 		url:"getSex",
	 		dataType:"JSON",
	 		data:{
	 			sex:sex
	 		},
	 		success: function(data){
	 				var html;	
	 				$(".info").remove();
	 				$(".show_tab").append("<tbody class='info'>")
	 				console.log(data);
	 				$.each(data,function(i,item){
		 				html="<tr><td>"+item.id+"</td><td>"+item.stuNum+"</td><td>"+
		 				item.stuName+"</td><td>"+item.stuSex+"</td><td>"+item.stuPro+
		 				"</td><td>"+item.stuDir+"</td><td>"+item.stuSkill+"</td><td>"+item.stuAbility+
		 				"</td></tr>";
		 				$(".show_tab").append(html);
		 			})
	 			$(".show_tab").append("</tbody>");
	 			
	 			}
	 	})
	});

	</script>
</body>
</html>