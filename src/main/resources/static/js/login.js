import { LoginModule } from './request.js';

$(document).ready(function () {
    $('.formularioLogin').on('submit', async function (e) {
        e.preventDefault();

        const credentials = {
            nome: $('#nome').val(),
            senha: $('#senha').val(),
            type: $('#type').val()
        };

        try {
            const response = await LoginModule.login(credentials); // 🔹 Captura a resposta do servidor (URL)
            window.location.href = response; // 🔹 Redireciona para a URL recebida
        } catch (error) {
            alert('Erro no login! ' + error.responseText); // 🔹 Exibe a mensagem do erro
        }
    });
});
