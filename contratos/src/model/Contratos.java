package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="contratos",schema="contratos")
public class Contratos implements Serializable{
	
	private static final long serialVersionUID = -8986912056573551539L;

	@Id
	@GeneratedValue
	private String id;
	
	@Column(length = 300)
	private String processo;

	@Column(length = 300)
	private String documento;
	
	@Column(length = 100)
	private String email;
	
	@Column
	private Date datadeassinatura;
	
	@Column
	private Date publicacaodoe;
	
	@Column(length = 300)
	private String contrato;
	
	@Column(length = 300)
	private String postos;
	
	@Column(length = 300)
	private String dadoslicitacao;
	
	@Column
	private Date vencimento;
	
	@Column
	private Date fimperiodo;
	
	@Column(length = 300)
	private String datapagnf;
	
	@Column(length = 300)
	private String valorcontratualmensal;
	
	@Column(length = 300)
	private String projeto;
	
	@Column(length = 300)
	private String recurso;
	
	@Column(length = 300)
	private String seguro;
	
	@Column(length = 300)
	private String responsavel;
	
	@Column(length = 300)
	private String telefone;
	
	@Column(length = 300)
	private String nome;
	
	@Column(length = 500)
	private String obs;

	@ManyToOne
	@JoinColumn(name="aditivo", referencedColumnName="id")	
	private Aditivo aditivo;

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Aditivo getAditivo() {
		return aditivo;
	}

	public void setAditivo(Aditivo aditivo) {
		this.aditivo = aditivo;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getDatadeassinatura() {
		return datadeassinatura;
	}

	public void setDatadeassinatura(Date datadeassinatura) {
		this.datadeassinatura = datadeassinatura;
	}

	public Date getPublicacaodoe() {
		return publicacaodoe;
	}

	public void setPublicacaodoe(Date publicacaodoe) {
		this.publicacaodoe = publicacaodoe;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getPostos() {
		return postos;
	}

	public void setPostos(String postos) {
		this.postos = postos;
	}

	public String getDadoslicitacao() {
		return dadoslicitacao;
	}

	public void setDadoslicitacao(String dadoslicitacao) {
		this.dadoslicitacao = dadoslicitacao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getFimperiodo() {
		return fimperiodo;
	}

	public void setFimperiodo(Date fimperiodo) {
		this.fimperiodo = fimperiodo;
	}

	public String getDatapagnf() {
		return datapagnf;
	}

	public void setDatapagnf(String datapagnf) {
		this.datapagnf = datapagnf;
	}

	public String getValorcontratualmensal() {
		return valorcontratualmensal;
	}

	public void setValorcontratualmensal(String valorcontratualmensal) {
		this.valorcontratualmensal = valorcontratualmensal;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aditivo == null) ? 0 : aditivo.hashCode());
		result = prime * result
				+ ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result
				+ ((dadoslicitacao == null) ? 0 : dadoslicitacao.hashCode());
		result = prime
				* result
				+ ((datadeassinatura == null) ? 0 : datadeassinatura.hashCode());
		result = prime * result
				+ ((datapagnf == null) ? 0 : datapagnf.hashCode());
		result = prime * result
				+ ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((fimperiodo == null) ? 0 : fimperiodo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
		result = prime * result + ((postos == null) ? 0 : postos.hashCode());
		result = prime * result
				+ ((processo == null) ? 0 : processo.hashCode());
		result = prime * result + ((projeto == null) ? 0 : projeto.hashCode());
		result = prime * result
				+ ((publicacaodoe == null) ? 0 : publicacaodoe.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		result = prime * result
				+ ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((seguro == null) ? 0 : seguro.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		result = prime
				* result
				+ ((valorcontratualmensal == null) ? 0 : valorcontratualmensal
						.hashCode());
		result = prime * result
				+ ((vencimento == null) ? 0 : vencimento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contratos other = (Contratos) obj;
		if (aditivo == null) {
			if (other.aditivo != null)
				return false;
		} else if (!aditivo.equals(other.aditivo))
			return false;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (dadoslicitacao == null) {
			if (other.dadoslicitacao != null)
				return false;
		} else if (!dadoslicitacao.equals(other.dadoslicitacao))
			return false;
		if (datadeassinatura == null) {
			if (other.datadeassinatura != null)
				return false;
		} else if (!datadeassinatura.equals(other.datadeassinatura))
			return false;
		if (datapagnf == null) {
			if (other.datapagnf != null)
				return false;
		} else if (!datapagnf.equals(other.datapagnf))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fimperiodo == null) {
			if (other.fimperiodo != null)
				return false;
		} else if (!fimperiodo.equals(other.fimperiodo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (obs == null) {
			if (other.obs != null)
				return false;
		} else if (!obs.equals(other.obs))
			return false;
		if (postos == null) {
			if (other.postos != null)
				return false;
		} else if (!postos.equals(other.postos))
			return false;
		if (processo == null) {
			if (other.processo != null)
				return false;
		} else if (!processo.equals(other.processo))
			return false;
		if (projeto == null) {
			if (other.projeto != null)
				return false;
		} else if (!projeto.equals(other.projeto))
			return false;
		if (publicacaodoe == null) {
			if (other.publicacaodoe != null)
				return false;
		} else if (!publicacaodoe.equals(other.publicacaodoe))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (seguro == null) {
			if (other.seguro != null)
				return false;
		} else if (!seguro.equals(other.seguro))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (valorcontratualmensal == null) {
			if (other.valorcontratualmensal != null)
				return false;
		} else if (!valorcontratualmensal.equals(other.valorcontratualmensal))
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contratos [id=" + id + ", processo=" + processo
				+ ", documento=" + documento + ", datadeassinatura="
				+ datadeassinatura + ", publicacaodoe=" + publicacaodoe
				+ ", contrato=" + contrato + ", postos=" + postos
				+ ", dadoslicitacao=" + dadoslicitacao + ", vencimento="
				+ vencimento + ", fimperiodo=" + fimperiodo + ", datapagnf="
				+ datapagnf + ", valorcontratualmensal="
				+ valorcontratualmensal + ", projeto=" + projeto + ", recurso="
				+ recurso + ", seguro=" + seguro + ", responsavel="
				+ responsavel + ", email=" + email + ", telefone=" + telefone
				+ ", nome=" + nome + ", obs=" + obs + ", aditivo=" + aditivo
				+ "]";
	}

	
}
