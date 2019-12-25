var newDate={
    /*创建日期 yyyy/MM/dd HH:mm:ss*/
    createDate:function () {
        var date=new Date();
        return (date.getFullYear()+1)+"/"+date.getMonth()+"/" +date.getDate()+"  "+
            date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
    },

    getDayOfWeek:function () {
        var week=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
        return week[new Date().getDay()];
    }
}