
import { RegisterModule } from './request.js';

$(document).ready(function () {
    $('.formCadastro').on('submit', async function (e) {
        e.preventDefault();
        var credentials = {
            username: $('#usuario').val(),
            password: $('#senha').val()
        };

        try {
            const response = await RegisterModule.register(credentials);
            alert('Cadastro bem-sucedido!');
        } catch (error) {
            alert('Erro no cadastro! Verifique os dados e tente novamente.');
            console.error(error); // Log para debugar o erro
        }
    });

});
