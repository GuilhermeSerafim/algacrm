import { Button, FormControlLabel, Switch, TextField } from "@mui/material";
import React, { useState } from "react";

//O retorno de uma function componente tem que ser minha arvore de renderização
function FormularioCadastro({aoEnviar}) {
	const [nome, setNome] = useState("");
	const [sobrenome, setSobrenome] = useState("");
	const [cpf, setCpf] = useState("");
	const [promocoes, setPromocoes] = useState(true);
	const [novidades, setNovidades] = useState(true);

	return (
		<form
			onSubmit={(event) => {
				event.preventDefault();
				aoEnviar({nome, sobrenome, cpf, promocoes, novidades});
			}}
		>
			<TextField
				value={nome}
				onChange={(event) => {
					setNome(event.target.value);
				}}
				id="nome"
				label="Nome"
				variant="outlined"
				fullWidth
				margin="normal"
			/>
			<TextField
				value={sobrenome}
				onChange={(event) => {
					setSobrenome(event.target.value);
				}}
				id="sobrenome"
				label="Sobrenome"
				variant="outlined"
				fullWidth
				margin="normal"
			/>
			<TextField
				value={cpf}
				onChange={(event) => {
					setCpf(event.target.value);
				}}
				id="cpf"
				label="CPF"
				variant="outlined"
				fullWidth
				margin="normal"
			/>
			<FormControlLabel
				control={
					<Switch
						onChange={(event) => {
							setPromocoes(event.target.checked);
						}}
						name="promocoes"
						checked={promocoes}
						color="primary"
					/>
				}
				label="Promoções"
			/>
			<FormControlLabel
				control={
					<Switch
						onChange={(event) => {
							setNovidades(event.target.checked);
						}}
						name="novidades"
						checked={novidades}
						color="primary"
					/>
				}
				label="Novidades"
			/>
			<Button type="submit" variant="contained" color="primary">
				Próximo
			</Button>
		</form>
	);
}

export default FormularioCadastro;
