package br.com.tab.depositodeseries.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginAuthentication implements Serializable
{
	private static final long serialVersionUID = 3939568531517838194L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique=true)
	private String login;
	private String senha;

	public LoginAuthentication()
	{}

	public LoginAuthentication(String login, String senha)
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginAuthentication other = (LoginAuthentication) obj;
		if (login == null)
		{
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}
}
