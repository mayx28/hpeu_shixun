window.onload = function() {
    var formElements = document.getElementsByTagName("form")[0].elements;

    for (var i = 0; i < formElements.length; i++) {
        formElements[i].oninput = function(event) {
            event.target.setCustomValidity("");
        }
    }
}

function checkInput(form) {
    var formElements = form.elements;
    var password = formElements.password;
    var confirmPassword = formElements.confirmpassword;

    if (password.value != confirmPassword.value) {
        confirmPassword.setCustomValidity("确认密码与登录密码必须相同！！！");
        return false;
    }

    alert("注册成功~~~");
    return true;
}