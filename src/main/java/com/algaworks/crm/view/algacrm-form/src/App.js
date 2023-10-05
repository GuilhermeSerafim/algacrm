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
          <FormularioCadastro />
      </Container>
    );
  }
}

export default App;
