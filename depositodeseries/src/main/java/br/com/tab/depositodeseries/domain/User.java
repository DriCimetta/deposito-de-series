package br.com.tab.depositodeseries.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable
{
	private static final long serialVersionUID = 8639451596001540100L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String email;
	
	@OneToOne
	@JoinColumn(name="login_id")
	private LoginAuthentication acesso;

	public User()
	{}

	public User(Integer id, String nome, String email, LoginAuthentication acesso)
	{
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.setAcesso(acesso);
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public LoginAuthentication getAcesso()
	{
		return acesso;
	}

	public void setAcesso(LoginAuthentication acesso)
	{
		this.acesso = acesso;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		User other = (User) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
