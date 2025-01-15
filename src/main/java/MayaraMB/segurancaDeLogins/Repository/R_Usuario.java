package MayaraMB.segurancaDeLogins.Repository;

import MayaraMB.segurancaDeLogins.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {

    Optional<M_Usuario> findByNome(String nome);

}
