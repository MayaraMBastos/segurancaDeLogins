package MayaraMB.segurancaDeLogins.Controller;

import MayaraMB.segurancaDeLogins.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;


@Controller
@SessionAttributes("usuario")
public class C_Login {

    @GetMapping("/login")
    public String mapLogin(){
        return "Login/login";
    }

    @Autowired
    private AuthService authService;

    // Criando uma classe DTO para receber os dados no formato JSON
    public static class LoginRequest {
        public String type;
        public String nome;
        public String senha;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        boolean success = authService.authenticate(request.nome, request.senha, request.type);

        if (success) {
            return ResponseEntity.ok("/home"); // 🔹 Retorna a URL da Home como resposta
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("/login?error=true"); // 🔹 Retorna a URL da página de erro
        }
    }

}
