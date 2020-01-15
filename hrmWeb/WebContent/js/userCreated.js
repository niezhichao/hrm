$(function () {
    $("button[type='submit']").click(function (e) {
        var formData={};
        formData.username=$("input[name='username']").val();
        formData.loginName=$("input[name='loginName']").val();
        formData.status=$("input[name='status']").val();
        formData.password=$("input[name='password']").val();
        $.ajax({
            type:"post",
            url:'http://127.0.0.1:8090'+reqUrl.createUserUrl,
            data:JSON.stringify(formData),
            dataType:"json",
            /*headers	:{'Content-Type': 'application/json'},*/
            contentType:"application/json",
            async:true,
            success:function (data) {
                var dialogOpts={
                    modal:true,
                    title:"提示信息",
                    open:function () {
                        $("#promptMsg").text(data.msg);
                        $("#promptIcon").attr("class","ui-icon ui-icon-circle-check");
                    },
                    buttons:{
                        "确认":function () {
                            $(this).dialog("close");
                        }
                    }
                }
                $("#promptContent").dialog(dialogOpts);
            },
            error:function () {

            }
        });
        return false;
    });
});