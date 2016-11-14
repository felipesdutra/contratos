package managedbean;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Contratos;
import model.dao.ContratosDao;


@ViewScoped
@ManagedBean(name = "pesquisaMB")
public class PesquisaMB implements Serializable {

	private static final long serialVersionUID = 7582999429199854341L;

	private String mensagem = "";
	private String processo;
	private String contrato;
	
	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	private String documento;
	
	private ContratosDao dao = new ContratosDao();

	private List<Contratos> lista = new ArrayList<Contratos>();
	
	public void consultar() throws ParseException{
		//dao.pesquisarContratos(resgate, processo);
		lista = dao.pesquisaContratos(processo, documento, contrato);
		//System.out.println(resgate.toString());
	}
	
	
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public ContratosDao getDao() {
		return dao;
	}

	public void setDao(ContratosDao dao) {
		this.dao = dao;
	}

	public List<Contratos> getLista() {
		return lista;
	}

	public void setLista(List<Contratos> lista) {
		this.lista = lista;
	}
}