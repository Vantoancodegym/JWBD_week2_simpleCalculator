import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
double first=Double.parseDouble(request.getParameter("first"));
double second=Double.parseDouble(request.getParameter("second"));
String operator=request.getParameter("operator");
double result=0;
switch (operator){
    case "+":
        result=first+second;
        break;
    case "-":
        result=first-second;
        break;
    case "x":
        result=first*second;
        break;
    case "/":
        result=first/second;
        break;
}
request.setAttribute("result",result);
        RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
