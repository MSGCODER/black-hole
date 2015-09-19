(function() {
var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['nav'] = template({"1":function(container,depth0,helpers,partials,data) {
    var stack1;

  return ((stack1 = helpers["if"].call(depth0,(depth0 != null ? depth0.active : depth0),{"name":"if","hash":{},"fn":container.program(2, data, 0),"inverse":container.program(4, data, 0),"data":data})) != null ? stack1 : "");
},"2":function(container,depth0,helpers,partials,data) {
    var helper, alias1=helpers.helperMissing, alias2="function", alias3=container.escapeExpression;

  return "		<div class=\"menu\">\n        	<a href=\"javascript:void(0)\">\n        	    <ul class=\"active\">\n        			<li class=\"font1 global_nav global_hidden_CN\" style=\"color:#FFFFFF;\">"
    + alias3(((helper = (helper = helpers.cname || (depth0 != null ? depth0.cname : depth0)) != null ? helper : alias1),(typeof helper === alias2 ? helper.call(depth0,{"name":"cname","hash":{},"data":data}) : helper)))
    + "</li>\n        			<li class=\"font2 global_english_style\" style=\"color:#FFFFFF;\"><font size=\"2\">e</font>"
    + alias3(((helper = (helper = helpers.ename || (depth0 != null ? depth0.ename : depth0)) != null ? helper : alias1),(typeof helper === alias2 ? helper.call(depth0,{"name":"ename","hash":{},"data":data}) : helper)))
    + "</li>\n        		</ul>\n        	</a>\n        </div>\n";
},"4":function(container,depth0,helpers,partials,data) {
    var helper, alias1=helpers.helperMissing, alias2="function", alias3=container.escapeExpression;

  return "		<div class=\"menu\">\n			<a href=\""
    + alias3(((helper = (helper = helpers.url || (depth0 != null ? depth0.url : depth0)) != null ? helper : alias1),(typeof helper === alias2 ? helper.call(depth0,{"name":"url","hash":{},"data":data}) : helper)))
    + "\">\n			    <ul>\n					<li class=\"font1 global_nav global_hidden_CN\">"
    + alias3(((helper = (helper = helpers.cname || (depth0 != null ? depth0.cname : depth0)) != null ? helper : alias1),(typeof helper === alias2 ? helper.call(depth0,{"name":"cname","hash":{},"data":data}) : helper)))
    + "</li>\n					<li class=\"font2 global_english_style\"><font size=\"2\">e</font>"
    + alias3(((helper = (helper = helpers.ename || (depth0 != null ? depth0.ename : depth0)) != null ? helper : alias1),(typeof helper === alias2 ? helper.call(depth0,{"name":"ename","hash":{},"data":data}) : helper)))
    + "</li>\n				</ul>\n			</a>\n		</div>\n";
},"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    var stack1;

  return "<div class=\"logo\">\n    <a href=\"/\">\n        <img src=\"../img/e_boss/logo.png\" />\n    </a>\n</div>\n<div class=\"nav1\">\n"
    + ((stack1 = helpers.each.call(depth0,depth0,{"name":"each","hash":{},"fn":container.program(1, data, 0),"inverse":container.noop,"data":data})) != null ? stack1 : "")
    + "</div>\n<div  class=\"select_box\">\n    <select  id=\"conversionCode\" onchange=\"chooseConversionCode()\">\n        <option class=\"selected\" value='zn-CN'>简体中文</option>\n        <option value='zn-TW'>繁体中文</option>\n        <option value='en-US'>English</option>\n    </select>\n</div>";
},"useData":true});
}());