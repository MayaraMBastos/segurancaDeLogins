import { LoginModule } from './request.js';

$(document).ready(function () {
    $('.formularioLogin').on('submit', async function (e) {
        e.preventDefault();
        const credentials = {
            nome: $('#nome').val(),
            senha: $('#senha').val()
        };

        try {
            const response = await LoginModule.login(credentials);
            alert('Login bem-sucedido!');
            // Redirecionar ou executar lógica adicional
        } catch (error) {
            alert('Erro no login!');
        }
    });
});
