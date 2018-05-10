package com.anuncios.pecas.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.anuncios.pecas.domain.PagamentoComBoleto;

@Service
public class BoletoService {
	
	public void peencherPgamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
