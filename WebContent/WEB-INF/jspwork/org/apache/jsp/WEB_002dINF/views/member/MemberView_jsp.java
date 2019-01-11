/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-11 08:03:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.kh.member.model.vo.*;

public final class MemberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1547192111632L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("com.kh.member.model.vo");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");

	Member memberLoggedIn = (Member)session.getAttribute("memberLoggedIn");  


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/header.css\">\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo(favicon).png\" type=\"image/png\" sizes=\"128x128\">\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#logged-in{\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright: 0px;\r\n");
      out.write("\ttop: 5px;\t\t\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("  <nav class=\"header\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo.png\" width=\"50px\" height=\"50px\" >\r\n");
      out.write("      <span class=\"logofont\">7' Scheduler\r\n");
      out.write("      </span>\r\n");
      out.write("    </div>  \r\n");
      out.write("   ");
if(memberLoggedIn != null){ 
      out.write("\r\n");
      out.write("  <table id=\"logged-in\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t ");
      out.print(memberLoggedIn.getMemberName() );
      out.write("님,\t안녕하세요 :)\t\t \r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"내정보\" onclick='location.href=\"");
      out.print(request.getContextPath());
      out.write("/member/MemberView?memberId=");
      out.print(memberLoggedIn.getMemberId());
      out.write("\";'/>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"로그아웃\" onclick=\"logout();\"/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\t\r\n");
      out.write("\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </nav>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("$(\".logo\").click(function(){\r\n");
      out.write("\tlocation.href = \"");
      out.print(request.getContextPath() );
      out.write("\";\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function logout(){\r\n");
      out.write("\tlocation.href = \"");
      out.print(request.getContextPath() );
      out.write("/member/logout\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

         Member m = (Member)request.getAttribute("member");
         
		 String memberId_ = m.getMemberId();
		 String memberPwd = m.getMemberPwd();
		 String memberName = m.getMemberName();
		 int memberDate = m.getMemberAge();
		 String memberemail = m.getMemberEmail();
		 String gender = m.getMemberGender();






      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write(" <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write(" <!-- 폰트추가(폼상단) -->\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css?family=Fredericka+the+Great%7C Rochester| Alfa+Slab+One| Staatliches| Noto+Sans+KR| Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write(" <!-- 파비콘 적용링크 -->\r\n");
      out.write(" <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo(favicon).png\" type=\"image/png\" sizes=\"128x128\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/memberView.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/side.css\">\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css?family=Sunflower:300\" rel=\"stylesheet\">\r\n");
      out.write(" <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" <title>7 Scheduler(MemberView)</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write(" \r\n");
      out.write(" <div class=\"content\">\r\n");
      out.write("   <section>\r\n");
      out.write("   <h2>내 정보</h2>\r\n");
      out.write("   <form class=\"updateFrm\" action=\"");
      out.print(request.getContextPath());
      out.write("/member/memberUpdateEnd\"\r\n");
      out.write("\t  method=\"post\"\r\n");
      out.write("\t  name=\"memberUpdateform\"\r\n");
      out.write("\t  onsubmit=\"return saveMember();\">\r\n");
      out.write("\t\r\n");
      out.write("       <div class=\"update_box\">\r\n");
      out.write("           <span>7's Scheduler 회원 정보</span>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("         \t<label for=\"memberId\">아이디:</label>\r\n");
      out.write("           <input type=\"text\" name=\"memberId\" id=\"memberId_\"  value=\"");
      out.print(memberId_);
      out.write("\" required readonly />\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("             <label for=\"memberName\">이름:</label>\r\n");
      out.write("             <input type=\"text\" name=\"memberName\" id=\"memberName\"  value=\"");
      out.print(memberName );
      out.write("\" required  />\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <label for=\"memberEmail\">이 메일:</label>\r\n");
      out.write("           <input type=\"email\" name=\"memberEmail\" id=\"memberEmail\" value=\"");
      out.print(memberemail);
      out.write("\" />\r\n");
      out.write("           &nbsp;&nbsp;\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <label for=\"memberDate\">생년 월일:</label>\r\n");
      out.write("           <input type=\"number\" name=\"memberDate\" id=\"memberDate\" value=\"");
      out.print(memberDate);
      out.write("\" readonly />\r\n");
      out.write("           &nbsp;&nbsp;\r\n");
      out.write("         </div>\r\n");
      out.write("       \r\n");
      out.write("         <br />\r\n");
      out.write("         <div class=\"gender\">\r\n");
      out.write("                   <input type=\"radio\" \r\n");
      out.write("\t\t  \t\t\t\t   name=\"gender\" \r\n");
      out.write("\t\t  \t\t\t\t   id=\"gender0\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"M\"\r\n");
      out.write("\t\t  \t\t\t\t   ");
      out.print("M".equals(gender)?"checked":"" );
      out.write("/>\r\n");
      out.write("\t\t  \t\t\t<label for=\"gender0\">남</label>\r\n");
      out.write("\t\t  \t\t\t<input type=\"radio\" \r\n");
      out.write("\t\t  \t\t\t\t   name=\"gender\" \r\n");
      out.write("\t\t  \t\t\t\t   id=\"gender1\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"F\"\r\n");
      out.write("\t\t  \t\t\t\t   ");
      out.print("F".equals(gender)?"checked":"" );
      out.write("/>\r\n");
      out.write("\t\t  \t\t\t<label for=\"gender1\">여</label>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <br>\r\n");
      out.write("         <br />\r\n");
      out.write("         <br />\r\n");
      out.write("         <div class=\"login\">\r\n");
      out.write("           <input type=\"submit\" value=\"회원정보 수정\" >\r\n");
      out.write("         </div>\r\n");
      out.write("         <br />\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"update\">\r\n");
      out.write("           <input type=\"button\" value=\"패스워드수정\" onclick=\"updatePassword();\" >\r\n");
      out.write("         </div>\r\n");
      out.write("       \r\n");
      out.write("         <br />\r\n");
      out.write("         <div class=\"delete\">\r\n");
      out.write("           <input type=\"button\" value=\"회원탈퇴\" onclick=\"deleteMember();\" >\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("     </form>\r\n");
      out.write("   </section>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  function saveMember(){\r\n");
      out.write("      //아이디 유효성 검사\r\n");
      out.write("     var memberId = document.getElementById('memberId_');\r\n");
      out.write("     var password = document.getElementById('memberPwd');\r\n");
      out.write("     var password1 = document.getElementById('memberpwdcheck');\r\n");
      out.write("     var memberName = document.getElementById('memberName');\r\n");
      out.write("     var email = document.getElementById('memberEmail');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     if(!chk(/^[a-z][a-z\\d]{4,12}$/, memberId, \"아이디는  숫자 포함 영대소문자, 4~12자 입력할것!\"))\r\n");
      out.write("         return false;\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("      if(!chk(/^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{8,15}$/,password,\"패스워드는 숫자/문자/특수포함8~15자리\"))\r\n");
      out.write("          \r\n");
      out.write("          return false;\r\n");
      out.write("      if(password.value!=password1.value){\r\n");
      out.write("\r\n");
      out.write("         alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      if(!chk( /^[가-힣]{2,4}$/,memberName,\"한글 2글자 이상\"))\r\n");
      out.write("          return false;\r\n");
      out.write("      \r\n");
      out.write("      if(!chk(/^[0-9a-zA-Z]([\\-.\\w]*[0-9a-zA-Z\\-_+])*@([0-9a-zA-Z][\\-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9}$/i,email,\"이메일형식을 입력하세요.\" ))\r\n");
      out.write("          return false;\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("         function chk(re, e, msg) {\r\n");
      out.write("         if (re.test(e.value)) {\r\n");
      out.write("         return true;\r\n");
      out.write("         }\r\n");
      out.write("         alert(msg);\r\n");
      out.write("         e.value = \"\";\r\n");
      out.write("         e.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("    return true;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function deleteMember(){\r\n");
      out.write("\t  \r\n");
      out.write("\t  var bool = confirm(\"정말로 탈퇴하시겠습니까?\");\r\n");
      out.write("\t\tif(bool){\r\n");
      out.write("\t\t\tvar frm = document.memberUpdateform;\r\n");
      out.write("\t\t\tfrm.action = \"");
      out.print(request.getContextPath());
      out.write("/member/memberDelete\";\r\n");
      out.write("\t\t\tfrm.submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("  }\r\n");
      out.write("  function updatePassword(){\r\n");
      out.write("\t  var memberId_ = document.getElementById('memberId_');\r\n");
      out.write("\t  var url = \"");
      out.print(request.getContextPath());
      out.write("/member/updatePassword?memberId=");
      out.print(memberId_);
      out.write("\";\r\n");
      out.write("\t  var title = \"udatePassword\";\r\n");
      out.write("\t  var status = \"left=500px, top=200px, width=500px, height=350px\";\r\n");
      out.write("\t  open(url, title, status);\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
