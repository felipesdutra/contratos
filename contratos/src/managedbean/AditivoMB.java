package managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import model.Aditivo;
import model.dao.AditivoDao;

import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "aditivoMB")
public class AditivoMB implements Serializable {

	private static final long serialVersionUID = -1968663509271177335L;

	private String mensagem = "";
	private Aditivo aditivo = new Aditivo();
	private AditivoDao dao = new AditivoDao();

	private List<Aditivo> lista = new ArrayList<Aditivo>();
	
	public void incluir() {
		if (dao.gravar(aditivo) == null)
			this.setMensagem("Erro ao salvar Aditivo");
		else
			this.setMensagem("Dados salvos com sucesso.");
	}

	public AditivoDao getDao() {
		return dao;
	}

	public void setDao(AditivoDao dao) {
		this.dao = dao;
	}

	public void onEdit(RowEditEvent event) {
		Aditivo adi = ((Aditivo) event.getObject());
		if (dao.gravar(adi) == null)
			this.setMensagem("Erro ao salvar Aditivo");
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

	public Aditivo getAditivo() {
		return aditivo;
	}

	public void setAditivo(Aditivo Aditivo) {
		this.aditivo = Aditivo;
	}

	public List<Aditivo> getLista() {
		if (lista.isEmpty()) {
			lista = dao.listar();
		}	
		return lista;		
	}

	public void setLista(List<Aditivo> lista) {
		this.lista = lista;
	}
	

}
