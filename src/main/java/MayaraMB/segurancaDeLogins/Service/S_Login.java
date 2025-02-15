package MayaraMB.segurancaDeLogins.Service;

import MayaraMB.segurancaDeLogins.Repository.R_Usuario;

import org.springframework.stereotype.Service;

@Service
public class S_Login {

    private final R_Usuario rUsuario;

    public S_Login(R_Usuario rUsuario) {
        this.rUsuario = rUsuario;
    }

}
