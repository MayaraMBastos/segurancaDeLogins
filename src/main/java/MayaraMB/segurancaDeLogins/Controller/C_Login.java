package MayaraMB.segurancaDeLogins.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("usuario")
public class C_Login {

    @GetMapping("/login")
    public String mapLogin(){
        return "Login/login";
    }
}
