import React, { Component } from 'react';
import './App.css';
import '@fontsource/roboto';
import FormularioCadastro from './componentes/FormularioCadastro';
import { Container, Typography } from '@mui/material';

//Class component
//Nesse projeto vamos usar funções para criar nossos componentes
class App extends Component {
  render() {
    return (
      <Container component='article' maxWidth='sm'>
        <Typography variant='h3' align='center' component='h1'>FormularioCadastro</Typography>
          <FormularioCadastro aoEnviar={aoEnviarForm} validarCPF={validarCPF}/>
      </Container>
    );
  }
}

function aoEnviarForm(dados) {
  console.log(dados)
}

function validarCPF(cpf) {
  if(cpf.length !== 11){
    return {valido:false, texto:"CPF deve ter 11 digítos"};
  }else{
    return {valido:true, texto:""};
  }
}

export default App;
