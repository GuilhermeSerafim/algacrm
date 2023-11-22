import { useState } from "react";

//Quem usar esse hook vai ter acesso ao estado do erro, e a função de validarCampos
//Hook customizado


//Ou seja, independente das validacoes que eu tiver, ele vai criar um campo aqui falando que é valido e tem um texto vazio
function useErros(validacoes) {
    const estadoInicial = criarEstadoInicial(validacoes);
    // const estadoInicial = validacoes;
    //Se não criar essa função e pegar diretamente a validações, ele já vai fazer a validação diretamente, e nosso input vermelo
    const [erros, setErros] = useState(estadoInicial);
    function validarCampos(event) {
        const { name, value } = event.target;
        const novoEstado = { ...erros };
        novoEstado[name] = validacoes[name](value);
        setErros(novoEstado);
    }

    // Percorre os campos no objeto erros e, se encontrar pelo menos um campo inválido (ou seja, com valido igual a false), a função retorna false, indicando que o formulário não pode ser enviado.
    function possoEnviar() {
        for (let campo in erros) {
            if (!erros[campo].valido) {
                return false;
            }
        }
        return true;
    }

    return [erros, validarCampos, possoEnviar];
}

//Criamos essa função para atribuimos um valor inicial no estado erros para todos os campos
function criarEstadoInicial(validacoes) {
    const estadoInicial = {};
    for (let campo in validacoes) {
        estadoInicial[campo] = { valido: true, texto: "" };
    }
    return estadoInicial;
}

//Perceba que o setErros está encapsulado, enquanto o validarCampos e o estado não
export default useErros;