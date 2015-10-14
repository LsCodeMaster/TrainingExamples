package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fclass_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("  \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\tmedia=\"screen\">\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./bootstrap/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"jambotrom\">\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"navbar navbar-default navbar-fixed-top navbar-inverse\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/EventManagement/home\" class=\"navbar-brand\">Event Management</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"collpase navbar-collapse\" id=\"example\">\r\n");
      out.write("\t\t\t\t\t<form action=\"signUp\" class=\"navbar-form navbar-right\"\r\n");
      out.write("\t\t\t\t\t\trole=\"signup\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success btn-lg\">Sign\r\n");
      out.write("\t\t\t\t\t\t\tUp</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"jumbotron\">\r\n");
      out.write("\t\t\t<div class=\"container\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div class=\"container col-md-4 col-lg-4 col-xs-offset-4 well\"\r\n");
      out.write("\t\t\tstyle=\"margin-top: 8%\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<footer></footer>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/index.jsp(43,3) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", new String("form-signin"));
    // /WEB-INF/views/index.jsp(43,3) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("/EventManagement/verify");
    // /WEB-INF/views/index.jsp(43,3) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/views/index.jsp(43,3) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("command");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<h2 class=\"form-signin-heading\">Sign In</h2>\r\n");
          out.write("\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t<h4 class=\"form-signin-heading form-inline\">User Name</h4>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t<h4 class=\"form-signin-heading\">Password</h4>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005fpassword_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign\r\n");
          out.write("\t\t\t\t\t\tIn</button>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<!-- <div class=\"form-group\" style=\"text-align: center;\">\r\n");
          out.write("\t\t\t\t\t<a href=\"\">Forget password</a>\r\n");
          out.write("\t\t\t\t</div> -->\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/index.jsp(48,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("username");
    // /WEB-INF/views/index.jsp(48,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/index.jsp(48,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("User Name "));
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_form_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/index.jsp(52,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setPath("password");
    // /WEB-INF/views/index.jsp(52,5) null
    _jspx_th_form_005fpassword_005f0.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/index.jsp(52,5) null
    _jspx_th_form_005fpassword_005f0.setDynamicAttribute(null, "placeholder", new String("Password"));
    int[] _jspx_push_body_count_form_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fpassword_005f0 = _jspx_th_form_005fpassword_005f0.doStartTag();
      if (_jspx_th_form_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005fpassword_005f0);
    }
    return false;
  }
}
