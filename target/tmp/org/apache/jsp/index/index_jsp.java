/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.22.v20191022
 * Generated at: 2019-12-10 12:39:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>MyBank </title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <style>\n");
      out.write("        .slidecontainer {\n");
      out.write("            width: 60%;\n");
      out.write("            margin-left: 20%;\n");
      out.write("            margin-top: 5%;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .slider {\n");
      out.write("            -webkit-appearance: none;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background: #d3d3d3;\n");
      out.write("            outline: none;\n");
      out.write("            opacity: 0.7;\n");
      out.write("            -webkit-transition: .2s;\n");
      out.write("            transition: opacity .2s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .slider:hover {\n");
      out.write("            opacity: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .slider::-webkit-slider-thumb {\n");
      out.write("            -webkit-appearance: none;\n");
      out.write("            appearance: none;\n");
      out.write("            width: 25px;\n");
      out.write("            height: 25px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            background: #4CAF50;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .slider::-moz-range-thumb {\n");
      out.write("            width: 25px;\n");
      out.write("            height: 25px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            background: #4CAF50;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .value{\n");
      out.write("            margin-left: 45%;\n");
      out.write("        }\n");
      out.write("        .left{\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .right{\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .values{\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>Credit calculator</h1>\n");
      out.write("\n");
      out.write("<form action = \"/\" method=\"get\">\n");
      out.write("<div class=\"slidecontainer\">\n");
      out.write("    <p class = \"values\">\n");
      out.write("        <span class = \"left\">");
 Object minSum = request.getAttribute("minSum");
        out.print(minSum);
      out.write("</span>\n");
      out.write("        <span class= =\"right\">");
 Object maxSum = request.getAttribute("maxSum");
        out.print(maxSum);
      out.write("</span>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    ");
 Object sum = request.getAttribute("sum");
      out.write("\n");
      out.write("<input name=\"sum\" type=\"range\" step=\"1000\" min=");
      out.print(minSum);
      out.write(" max=");
      out.print(maxSum);
      out.write(" value=");
      out.print(sum);
      out.write(" class=\"slider\" id=\"myRange\">\n");
      out.write("<p class=\"value\"><span id=\"demo\"></span></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"slidecontainer\">\n");
      out.write("\n");
      out.write("    <span class = \"left\"> ");
 Object minTime = request.getAttribute("minTime");
        out.print(minTime);
    
      out.write("\n");
      out.write("    </span> <span class = \"right\"> ");
 Object maxTime = request.getAttribute("maxTime");
    out.print(maxTime);

      out.write("\n");
      out.write("    ");
 Object time = request.getAttribute("time");
      out.write("\n");
      out.write("</span><input name=\"time\" type=\"range\" min=");
      out.print( minTime);
      out.write(" max=");
      out.print( maxTime);
      out.write(" value=");
      out.print(time);
      out.write(" class=\"slider\" id=\"myRange1\">\n");
      out.write("    <p class=\"value\"><span id=\"demo1\"></span></p>\n");
      out.write("</div>\n");
      out.write("    <input type=\"submit\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    var slider = document.getElementById(\"myRange\");\n");
      out.write("    var output = document.getElementById(\"demo\");\n");
      out.write("    output.innerHTML = slider.value;\n");
      out.write("\n");
      out.write("    slider.oninput = function() {\n");
      out.write("        output.innerHTML = this.value;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    var slider1 = document.getElementById(\"myRange1\");\n");
      out.write("    var output1 = document.getElementById(\"demo1\");\n");
      out.write("    output1.innerHTML = slider1.value;\n");
      out.write("\n");
      out.write("    slider1.oninput = function() {\n");
      out.write("        output1.innerHTML = this.value;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
