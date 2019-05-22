package br.com.tab.depositodeseries.operations;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserSignUpRequest extends BaseRequest
{
	private static final long serialVersionUID = -7392415793025320894L;

	@NotBlank
	private String nomeUsuario;
	@NotBlank
	@Email
	private String emailUsuario;
	@NotBlank
	private String login;
	@NotBlank
	private String senha;

	public UserSignUpRequest()
	{
		this.nomeUsuario = null;
		this.emailUsuario = null;
		this.login = null;
		this.senha = null;
	}

	public UserSignUpRequest(String nomeUsuario, String emailUsuario, String login, String senha)
	{
		super();
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.login = login;
		this.senha = senha;
	}

	public String getNomeUsuario()
	{
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario)
	{
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario()
	{
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario)
	{
		this.emailUsuario = emailUsuario;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getSenha()
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		this.senha = senha;
	}
}
