import { RegisterModule } from './request.js';

$(document).ready(function () {
    $('.formCadastro').on('submit', async function (e) {
        e.preventDefault();
        var credentials = {
            nome: $('#nome').val(),
            senha: $('#senha').val()
        };

        try {
            const response = await RegisterModule.register(credentials);
            alert(response);
        } catch (error) {
            alert(error.responseText); // retornar responseText

        }
    });

});
