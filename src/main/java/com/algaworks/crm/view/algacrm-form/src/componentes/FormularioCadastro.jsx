import { Button, FormControlLabel, Switch, TextField } from "@mui/material";
import React from "react";


//O retorno de uma function componente tem que ser minha arvore de renderização
function FormularioCadastro() {
	return (
		<form>
			<TextField
				id="nome"
				label="Nome"
				variant="outlined"
				fullWidth
				margin="normal"
			/>
			<TextField
				id="sobrenome"
				label="Sobrenome"
				variant="outlined"
				fullWidth
				margin="normal"
			/>
			<TextField
				id="cpf"
				label="CPF"
				variant="outlined"
				fullWidth
				margin="normal"
			/>
			<FormControlLabel
				control={<Switch name="promocoes" checked={true} color="primary" />}
				label="Promoções"
			/>
			<FormControlLabel
				control={<Switch name="novidades" checked={true} color="primary" />}
				label="Novidades"
			/>
			<Button type="submit" variant="contained" color="primary">
				Próximo
			</Button>
		</form>
	);
}

export default FormularioCadastro;
