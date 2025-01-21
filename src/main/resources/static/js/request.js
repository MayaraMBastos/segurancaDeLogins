export const ApiModule = (function () {
    async function makeRequest(url, method, data) {
        return $.ajax({
            url: url,
            type: method,
            contentType: 'application/json',
            data: JSON.stringify(data)
        });
    }

    return {
        post: async function (url, data) {
            return await makeRequest(url, 'POST', data);
        },
        get: async function (url) {
            return await makeRequest(url, 'GET');
        },
        put: async function (url, data) {
            return await makeRequest(url, 'PUT', data);
        },
        delete: async function (url) {
            return await makeRequest(url, 'DELETE');
        }
    };
})();
// Modulo de Login/Logout
export const LoginModule = (function (api) {
    return {
        login: async function (credentials) {
            return await api.post('/login', credentials);
        },
        logout: async function () {
            return await api.post('/logout', {});
        }
    };
})(ApiModule);
//Modulo de cadastro
export const RegisterModule = (function (api) {
    return {
        register: async function (userData) {
            return await api.post('/cadastro', userData);
        }
    };
})(ApiModule);
