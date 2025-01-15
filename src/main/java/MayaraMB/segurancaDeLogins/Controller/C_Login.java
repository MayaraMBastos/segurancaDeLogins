package MayaraMB.segurancaDeLogins.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/login")
@SessionAttributes("usuario")
public class C_Login {

    @GetMapping("/login")
    public String mapLogin(){
        return "Login/login";
    }

}
