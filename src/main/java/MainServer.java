import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class MainServer {
    Tomcat tomcat = new Tomcat();

    public MainServer() {

        tomcat.setPort(8080);
        tomcat.getConnector();

        String webappDir = new File("webapp").getAbsolutePath();
        Context context = tomcat.addWebapp("", webappDir);

        Tomcat.addServlet(context, "anagram", new AnagramServlet());
        context.addServletMappingDecoded("/anagram", "anagram");

        Tomcat.addServlet(context, "romanNumeral", new RomanNumeralServlet());
        context.addServletMappingDecoded("/romanNumeral", "romanNumeral");

        context.addWelcomeFile("index.jsp");

        try {
            tomcat.start();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
        tomcat.getServer().await();
    }
}
