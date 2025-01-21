package MayaraMB.segurancaDeLogins.Service;

import MayaraMB.segurancaDeLogins.Model.M_Usuario;
import MayaraMB.segurancaDeLogins.Repository.R_Usuario;
import MayaraMB.segurancaDeLogins.Utils.PasswordUtils;
import MayaraMB.segurancaDeLogins.Utils.Validations;
import org.springframework.stereotype.Service;

@Service
public class S_Cadastro {

    private final R_Usuario rUsuario;

    public S_Cadastro(R_Usuario rUsuario) {
        this.rUsuario = rUsuario;
    }

    public void registroUsuario(M_Usuario user) {
        // Verificar se o username já existe
        if (rUsuario.findByNome(user.getNome()).isPresent()) {
            throw new RuntimeException("O nome de usuário já está em uso.");
        }
        try {
            // Validação de senha
            Validations.validatePassword(user.getSenha());
        } catch (RuntimeException e) {
            // Relançar a exceção para interromper o fluxo
            throw e;
        }

            // Criptografar a senha
            String hashedPassword = PasswordUtils.hashPassword(user.getSenha());
            user.setSenha(hashedPassword);

            // Salvar usuário no banco
            rUsuario.save(user);




    }
}
