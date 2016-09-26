package br.semicheche.mdb;

import java.util.Date;

import javax.ejb.EJB;

import br.semicheche.dao.LogDao;
import br.semicheche.entities.Log;

public abstract class AbstractMdb {
	
	@EJB
	private LogDao ldao;
	
	public void registro(String nomeMdb, String msg) {
		
		Log log = new Log(nomeMdb, new Date(), msg);
		
		ldao.create(log);
	}

}
