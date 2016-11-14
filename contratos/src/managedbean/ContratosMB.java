package managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import model.Contratos;
import model.dao.ContratosDao;

import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "contratosMB")
public class ContratosMB implements Serializable {

	private static final long serialVersionUID = -1968663509271177335L;

	private String mensagem = "";
	private Contratos contratos = new Contratos();
	private ContratosDao dao = new ContratosDao();

	private List<Contratos> lista = new ArrayList<Contratos>();
	
	public void incluir() {
		if (dao.gravar(contratos) == null)
			this.setMensagem("Erro ao salvar Contratos");
		else
			this.setMensagem("Dados salvos com sucesso.");
	}

	public ContratosDao getDao() {
		return dao;
	}

	public void setDao(ContratosDao dao) {
		this.dao = dao;
	}

	public void onEdit(RowEditEvent event) {
		Contratos con = ((Contratos) event.getObject());
		if (dao.gravar(con) == null)
			this.setMensagem("Erro ao salvar Contratos");
		else
			this.setMensagem("Dados salvos com sucesso.");
	}

	public void onCancel(RowEditEvent event) {
		//Não apagar, apenas não realiza ação nenhuma.
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Contratos getContratos() {
		return contratos;
	}

	public void setContratos(Contratos Contratos) {
		this.contratos = Contratos;
	}

	public List<Contratos> getLista() {
		if (lista.isEmpty()) {
			lista = dao.listar();
		}	
		return lista;		
	}

	public void setLista(List<Contratos> lista) {
		this.lista = lista;
	}
	

}
