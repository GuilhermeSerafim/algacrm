import React, { useEffect, useState } from "react";
import DadosPessoais from "./DadosPessoais";
import DadosUsuario from "./DadosUsuario";
import DadosEntrega from "./DadosEntrega";
import { Step, StepLabel, Stepper } from "@material-ui/core";
import PaginaDeAgradecimento from "./PaginaDeAgradecimento";

//Esse formulario de cadastro que vai controlar os dados, logo jogamos os dados para outro componente
//Ele só é para gerenciamento de estados (o que está sendo renderizado e quando está sendo renderizado)
function FormularioCadastro({ aoEnviar }) {
	const [etapaAtual, setEtapaAtual] = useState(0); //Por enquanto está estática
	const [dadosColetados, setDados] = useState({});
	useEffect(() => {
		if (etapaAtual === formularios.length - 1) {
			//O ``formularios.length`` é para somar todas os elementos do array
			//O -1 é para verificar a etapa atual do array (porque eles começam com 0 (1 a mais))
			aoEnviar(dadosColetados);
		}
	});

	const formularios = [
		//Todos os dados do form recebem as validações
		<DadosUsuario aoEnviar={coletarDados} />,
		<DadosPessoais aoEnviar={coletarDados} />,
		<DadosEntrega aoEnviar={coletarDados} />,
		<PaginaDeAgradecimento />,
	];

	function coletarDados(dados) {
		setDados({ ...dadosColetados, ...dados });
		proximo();
	}

	function proximo() {
		setEtapaAtual(etapaAtual + 1);
	}

	return (
		<>
			<Stepper activeStep={etapaAtual}>
				<Step>
					<StepLabel>Login</StepLabel>
				</Step>
				<Step>
					<StepLabel>Pessoal</StepLabel>
				</Step>
				<Step>
					<StepLabel>Entrega</StepLabel>
				</Step>
				<Step>
					<StepLabel>Finalização</StepLabel>
				</Step>
			</Stepper>
			{formularios[etapaAtual]}
		</>
	);
}

export default FormularioCadastro;
