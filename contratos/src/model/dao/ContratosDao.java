package model.dao;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aditivo;
import model.Contratos;

public class ContratosDao extends DaoGenericoImp<Contratos, Serializable> {

	public Contratos gravar(Contratos a) {
		return super.salvar(a);
	}

	public Contratos consultar(Long codigo) {
		return super.pesquisarPorId(codigo);
	}

	public List<Contratos> listar() {
		return super.todos();
	}

	public List<Contratos> listarOrdenado() {

		String sqlQuery = "from Contratos order by id";

		return super.listPesq(sqlQuery);

	}

	public List<Contratos> pesquisaContratos(String processo, String documento, String contrato)
			throws ParseException { //
		
		String sqlQuery = "from Contratos c" + " where 1 =1 ";
		final Map<String, Object> parameters = new HashMap<String, Object>();

		if (!processo.equals("")) {

			sqlQuery += " and processo = :pro ";

			parameters.put("pro", processo);

		}

		if (!documento.equals("")) {

			sqlQuery += " and documento = :doc ";

			parameters.put("doc", documento);

		}

		if (!contrato.equals("")) {

			sqlQuery += " and contrato = :con ";

			parameters.put("con", contrato);

		}

		return super.listPesqParam(sqlQuery, parameters);

	}

}
