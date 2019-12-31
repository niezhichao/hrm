$(function () {

    $("button[type='submit']").click(function () {
        var formData={};
        formData.username=$("input[name='username']").val();
        formData.loginName=$("input[name='loginName']").val();
        formData.status=$("input[name='status']").val();
        formData.password=$("input[name='password']").val();
        console.log(formData);
        debugger;
        $.ajax({
            type:"post",
            url:'http://127.0.0.1:8090'+reqUrl.createUserUrl,
            data:JSON.stringify(formData),
            headers	:{'Content-Type': 'application/json'},
            success:function (data) {
                console.log(data);
            },
            error:function () {

            }
        });
    });
});