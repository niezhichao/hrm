var AppConf={
    resourceRoot:"../resource/",
    cssRoot:"../css/",
    jsRoot:"../js/",
    common:"../common/"
}

/*获取页面名称*/
function getPageName() {
    var url=location.href;
    var arr=url.split("/");
    var nameHasSuffix=arr[arr.length-1];
    var name=nameHasSuffix.substring(0,nameHasSuffix.indexOf("."));
    return name;
}

function loadCss(path) {
    document.write('<link rel="stylesheet" type="text/css" href="'+path+'" />');
}

function loadJs(path) {
    document.write('<script src="'+path+'"></script>');
}

loadJs(AppConf.resourceRoot+"jquery/jquery-3.3.1.js");
loadJs(AppConf.resourceRoot+"jquery/jquery-ui-1.12.1.custom/jquery-ui.js");
loadJs(AppConf.jsRoot+getPageName()+".js");
loadCss(AppConf.cssRoot+getPageName()+".css");
loadCss(AppConf.resourceRoot+"jquery/jquery-ui-1.12.1.custom/jquery-ui.css");


