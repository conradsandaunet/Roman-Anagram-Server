import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AnagramServlet extends HttpServlet {

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

            String word = req.getParameter("word");
            if (word == null) word = "";

            List<String> anagrams = new AnagramFinder().findAnagrams(word);

            req.setAttribute("word", word);
            req.setAttribute("anagrams", anagrams);

            req.getRequestDispatcher("/anagram.jsp").forward(req, resp);
        }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
