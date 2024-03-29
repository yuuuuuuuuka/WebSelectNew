package jsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JspServlet
 * @yamada
 */
@WebServlet("/JspServlet")
public class JspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public JspServlet() {
        super();

    }
//doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 呼び出し元Jspからデータ受け取り
				request.setCharacterEncoding("UTF8");
				String jsp = request.getParameter("fromJsp");

				// 呼び出し先Jspに渡すデータセット
				request.setAttribute("fromServlet", jsp + " です。");

				//result.jsp にページ遷移
				RequestDispatcher dispatch = request.getRequestDispatcher("result.jsp");
				dispatch.forward(request, response);

//				doPost(request, response);
//				response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
