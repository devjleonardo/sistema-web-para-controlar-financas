package com.jlcb.minhasfinancas.api.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class CadastroUsuarioDTO {

	private String nome;
	private String email;
	private String senha;
}