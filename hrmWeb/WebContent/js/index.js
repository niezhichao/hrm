$(function () {


    //手动调用切换到要显示的tab页,当前的action只支持show
    //eg:$("#tab-0 a[data-toggle='tab']").tab("show");
    $.fn.tab = function (action) {
        if ("show" == action) {
            this.parent().click();
        }
    }

    /*获取二级菜单的a标签数组*/
    var pageContents = $(".menuUlLv2 li a");
    pageContents.each(function () {
        /*二级菜单绑定click事件*/
        $(this).click(function () {
            var linkId=this.getAttribute("id");
            var url=linkId+".html";
            var text=$(this).text();
            addTabLabel(linkId, text, url, null);
        });
    });
});

/*
  id:       tab页签的html标签ID属性格式为"tab-"+id，内容容器的html标签ID格式为"tab-content-"+id
  text:     tab页签的显示文本
  url:      打开的iframe的url
  innerTab: 是否是内部弹出页（打开的tab页触发添加新的tab页），默认为undefined/false
  */
function addTabLabel(id, text, url, innerTab) {
    var pageCounter = 0;

    //如果某个页面已经打开，则切换到该页显示即可，不会新添加tab页
    if ($('#tabList #tab_' + id).length > 0) {
        $('#tabList #tab_' + id + ' a').tab('show');
    } else {
        /*tab标签和子页面iframe的id*/
        var tab_id = "tab_" + id, tabContent_id = "tabContent_" + id;

        //添加tab标签
        $('#tabList li').removeClass('active');
        var tabHTML = "<li id='" + tab_id + "' class='active'><a data-toggle='tab' href='#" + tabContent_id + "'>" + text + "</a>" +
            "<i class='fa fa-times' onclick='deleteTab(\"" + id + "\")'></i></li>";
        $('#tabList').append(tabHTML);

        //添加新的内容显示
        $(".pageContent div").removeClass("active");
        var pageContentHTML = "<div id='" + tabContent_id + "' class='active'>"
            + "<iframe id='iframePage" + (pageCounter++) + "' src='" + url + "'></iframe>" + "</div>";
        $(".pageContent").append(pageContentHTML);

    }

}

/*
 刷新页签切换历史
 isdelete: 是否是删除tab页签,true:是，false：否
 curTabId：要处理的tab页签的id,tab页签html标签元素的ID属性格式为"tab-"+curTabId
 */
function refreshTabHistory(isdelete,curTabId) {


}