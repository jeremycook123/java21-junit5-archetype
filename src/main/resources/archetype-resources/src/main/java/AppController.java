package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    // Handles GET requests to "/hello" and returns a plain text response
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "CloudAcademy DevOps 2024!";
    }

    // Handles GET requests to "/greet/{name}" and returns a personalized greeting
    @GetMapping("/greet/{name}")
    @ResponseBody
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Handles POST requests to "/echo" and returns the echoed message
    @PostMapping("/echo")
    @ResponseBody
    public String echo(@RequestBody String message) {
        return "Echo: " + message;
    }

    // Handles GET requests to "/hello-model" and returns a view with model data
    @GetMapping("/hello-model")
    public String helloModel(Model model) {
        model.addAttribute("message", "Hello, Model!");
        return "hello"; // Assumes there's a corresponding Thymeleaf template named "hello.html"
    }

    // Handles GET requests to "/redirect" and redirects to "/hello"
    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/hello";
    }

    // Handles GET requests to "/forward" and forwards to "/hello"
    @GetMapping("/forward")
    public String forward() {
        return "forward:/hello";
    }
}