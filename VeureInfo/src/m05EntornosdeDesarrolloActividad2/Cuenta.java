package m05EntornosdeDesarrolloActividad2;

import java.util.function.BooleanSupplier;

public class Cuenta {

	public double saldoInicial; // cuenta nueva con saldo 0
	public double ingresaSaldo;
	public boolean resposta;
	public double salde;
	
	//public Cuenta() 
	public double getSaldoInicial() {
		return this.saldoInicial;
	}

	public void ingresaSaldoa100(double x) {
		//double salde = 100;
		this.ingresaSaldo = this.saldoInicial + x;
	}
	
	public double getIngresoSaldoa100() {
		return this.ingresaSaldo;
	}
	
	public void ingresaSaldoa3000(double x) {
		//double salde = 3000;
		//return this.saldoInicial = this.saldoInicial + salde;
		this.ingresaSaldo = this.ingresaSaldo + x;
	}
	
	public double getIngresaSaldoa3000() {
		return this.ingresaSaldo;
	}
	
	//metodo de saldo a 3100 (con una cuenta con fondos previos)
	public void setIngresaSaldoa3100(double x) {
		this.ingresaSaldo = 100 + x;
			//if (cuenta.ingresaSaldo < 0) {
				//resposta = true;
			//}
	}
	
	public double getIngresaSalda3100() {
		return this.ingresaSaldo;
	}
	
	/////////////////////////
/*	public void setSaldoNegativo(double x) {
		
		if (x > 0) {
			this.resposta = true;
		} else {
			this.resposta = false;
		}
	}
	
	public boolean getSaldoNegativo() {
		return this.resposta;
	}*/
////////////////////////////////////
	public void saldoNegativoesCero(double x) {
		if (x < 0) {
			this.ingresaSaldo = 0.0;
		} else {
			this.ingresaSaldo = x;
		}
	}
	
	// metodo de saldo negativo es igual a cero
	public double getSaldoNegativoesCero() {
		return this.ingresaSaldo;
	}
	
	// metodo para limitar a dos los decimales
	public void setCuentaDecimales(double x) {
		this.ingresaSaldo = Math.round(x * 100) / 100d; 
	}
	
	public double getCuentaDecimales() {
		return this.ingresaSaldo;
	}
	
	public void setCantidadMaxima(double x) {
		if (x <= 6000.00) {
			this.ingresaSaldo = x;
		} else {
			this.ingresaSaldo = 0.0;
		}
	}
	
	public double getCantidadMaxima() {
		return this.ingresaSaldo;
	}
	
	// metodos de retiradas
	
	public void setRetiraSaldo(double x, double y) {
		this.salde = y;
		this.ingresaSaldo = this.salde - x;
	}
	
	public double getRetiraSaldo() {
		return this.ingresaSaldo;
	}
							// double y= saldo del que dispone, double x= saldo que retira
	public void setRetiroMayorqueSaldo(double y, double x) {
		this.salde = y;
		if(salde < x) {
			this.ingresaSaldo = this.salde;
		} else {
			this.ingresaSaldo = this.salde - x;
		}
	}
	
	public double getRetiroMayorqueSaldo() {
		return this.ingresaSaldo;
	}
	
	public void setRetiroCantidadNegativa(double y, double x) {
		this.salde = y;
		if (x < 0) {
			this.ingresaSaldo = this.salde;
		} else {
			this.ingresaSaldo = this.salde - x;
		}
	}
	
	public double getRetiroCantidadNegativa() {
		return this.ingresaSaldo;
	}
	
	public void setRetiroMaxDosDecimales(double y, double x) {
		this.salde = y;
		double z = Math.round(x * 100) / 100;
		this.ingresaSaldo = y - z;
	}
	
	public double getRetiroMaxDosDecimales() {
		return this.ingresaSaldo;
	}
	
	public void setRetiroMaxEnCuenta(double y, double x) {
		this.salde = y;
		if (x > 6000.00) {
			this.ingresaSaldo = this.salde;
		} else {
			this.ingresaSaldo = this.salde - x;
		}
	}
	
	public double getRetiroMaxEnCuenta() {
		return this.ingresaSaldo;
	}
}