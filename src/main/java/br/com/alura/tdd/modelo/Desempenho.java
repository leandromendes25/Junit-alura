package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.20");
		}
	};
	
//Colocar desta forma nos permite evitar varios if else que teriamos q colcoar no reajusteService
	public abstract BigDecimal percentualReajuste();
}
