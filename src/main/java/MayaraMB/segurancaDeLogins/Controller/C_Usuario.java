package MayaraMB.segurancaDeLogins.Controller;

import MayaraMB.segurancaDeLogins.Model.M_Usuario;
import MayaraMB.segurancaDeLogins.Service.S_Cadastro;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class C_Usuario {

    @GetMapping("/cadastro")
    public String mapCadastro(){
        return "Cadastros/cadastro";
    }

    private final S_Cadastro s_cadastro;

    // Construtor do service do cadastro
    public C_Usuario(S_Cadastro s_cadastro) {
        this.s_cadastro = s_cadastro;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> postCadastro(@RequestBody M_Usuario objUsuario){
        try {
            // Passa os dados do usuário para o serviço que faz o registro
            s_cadastro.registroUsuario(objUsuario);
            return ResponseEntity.ok("Usuário registrado com sucesso!");
        } catch (RuntimeException e) {
            // Retorna erro caso algo dê errado (ex.: username já existe)
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
