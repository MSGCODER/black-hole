//定义全局变量来存储cookie的值
var cookieValue = "";
function loadProperties(code){
    if(code==''||code==null){
        console.log(code);
        code ='zn-CN';
    }
    //如果是英文，将其导航栏的中文隐藏
    if(code=='en-US'){
        hiddenChineseNav();
    }
    jQuery.i18n.properties({
        name:'strings',
        path:'/i18n/',
        mode:'map',
        cache:true,
        language:code,
        callback: function() {// 加载成功后设置显示内容
            for(var key in $.i18n.map){
                $('.'+key).html($.i18n.prop(key));
            }
            $.cookie("cheling_lang",code,{path:'/',expires:30});
        }
    });
}
    //读取cookie的值
    function readCookie(codeCookie)
    {

        var search =codeCookie+"=";
        if(document.cookie.length > 0)
        {
            var  offset = document.cookie.indexOf(search);
            if (offset != -1)
            {
                offset += search.length;
                var  end = document.cookie.indexOf(";", offset);
                if (end == -1) end = document.cookie.length;
                cookieValue = (document.cookie.substring(offset, end))
            }
        }
        return cookieValue;
    }
    //根据cookie的值来找相对应的item
    function findCodeName(){
        var codeName="";
        if(cookieValue=="en-US"){
            codeName="English";
        }
        if(cookieValue=="zn-CN"){
            codeName="简体中文";
        }
        if(cookieValue=="zn-TW"){
            codeName="繁体中文";
        }

        return codeName;
    }
    //读取用户选择
    function defaultChoose(){
    var codeName = findCodeName();
    var SelectObj = document.getElementById("conversionCode");
    if(SelectObj != null){
        for(var i=0; i<SelectObj.options.length; i++){
            console.log(SelectObj.options[i].innerHTML);
            if(SelectObj.options[i].innerHTML == codeName){
                SelectObj.options[i].selected = true;
                break;
            }
        }
    }
}
function chooseConversionCode(){
    var SelectObj = document.getElementById("conversionCode");
    var code = SelectObj.value;
    loadProperties(code);
}

//获取cookie以及多语言
function getGlobal() {
    cookieValue = readCookie("cheling_lang");
    loadProperties(cookieValue);
    defaultChoose();
}

function getTabGlobal(active) {
    var tabObject = $('.tabGlabal');
    for (var i = 0; i < tabObject.length; i++) {
        tabObject[i].setAttribute('class', 'text_' + active + '_tab' + i);
    }
}

function getNavGlobal() {
    var navObjects = $('.global_nav');
    for (var i = 0; i < navObjects.length; i++) {
        navObjects[i].setAttribute('class', 'text_nav' + i);
    }
}

//如果选择英文，隐藏中文导航栏
function hiddenChineseNav(){

}