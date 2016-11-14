package model.dao;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aditivo;


public class AditivoDao extends DaoGenericoImp<Aditivo, Serializable>{
	

	public Aditivo gravar(Aditivo a) {
		return super.salvar(a);
	}

	public Aditivo consultar(Long codigo) {
		return super.pesquisarPorId(codigo);
	}
	
	public List<Aditivo> listar() {
		return super.todos();
	}
	
	public List<Aditivo> listarOrdenado(){
		
		String sqlQuery  = "from Aditivo order by id" ;

		return  super.listPesq(sqlQuery);
		
	}	
	
	public List<Aditivo> pesquisarAditivo(Aditivo resgate, String ano) throws ParseException{
		//public void pesquisarAditivo(Aditivo resgate, String ano) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateInString = "01-01-"+ano;
		String dateInString2 = "31-12-"+ano;
		Date datainicio = sdf.parse(dateInString);
		Date datafim = sdf.parse(dateInString2);
		System.out.println(datainicio);
		System.out.println(datafim);
		
		String sqlQuery  = "from Aditivo r" +
				" where 1 =1 ";

		final Map<String, Object> parameters = new HashMap<String, Object>();
					
		if(ano != null) {			
			sqlQuery += " and date(datapag) >= :incini and date(datapag) <= :incfim  "  ;
			parameters.put("incini", datainicio);
			parameters.put("incfim", datafim);
		}
		return null;
	}
}
