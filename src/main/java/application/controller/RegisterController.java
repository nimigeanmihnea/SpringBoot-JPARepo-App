package application.controller;

import application.repository.UserInfoRepository;
import application.repository.UserRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


/**
 * Created by NMI4CLJ on 30.08.2017.
 */

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegister(){
        return "/register";
    }

    @RequestMapping(value = "/step2", method = RequestMethod.GET)
    public String showStepThow(){
        return "/step2";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        String url = "?u="+username+"?p="+password+"?e="+email;
        String encodedUrl = encode(url);
        return "redirect:/step2?p="+encodedUrl;
    }

    @RequestMapping(value = "/step2", method = RequestMethod.POST)
    public String stepTwo(@PathParam("p") String param, HttpServletRequest request){
        String url = decode(param);
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String pid = request.getParameter("pid");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

    }

    private String encode(String parameter){
        String encodedParameter = new String();
        try{
            encodedParameter = URLEncoder.encode(parameter, "UTF-8");
        }catch (UnsupportedEncodingException e){
            return "redirect:/errors/encoding";
        }
        finally {
            return encodedParameter;
        }
    }

    private String decode(String parameter){
        String decodedParameter = new String();
        try{
            decodedParameter = URLDecoder.decode(parameter, "UTF-8");
        }catch (UnsupportedEncodingException e){
            return "redirect:/errors/encoding";
        }
        finally {
            return decodedParameter;
        }
    }
}
