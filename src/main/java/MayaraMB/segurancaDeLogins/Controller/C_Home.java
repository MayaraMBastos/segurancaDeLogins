package MayaraMB.segurancaDeLogins.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {

    @GetMapping("/home")
    public String mapHome(){
        return "Home/home";
    }
}
