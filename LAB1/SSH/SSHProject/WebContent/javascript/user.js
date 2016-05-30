/**
 * 
 */


function login(){
	var usr_nam = $("input[name='user']").val();
	var usr_passwd = $("input[name='password']").val();
	$.ajax({
		type : "post",
		url : "./loginAction.action",
		dataType: "json",
		data:{'username':usr_nam, 'password': usr_passwd},
		error : function(){
			alert("error");
		}
	});
}

function register(){
	var usr_nam = $("input[name='user']").val();
	var usr_passwd = $("input[name='password']").val();
	$.ajax({
		type : "post",
		url : "./registerAction.action",
		dataType: "json",
		data:{'username':usr_nam, 'password': usr_passwd},
		error : function(){
			alert("error");
		}
	});
	
}
