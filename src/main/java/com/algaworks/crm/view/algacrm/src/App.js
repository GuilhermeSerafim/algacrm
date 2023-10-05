import React, { Component } from "react";
import "./App.css";
import FormularioCadastro from "./components/FormularioCadastro/FormularioCadastro";
import 'fontsource-roboto';
import { Container, Typography } from "@material-ui/core"
import ValidacoesCadastro from "./contexts/ValidacoesCadastro";
import { validarCPF, validarSenha } from './models/cadastro'

class App extends Component {

  render() {
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
    } else {
      console.error('Erro ao enviar dados para a API.');
    }
  } catch (error) {
    console.error('Erro ao enviar dados para a API:', error);
    // Erros de rede ou exceções aqui.
  }
}

export default App;
