package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>My Profile</title>\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: Times New Roman, serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(135deg, rgba(224, 224, 224, 0.8), rgba(245, 245, 245, 0.8)), url('https://media.licdn.com/dms/image/v2/C561BAQHbzvCvMx2RSg/company-background_10000/company-background_10000/0/1585194224721/faculty_of_computer_and_mathematical_sciences_uitm_cover?e=2147483647&v=beta&t=TDUEgRv1eVbuuB3lyxs8UfX6O1vbYJVz0lr__tJQ9xg') no-repeat center center fixed;\n");
      out.write("            background-size: cover;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            animation: fadeIn 1s ease-in;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes fadeIn {\n");
      out.write("            from { opacity: 0; }\n");
      out.write("            to { opacity: 1; }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile-card {\n");
      out.write("            background: rgba(255, 255, 255, 0.9);\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0 10px 30px rgba(0,0,0,0.2);\n");
      out.write("            overflow: hidden;\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 600px;\n");
      out.write("            position: relative;\n");
      out.write("            transform: translateY(20px);\n");
      out.write("            animation: slideUp 0.8s ease-out forwards;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes slideUp {\n");
      out.write("            to { transform: translateY(0); }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile-header {\n");
      out.write("            background: linear-gradient(45deg, #4a90e2, #357abd);\n");
      out.write("            color: white;\n");
      out.write("            padding: 30px 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile-header::before {\n");
      out.write("            content: '';\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            right: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            background: url('data:image/svg+xml,<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 100 100\"><circle cx=\"50\" cy=\"50\" r=\"2\" fill=\"rgba(255,255,255,0.1)\"/></svg>') repeat;\n");
      out.write("            opacity: 0.3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile-pic {\n");
      out.write("            width: 100px;\n");
      out.write("            height: 100px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            background: linear-gradient(45deg, #4a90e2, #357abd);\n");
      out.write("            margin: 0 auto 15px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            font-size: 2rem;\n");
      out.write("            color: white;\n");
      out.write("            border: 4px solid white;\n");
      out.write("            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .greeting {\n");
      out.write("            font-size: 1.5rem;\n");
      out.write("            margin-bottom: 8px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-shadow: 1px 1px 3px rgba(0,0,0,0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .welcome-text {\n");
      out.write("            opacity: 0.9;\n");
      out.write("            font-size: 1rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile-content {\n");
      out.write("            padding: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info-section {\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section-title {\n");
      out.write("            color: #333;\n");
      out.write("            font-size: 1.2rem;\n");
      out.write("            margin-bottom: 12px;\n");
      out.write("            padding-bottom: 8px;\n");
      out.write("            border-bottom: 2px solid #f0f0f0;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section-title i {\n");
      out.write("            margin-right: 8px;\n");
      out.write("            color: #4a90e2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info-grid {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: 1fr 2fr;\n");
      out.write("            gap: 12px;\n");
      out.write("            margin-bottom: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info-label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #555;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info-value {\n");
      out.write("            color: #333;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hobbies-container {\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            gap: 8px;\n");
      out.write("            margin-top: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hobby-tag {\n");
      out.write("            background: linear-gradient(45deg, #4a90e2, #357abd);\n");
      out.write("            color: white;\n");
      out.write("            padding: 4px 12px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            font-size: 0.85rem;\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .about-me {\n");
      out.write("            background: #fafafa;\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            border-left: 4px solid #4a90e2;\n");
      out.write("            margin-top: 8px;\n");
      out.write("            font-size: 14px;\n");
      out.write("            line-height: 1.5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn {\n");
      out.write("            background: linear-gradient(45deg, #4a90e2, #357abd);\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 12px 25px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            font-size: 14px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("            box-shadow: 0 4px 15px rgba(74, 144, 226, 0.4);\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn:hover {\n");
      out.write("            background: linear-gradient(45deg, #357abd, #2c5aa0);\n");
      out.write("            transform: translateY(-2px);\n");
      out.write("            box-shadow: 0 6px 20px rgba(74, 144, 226, 0.6);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-info {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 8px;\n");
      out.write("            margin-top: 3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .email-icon {\n");
      out.write("            color: #4a90e2;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 600px) {\n");
      out.write("            body {\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .profile-content {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .profile-header {\n");
      out.write("                padding: 25px 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .greeting {\n");
      out.write("                font-size: 1.3rem;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .profile-pic {\n");
      out.write("                width: 80px;\n");
      out.write("                height: 80px;\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .info-grid {\n");
      out.write("                grid-template-columns: 1fr;\n");
      out.write("                gap: 8px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"profile-card\">\n");
      out.write("        <div class=\"profile-header\">\n");
      out.write("            <div class=\"profile-pic\">\n");
      out.write("                ");
      out.print( request.getAttribute("name").toString().charAt(0) );
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"greeting\">Hello, ");
      out.print( request.getAttribute("name") );
      out.write("!</h1>\n");
      out.write("            <p class=\"welcome-text\">Nice to meet you!</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"profile-content\">\n");
      out.write("            <div class=\"info-section\">\n");
      out.write("                <h2 class=\"section-title\">📋 Personal Information</h2>\n");
      out.write("                <div class=\"info-grid\">\n");
      out.write("                    <div class=\"info-label\">Name:</div>\n");
      out.write("                    <div class=\"info-value\">");
      out.print( request.getAttribute("name") );
      out.write("</div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"info-label\">Student ID:</div>\n");
      out.write("                    <div class=\"info-value\">");
      out.print( request.getAttribute("studentId") );
      out.write("</div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"info-label\">Program:</div>\n");
      out.write("                    <div class=\"info-value\">");
      out.print( request.getAttribute("program") );
      out.write("</div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"info-label\">Email:</div>\n");
      out.write("                    <div class=\"info-value\">\n");
      out.write("                        <div class=\"contact-info\">\n");
      out.write("                            <span class=\"email-icon\">✉</span>\n");
      out.write("                            ");
      out.print( request.getAttribute("email") );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"info-section\">\n");
      out.write("                <h2 class=\"section-title\">🎯 Hobbies & Interests</h2>\n");
      out.write("                <div class=\"hobbies-container\">\n");
      out.write("                    ");

                        String hobbies = (String) request.getAttribute("hobbies");
                        if (hobbies != null && !hobbies.isEmpty()) {
                            String[] hobbiesArray = hobbies.split(",");
                            for (String hobby : hobbiesArray) {
                                String trimmedHobby = hobby.trim();
                                if (!trimmedHobby.isEmpty()) {
                    
      out.write("\n");
      out.write("                    <div class=\"hobby-tag\">");
      out.print( trimmedHobby );
      out.write("</div>\n");
      out.write("                    ");

                                }
                            }
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"info-section\">\n");
      out.write("                <h2 class=\"section-title\">💫 About Me</h2>\n");
      out.write("                <div class=\"about-me\">\n");
      out.write("                    ");
      out.print( request.getAttribute("introduction") );
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"back-btn\" onclick=\"window.location.href='index.html'\">\n");
      out.write("                ← Create Another Profile\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
