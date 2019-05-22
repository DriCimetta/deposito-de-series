package br.com.tab.depositodeseries.operations;

public class UserSignInRequest extends BaseRequest
{
	private static final long serialVersionUID = -2283723096647646908L;

	private String login;
	private String senha;

	public UserSignInRequest()
	{}

	public UserSignInRequest(String login, String senha)
	{
		super();
		this.login = login;
		this.senha = senha;
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
