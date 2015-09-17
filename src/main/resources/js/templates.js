/**
 * 导航文本内容及链接
 * @type {Array}
 */
var cname = new Array("逸酷", "奕阁", "奕胜", "易捷", "益众");
var ename = new Array("COOL", "BOSS", "GLORY", "CROSS", "ZONE");
var url = new Array("ecool", "eboss", "eglory", "ecross", "ezone");

/**
 * tab文本内容及链接,因产品宣传点不同,故tab个数和内容不同
 * @type {Array}
 */
var eboss_tab_texts = new Array("动力 & 续航", "外观 & 内饰", "极致安全", "车联网 & 服务", "无忧服务", "配置参数");
var ecool_tab_texts = new Array("动力 & 续航", "外观 & 内饰", "安全 & 操控", "车联网 & 服务", "充电方式", "配置参数");
//var eglory_tab_texts = new Array("动力 & 续航", "外观 & 内饰", "极致安全", "造型风格", "车联网 & 服务", "无忧服务", "配置参数");
var eglory_tab_texts = new Array("动力 & 续航", "外观 & 内饰", "极致安全", "车联网 & 服务", "无忧服务", "配置参数");
var ecross_tab_texts = new Array("动力 & 续航", "产品亮点", "安全 & 操控", "车联网 & 服务", "无忧服务", "配置参数");
var ezone_tab_texts = new Array("动力 & 续航", "外观 & 内饰", "安全责任", "车联网 & 服务", "整车技术", "人性配置", "配置参数");

/**
 * 根据页面参数不同,获取导航json数据
 * @param active
 * @returns {Object}
 */
function getNavData(active) {
    result = "[";
    for (var i = 0; i < cname.length; i++) {
        var temp = "";
        temp = "{'cname':'" + cname[i] + "',";
        temp += "'ename':'" + ename[i] + "',";
        if (url[i] == active) {
            temp += "'url':'" + url[i] + "',";
            temp += "'active':" + true + "}";
        } else {
            temp += "'url':'" + url[i] + "'}";
        }
        if (i == (cname.length - 1)) {
            result += temp + "]";
        } else {
            result += temp + ",";
        }
    }
    ;
    return eval('(' + result + ')');
}

/**
 * 根据产品页面不同,获取不同tab的json数据
 * @param active
 */
function getTabData(active) {
    var result = "{'tabs': [";
    var end_seven = "], 'count': 7}";
    var end_six = "], 'count': 6}";
    if (active == "eboss") {
        for (var i = 0; i < eboss_tab_texts.length; i++) {
            result += "{'text':'" + eboss_tab_texts[i] + "','url':'tab" + i + "'}";
            if (i != (eboss_tab_texts.length - 1)) {
                result += ",";
            }
        }
        if (eboss_tab_texts.length == 7) {
            result += end_seven;
        } else {
            result += end_six;
        }
    } else if (active == "ecool") {
        for (var i = 0; i < ecool_tab_texts.length; i++) {
            result += "{'text':'" + ecool_tab_texts[i] + "','url':'tab" + i + "'}";
            if (i != (ecool_tab_texts.length - 1)) {
                result += ",";
            }
        }
        if (ecool_tab_texts.length == 7) {
            result += end_seven;
        } else {
            result += end_six;
        }

    } else if (active == "eglory") {
        for (var i = 0; i < eglory_tab_texts.length; i++) {
            result += "{'text':'" + eglory_tab_texts[i] + "','url':'tab" + i + "'}";
            if (i != (eglory_tab_texts.length - 1)) {
                result += ",";
            }
        }
        if (eglory_tab_texts.length == 7) {
            result += end_seven;
        } else {
            result += end_six;
        }
    } else if (active == "emax") {
        for (var i = 0; i < emax_tab_texts.length; i++) {
            result += "{'text':'" + emax_tab_texts[i] + "','url':'tab" + i + "'}";
            if (i != (emax_tab_texts.length - 1)) {
                result += ",";
            }
        }
        if (emax_tab_texts.length == 7) {
            result += end_seven;
        } else {
            result += end_six;
        }
    } else if (active == "ecross") {
        for (var i = 0; i < ecross_tab_texts.length; i++) {
            result += "{'text':'" + ecross_tab_texts[i] + "','url':'tab" + i + "'}";
            if (i != (ecross_tab_texts.length - 1)) {
                result += ",";
            }
        }
        if (ecross_tab_texts.length == 7) {
            result += end_seven;
        } else {
            result += end_six;
        }
    } else {
        for (var i = 0; i < ezone_tab_texts.length; i++) {
            result += "{'text':'" + ezone_tab_texts[i] + "','url':'tab" + i + "'}";
            if (i != (ezone_tab_texts.length - 1)) {
                result += ",";
            }
        }
        if (ezone_tab_texts.length == 7) {
            result += end_seven;
        } else {
            result += end_six;
        }
    }
    return eval('(' + result + ')');
}

/**
 * 根据产品名称获取该产品页tab个数
 * @param active 产品名称
 * @returns {*} tab数量
 */
function getTabNum(active) {
    if (active == "eboss") {
        return eboss_tab_texts.length;
    } else if (active == "ecool") {
        return ecool_tab_texts.length;
    } else if (active == "eglory") {
        return eglory_tab_texts.length;
    } else if (active == "emax") {
        return emax_tab_texts.length;
    } else if (active == "ecross") {
        return ecross_tab_texts.length;
    } else if (active == "ezone") {
        return ezone_tab_texts.length;
    } else {
        return 0;
    }
}

/**
 * 根据产品名称获取stickUp的parts参数
 * @param active 产品名称
 */
function getStickParts(active) {
    var length = getTabNum(active);
    var result = "{";
    for (var i = 0; i < length; i++) {
        result += i + ":'tab" + i + "',";
    }
    result += "}";
    return eval('(' + result + ')');
}

/**
 * tab悬停
 */
function stickUpTab(active) {
    jQuery(function ($) {
        $(document).ready(function () {
            $('#tab').stickUp({
                parts: getStickParts(active),
                itemClass: 'bodright',
                itemHover: 'line-btn-active'
            });
            $('.bodright div span a').click(function (event) {
                var title = this.title;
                var target = '#' + title;
                $("html,body").animate({
                    scrollTop: $(target).offset().top - 100
                }, 500);

                removeActive($(this).parent().parent().parent());
                $(this).parent().parent().parent().addClass('line-btn-active');
            });
        });
    });
}

/**
 * 移除nav下所有line-btn-active样式
 * @param node 传入节点
 */
function removeActive(node) {
    $('.bodright').each(function () {
        $(this).removeClass('line-btn-active');
    });
}

/**
 * 注册一个比较大的helper,判断不同tab个数采用不同模板
 */
Handlebars.registerHelper("num", function (v1, options) {
    if (v1 == 7) {
        // 满足条件继续执行模板
        return options.fn(this);
    } else {
        // 不满足条件执行else部分的模板
        return options.inverse(this);
    }
});


/**
 * 初始化模板
 * @param active 当前产品页面名称
 */
function initTemplates(active) {

    // 引入导航模板
    var navData = getNavData(active);
    $('#nav').html(Handlebars.templates.nav(navData));

    // 引入footer模板
    $('#footer').html(Handlebars.templates.footer());

    // 引入tab模板
    var tabData = getTabData(active);
    $("#tab").html(Handlebars.templates.tab(tabData));

    // tab悬停
    stickUpTab(active);

    // 监听content_main宽度,保证tab与其宽度一致
    contentWidthListner();

}

/**
 * 初始化footer模板
 */
function initFooter() {
    // 引入footer模板
    $('#footer').html(Handlebars.templates.footer());
}

/**
 * 监听content的宽度,并随时保证tab框与其宽度相等
 */
function contentWidthListner() {
    var content_main_width = $('#content_main').width();
    $('#tab').css('width', content_main_width);
    $(window).resize(function () {
        var content_main_now_width = $('#content_main').width();
        $('#tab').css('width', content_main_now_width);
    });
}



