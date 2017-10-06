$(function() {
    var $username = $("#username");
    var $pwd = $("#password");
    var $rpwd = $("#repeatPassword");
    var $email = $("#email");

    $username.blur(function() {
        var $parent = $(this).parent();
        if (!$(this).val()) {
            $(".tips1").html("用户名不能为空！！！");
            $(".tips1").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else if ($(this).val().length > 20 || $(this).val().length < 6) {
            $(".tips1").html("长度必须在6~20之间！！！");
            $(".tips1").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else {
            $(".tips1").html("");
            $("button").removeAttr("disabled");
            return true;
        }
    });
    $pwd.blur(function() {
        if (!$(this).val()) {
            $(".tips2").html("密码不能为空！！！");
            $(".tips2").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else if ($(this).val().length > 20 || $(this).val().length < 6) {
            $(".tips2").html("长度必须在6~20之间！！！");
            $(".tips2").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else {
            $(".tips2").html("");
            $("button").removeAttr("disabled");
            return true;
        }
    });
    $rpwd.blur(function() {
        if (!$(this).val()) {
            $(".tips3").html("重复密码不能空！！！");
            $(".tips3").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else if ($(this).val() != $pwd.val()) {
            $(".tips3").html("两次输入的密码不相同！！！");
            $(".tips3").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else if ($(this).val().length > 20 || $(this).val().length < 6) {
            $(".tips2").html("长度必须在6~20之间！！！");
            $(".tips2").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else {
            $(".tips3").html("");
            $("button").removeAttr("disabled");
            return ture;
        }
    });
    $email.blur(function() {
        if (!$(this).val()) {
            $(".tips4").html("邮箱不能为空！！！");
            $(".tips4").css("color", "red");
            $("button").attr("disabled", "disabled");
            return false;
        } else {
            $(".tips4").html("");
            $("button").removeAttr("disabled");
            return ture;
        }
    });
});