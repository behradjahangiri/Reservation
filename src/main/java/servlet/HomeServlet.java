package servlet;

import dto.CreateClassInfoDto;
import lombok.extern.slf4j.Slf4j;
import service.ClassInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/")
@Slf4j
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassInfoService classInfoService = new ClassInfoService();
        List<CreateClassInfoDto> classes = classInfoService.findAll();
//        req.setAttribute("classes", classes);
//        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        Map<String, CreateClassInfoDto> classMap = new HashMap<>();

        for (CreateClassInfoDto classInfo : classes) {

            String key =
                    classInfo.getDayOfWeek()
                            + "-"
                            + classInfo.getStartTime();
//                            + "-"
//                            + classInfo.getEndTime();

            classMap.put(key, classInfo);
        }
        req.setAttribute("classMap", classMap);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
