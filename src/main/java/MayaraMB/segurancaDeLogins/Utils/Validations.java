package MayaraMB.segurancaDeLogins.Utils;

public class Validations {

    // Verifica se a senha contém no mínimo 8 caracteres
    public static void validatePassword(String password) {
        if (password == null || password.length() < 8) {
            throw new RuntimeException("A senha deve conter no mínimo 8 caracteres.");
        }
    }
}
