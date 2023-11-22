import React, { Component } from "react";
import "./App.css";
import FormularioCadastro from "./components/FormularioCadastro/FormularioCadastro";
import 'fontsource-roboto';
import { Container, Typography } from "@material-ui/core"
import ValidacoesCadastro from "./contexts/ValidacoesCadastro";
import { validarCPF, validarSenha } from './models/cadastro'

class App extends Component {
  render() {
    // const { data, error } = useFetch('http://sua-url-dinamica.com');
    //Tem uma pegadinha aqui

    return (
      <Container component="article" maxWidth="sm">
        <Typography variant="h3" component="h1" align="center" >Formulário de cadastro</Typography>
        <ValidacoesCadastro.Provider value={{ cpf: validarCPF, senha: validarSenha, nome: validarSenha }}>
          <FormularioCadastro aoEnviar={aoEnviarForm} />
        </ValidacoesCadastro.Provider>
      </Container>
    );
  }
}

//Aqui acontecera o envio de dados para a API
async function aoEnviarForm(dados) {
  console.log(dados); //Depuração
  try {
    const response = await fetch('http://localhost:8085/guilherme/clientes', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(dados),
    });

    if (response.ok) {
      console.log('Dados enviados com sucesso para a API.');
    }
    //Futuramente tratarei os erros aqui, posso fazer novos componentes para isso também
    else {
      console.error('Erro ao enviar dados para a API.');
    }
  } catch (error) {
    console.error('Erro ao enviar dados para a API:', error);
    // Erros de rede ou exceções aqui.
  }
}
//Aqui acontecera o envio de dados para a API
// async function aoEnviarForm(dados) {
//   console.log(dados); //Depuração
//   try {
//     //Meu hook customizado
//     const { data, error } = useFetch('http://localhost:8085/guilherme/clientes');
//     //Tratamento de erro
//     if (error) {
//       console.error('Erro ao buscar os dados:', error);
//     } else {
//       console.log('Dados buscados com sucesso:', data);
//     }

//     //Enviando dados para API algacrm 
//     const response = await fetch('http://localhost:8085/guilherme/clientes', {
//       method: 'POST',
//       headers: {
//         'Content-Type': 'application/json',
//       },
//       body: JSON.stringify(dados),
//     });

//     if (response.ok) {
//       console.log('Dados enviados com sucesso para a API.');
//     }
//     //Futuramente tratarei os erros aqui, posso fazer novos componentes para isso também
//     else {
//       console.error('Erro ao enviar dados para a API.');
//     }
//   } catch (error) {
//     console.error('Erro ao enviar dados para a API:', error);
//     // Erros de rede ou exceções aqui.
//   }
// }

export default App;
