package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./bootstrap/css/bootstrap-theme.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./Style/simple-sidebar.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".navbar {\r\n");
      out.write("\t-webkit-box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.4);\r\n");
      out.write("\t-moz-box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.4);\r\n");
      out.write("\tbox-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.4);\r\n");
      out.write("\tborder: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tmargin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(\"./bootstrap/Images/wood_back.jpg\");\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"navbar navbar-default navbar-fixed-top navbar-fixed-top navbar-inverse\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/EventManagement/home\" class=\"navbar-brand\">Event Management</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"/EventManagement/redirect\" class=\"navbar-brand\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logsesh}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"collpase navbar-collapse\" id=\"example\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/EventManagement/redirect\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/EventManagement/addEvent\">Add Event</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/EventManagement/invalidate\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-in\"></span> Sign Out</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div style=\"margin-top: 65px\" class=\"col-lg-3 \">\r\n");
      out.write("\t\t<h1 style=\"text-align: center;\">Upcoming\r\n");
      out.write("\t\t\tEvents</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"\" method=\"post\">\r\n");
      out.write("\t<div class=\"jumbotron col-lg-8 col-lg-offset-2 form-group\"\r\n");
      out.write("\t\tstyle=\"border-radius: 15px; padding: 2px\">\r\n");
      out.write("\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t<h2 style=\"text-align: center;\">Events</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t<h2 style=\"text-align: center;\">Date</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t<h2 style=\"text-align: center;\">Venue</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"./bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/Dashboard.jsp(77,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /WEB-INF/views/Dashboard.jsp(77,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${eventlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<div class=\"jumbotron col-lg-8 col-lg-offset-2 form-group\"\r\n");
          out.write("\t\tstyle=\"border-radius: 15px; padding: 3px\">\r\n");
          out.write("\t\t<div class=\"col-xs-4\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t\t<h5 style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </h5>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t</div>\t\r\n");
          out.write("\t<div class=\"col-xs-4\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t\t<h5 style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.eventdate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </h5>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t</div>\r\n");
          out.write("\t<div class=\"col-xs-4\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t\t<h5 style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.venue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </h5>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t</div>\t\r\n");
          out.write("\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
