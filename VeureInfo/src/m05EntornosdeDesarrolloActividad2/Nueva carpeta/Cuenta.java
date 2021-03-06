package m05EntornosdeDesarrolloActividad2;

import java.util.function.BooleanSupplier;

public class Cuenta {

	public double saldoInicial; // cuenta nueva con saldo 0
	public double ingresaSaldo;
	public boolean resposta;
	public double salde;
	
	//public Cuenta() 
	public double getSaldoInicial() {
		return this.saldoInicial; // por defecto el valor de la variable es cero asi que preferi no definirlo
	} 

	public void ingresaSaldoa100(double x) {
		this.ingresaSaldo = this.saldoInicial + x;
	}
	
	public double getIngresoSaldoa100() {
		return this.ingresaSaldo;
	}
	
	public void ingresaSaldoa3000(double x) {
		this.ingresaSaldo = this.ingresaSaldo + x;
	}
	
	public double getIngresaSaldoa3000() {
		return this.ingresaSaldo;
	}
	
	//metodo de saldo a 3100 (con una cuenta con fondos previos)
	public void setIngresaSaldoa3100(double x, double y) {
		this.ingresaSaldo = y + x;		
	}
	
	public double getIngresaSalda3100() {
		return this.ingresaSaldo;
	}
	
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
		if(this.salde < x) {
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
	
	//////////////////  codido 3era apartado, nuevas cuentas
	public void setTransfiereCuentas(double y, double x, double z) {
		this.salde = y; // saldo inicial cuenta 1 = 500
		this.saldoInicial = z; // saldo inicial cuenta 2 = 50
		this.ingresaSaldo = x; // saldo a transferir
		
		if(this.salde > this.ingresaSaldo) {
			this.salde = this.salde - this.ingresaSaldo;
			this.saldoInicial = this.saldoInicial + this.ingresaSaldo;
		} else {
			this.salde = this.salde;
			this.saldoInicial = this.saldoInicial;
		}
	}
	
	public double getSaldoCuenta1() {
		return this.salde;
	}
	
	public double getSaldoCuenta2() {
		return this.saldoInicial;
	}
	
	public void setSaldoNegativo(double y, double x, double z) {
		this.salde = y;
		this.saldoInicial = z;
		this.ingresaSaldo = x;
			if(x < 0) {
				this.salde = this.salde;
				this.saldoInicial = this.saldoInicial;
			} else {
				this.salde = this.salde - this.ingresaSaldo;
				this.saldoInicial = this.saldoInicial + this.ingresaSaldo;
			}
	}
	
	public double getSaldoNegativo() {
		return this.salde;
	}
	
	public double getSaldoNegativoCuenta2() {
		return this.saldoInicial;
	}
	
	public void setTransferenciaLimite(double y, double x, double z) {
		this.salde = y;
		this.saldoInicial = z;
		
			if((x <= 3000) && (this.salde > x) ) {
				this.salde = this.salde - x;
				this.saldoInicial = this.saldoInicial + x;
			} else {
				this.salde = this.salde;
				this.saldoInicial = this.saldoInicial;
			}
	}
	
	public double getTransferenciaLimite() {
		return this.salde;
	}
	
	public double getTransferenciaLimiteCuenta2() {
		return this.saldoInicial;
	}
	
	public void setTransferenciasVariasLimiteDiario(double y, double x, double z, double b) {
		//double transfTotal = x + b; 
		this.salde = y;
		this.saldoInicial = z;
		//while (transfTotal <= 3000) {
			if((x > 0) && (x < this.salde)) {
				this.salde = this.salde - x;
				this.saldoInicial = this.saldoInicial + x;
			} else if ((x + b <= 3000)){
				this.salde = this.salde - x;
				this.saldoInicial = this.saldoInicial + x;
			}
		}
		
	//}
	
	public double getTransferenciasVariasLimite() {
		return this.salde;
	}
	
	public double getTransferenciasVariasCuenta2() {
		return this.saldoInicial;
	}
}