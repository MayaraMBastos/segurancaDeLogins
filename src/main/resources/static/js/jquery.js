$('.formCadastro').submit(function (event) {
    event.preventDefault(); // Evita o envio padrão do formulário

    // Obtem os dados do formulário
    const userData = {
        name: $('#usuario').val(),
        email: $('#senha').val()
    };

    // Faz o POST para a API
    $.ajax({
        url: '/cadastro',
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(userData),
        success: function (response) {
            alert('Usuário cadastrado com sucesso!');
        },
        error: function (error) {
            alert('Erro ao cadastrar usuário.');
            console.error(error);
        }
    });
});