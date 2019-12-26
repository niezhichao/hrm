/*创建日期*/
var newDate={
    /*创建日期 yyyy/MM/dd HH:mm:ss*/
    createDate:function () {
        var date=new Date();
        return (date.getFullYear()+1)+"/"+swith(date.getMonth())+"/" +swith(date.getDate())+"  "+
            swith(date.getHours())+":"+swith(date.getMinutes())+":"+swith(date.getSeconds());
    },

    getDayOfWeek:function () {
        var week=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
        return week[new Date().getDay()];
    }
}

/*将日期的个位数切换为0开头的两位数*/
function swith(num) {
   return (num<10)?("0"+num):num;
}