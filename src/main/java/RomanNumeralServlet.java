import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RomanNumeralServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numberParam = req.getParameter("number");
        int n = Integer.parseInt(numberParam);
        String roman = RomanNumerals.romanNumerals(n);

        req.setAttribute("number", n);
        req.setAttribute("roman", roman);

        req.getRequestDispatcher("/roman.jsp").forward(req, resp);

    }
}
