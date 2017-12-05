package org.apache.jsp.WEB_002dINF.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class aindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/public/head.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n<html>\n<head>\n\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n<title>易购商城</title>\n<!-- 下面是前端页面的样式 -->\n<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/public.css\" />\n<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\n<!-- 下面是easyui的环境 -->\n<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.5/themes/icon.css\" type=\"text/css\"></link>\n<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.5/themes/default/easyui.css\" type=\"text/css\"></link>\n<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.5/jquery.min.js\"></script>\n<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.5/jquery.easyui.min.js\"></script>\n<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.5/locale/easyui-lang-zh_CN.js\"></script>\n");
      out.write("\n\t<style type=\"text/css\">\n\t\t#menu {\n\t\t\twidth:60px;\n\t\t\t/*border:1px solid red;*/\n\t\t}\n\t\t#menu ul {\n\t\t\tlist-style: none;\n\t\t\tpadding: 0px;\n\t\t\tmargin: 0px;\n\t\t}\n\t\t#menu ul li {\n\t\t\tborder-bottom: 1px solid #fff;\n\t\t\t\n\t\t}\n\t\t#menu ul li a {\n\t\t\t/*先将a标签转换为块级元素，才能设置宽和内间距*/\n\t\t\tdisplay: block;\n\t\t\tbackground-color: #00a6ac;\n\t\t\tcolor: #fff;\n\t\t\tpadding: 5px;\n\t\t\ttext-decoration: none;\n\t\t}\n\t\t#menu ul li a:hover {\n\t\t\tbackground-color: #008792;\n\t\t}\n\t\t\n\t</style>\n\t\n\t<script type=\"text/javascript\">\n\t\t$(function(){\n\t\t\t$(\"a[title]\").click(function(){\n\t\t\t\tvar text = $(this).text();\n\t\t\t\tvar href = $(this).attr(\"title\");\n\t\t\t\t//判断当前右边是否已有相应的tab\n\t\t\t\tif($(\"#tt\").tabs(\"exists\", text)) {\n\t\t\t\t\t$(\"#tt\").tabs(\"select\", text);\n\t\t\t\t} else {\n\t\t\t\t\t//如果没有则创建一个新的tab，否则切换到当前tag\n\t\t\t\t\t$(\"#tt\").tabs(\"add\",{\n\t\t\t\t\t\ttitle:text,\n\t\t\t\t\t\tclosable:true,\n\t\t\t\t\t\tcontent:'<iframe title=' + text + ' src=' + href + ' frameborder=\"0\" width=\"100%\" height=\"100%\" />'\n\t\t\t\t\t});\n\t\t\t\t}\n\t\t\t\t\n\t\t\t});\n\t\t});\n\t</script>\n</head>\n\n\t<body class=\"easyui-layout\">\n\t    <div data-options=\"region:'north',title:'欢迎来到易购后台管理',split:true\" style=\"height:100px;\"></div>   \n");
      out.write("\t    <div data-options=\"region:'west',title:'系统操作',split:true\" style=\"width:200px;\">\n\t    \t<!-- 此处显示的是系统菜单 -->\n\t    \t<div id=\"menu\" class=\"easyui-accordion\" data-options=\"fit:true\">   \n    \t\t\t<div title=\"基本操作\">   \n        \t\t\t<ul>\n\t\t\t\t\t\t<li><a href=\"#\" title=\"send_category_query.action\">类别管理</a>\n\t\t\t\t\t\t<li><a href=\"#\" title=\"send_product_query.action\">商品管理</a>\n\t\t\t\t\t</ul>\n    \t\t\t</div>   \n    \t\t\t<div title=\"销售管理\">\n    \t\t\t\t<ul>\n\t\t\t\t\t\t<li><a href=\"#\" title=\"send_sale_sale.action\">销售管理</a>\n\t\t\t\t\t</ul>\n    \t\t\t</div>   \n\t\t\t</div>   \n\t    </div>   \n\t    <div data-options=\"region:'center',title:'后台操作页面'\" style=\"padding:1px;background:#eee;\">\n\t    \t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\">   \n    \t\t\t<div title=\"系统缺省页面\" style=\"padding:10px;\">\n    \t\t\t\t此处以后显示相应的系统信息（当前操作系统的类型，当前项目的域名，硬件的相关配置或者显示报表\n    \t\t\t</div>   \n    \t\t\t\n    \t\t</div>      \t\t    \t\n\t    </div> \n\t    <div id=\"win\" data-options=\"collapsible:false,minimizable:false,maximizable:false,modal:true\"></div>  \n\t</body>  \n\n</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /public/head.jspf(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /public/head.jspf(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("shop");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
