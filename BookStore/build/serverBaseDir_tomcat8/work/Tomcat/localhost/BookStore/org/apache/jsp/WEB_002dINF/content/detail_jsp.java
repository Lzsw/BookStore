/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-20 09:15:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/.gradle/caches/modules-2/files-2.1/taglibs/standard/1.1.2/a17e8a4d9a1f7fcc5eed606721c9ed6b7f18acf7/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1500193669971L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<title>书本详情</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/orange.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/skeleton.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/ddsmoothmenu.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/elastislide.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/home_flexslider.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/light_box.css\"/>\r\n");
      out.write("<link href=\"css/style2.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"mainContainer sixteen container\">\r\n");
      out.write("<!--Header Block-->\r\n");
      out.write("<div >\r\n");
      out.write("<a href=\"index\">主页</a> <a href=\"main\">首页</a> <a href=\"qinggan\">情感类</a> <a href=\"encouragement\">励志类</a> <a href=\"reasoning\">推理类</a> <a href=\"novel\">长篇小说类</a> <a href=\"wishlist\">收藏夹</a> <a href=\"cart \">购物车</a>           \r\n");
      out.write("</div>\r\n");
      out.write("<!--Content Block-->\r\n");
      out.write("<section class=\"content-wrapper\">\r\n");
      out.write("\t<div class=\"content-container container\">\r\n");
      out.write("\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t<div class=\"product-info-box\">\r\n");
      out.write("\t\t\t\t<div class=\"product-essential\">\r\n");
      out.write("\t\t\t\t\t<div class=\"product-img-box\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"product-image-zoom\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  alt=\"Image\" title=\"Image\" />\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t<ul >\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.picture}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"product-shop\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"product-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"price-box\">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"price\">作者：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"price\">价格：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("                \t\t<span class=\"price\">出版社：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.publication}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                \t\t</br>\r\n");
      out.write("                \t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"price\">出版时间：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.publicationdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"model-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>书本编号： </span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.book_sn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>种类编号： </span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.category_sn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"first-review\">\r\n");
      out.write("\t\t\t\t\t\t\tThis is a good book！\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"add-to-cart-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"qty-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"qty\">数量:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"1\"  id=\"qty\" class=\"input-text qty\" name=\"qty\">\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("                           \r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"form-button\" title=\"Add to Cart\"><span>Add to Cart</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"add-to-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"Add to Wishlist\" class=\"add-wishlist\">Add to Wishlist</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("    </session>\r\n");
      out.write("\t\t\t<section class=\"product-collateral\">\r\n");
      out.write("            \t\r\n");
      out.write("\t\t\t\t<ul class=\"tab-block\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#pro-detail\" title=\"Description\" class=\"active\">Remark</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div id=\"pro-detail\" class=\"pro-detail commonContent\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.remark}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<script src=\"js/jquery-1.8.3.min.js\" type=\"text/JavaScript\"></script>\r\n");
      out.write("<script src=\"js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("<script src=\"js/common.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script src=\"js/ddsmoothmenu.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.elastislide.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.jcarousel.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.accordion.js\"></script>\r\n");
      out.write("<script src=\"js/light_box.js\"></script>\t\r\n");
      out.write("<script src=\"js/html5.js\"></script>\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}