import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';
import Paper from '@material-ui/core/Paper';

const useStyles = makeStyles((theme) => ({
  root: {
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center',
    height: '60vh',
    backgroundColor: '#f0f0f0', // Cor de fundo
  },
  paper: {
    padding: theme.spacing(4),
    textAlign: 'center',
    maxWidth: '400px',
    margin: '0 auto',
    backgroundColor: '#fff', // Cor do papel
    boxShadow: '0px 0px 10px rgba(0, 0, 0, 0.2)', // Sombra do papel
    animation: '$float 2s infinite', // Aplicar a animação de flutuação
  },
  heading: {
    fontSize: '24px',
    fontWeight: 'bold',
    marginBottom: theme.spacing(2),
    color: '#333', // Cor do título
  },
  message: {
    fontSize: '16px',
    color: '#555', // Cor do texto
  },
  '@keyframes float': { // Definir a animação de flutuação
    '0%': {
      transform: 'translateY(0)',
    },
    '50%': {
      transform: 'translateY(-10px)', // Mova para cima
    },
    '100%': {
      transform: 'translateY(0)',
    },
  },
}));

function PaginaDeAgradecimento() {
  const classes = useStyles();

  return (
    <div className={classes.root}>
      <Paper className={classes.paper} elevation={3}>
        <Typography variant="h4" className={classes.heading}>
          Obrigado por enviar seus dados!
        </Typography>
        <Typography variant="body1" className={classes.message}>
          Recebemos suas informações com sucesso. Entraremos em contato em breve.
        </Typography>
      </Paper>
    </div>
  );
}

export default PaginaDeAgradecimento;
