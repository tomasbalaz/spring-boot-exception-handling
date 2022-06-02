package sk.balaz.springbootexceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model, @RequestParam(required = false) String code) {
        if("400".equals(code)) {
            throw new BadRequestException("Bad code");
        }
        if("403".equals(code)) {
            throw new AccessDeniedException("You are not authorized to access this page");
        }

        model.addAttribute("greeting", "Hello Tomas");
        return "index";
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class BadRequestException extends RuntimeException {
        public BadRequestException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    class AccessDeniedException extends RuntimeException {
        public AccessDeniedException(String message) {
            super(message);
        }
    }
}
