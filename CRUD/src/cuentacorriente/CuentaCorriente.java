package cuentacorriente;

/**
	 * 
	 * @author Luisa
	 *
	 */
	public class CuentaCorriente {
		/**
		 * Enumerado con Sexos
		 * @author Luisa
		 *
		 */
		 enum Sexo{
			  FEMENINO, MASCULINO
		 }
		/**
		 * Guarda el DNI del propietario de la cuenta
		 */
		private String DNI;
		/**
		 * Guarda el nombre del propietario de la cuenta
		 */
		private String nombre;
		/**
		 * Guarda el saldo del propietario de la cuenta
		 */
		private double saldo;
		/**
		 * Enumerado de tipo sexo
		 */
		private Sexo sexo;
		
		/**
		 * Constructor con parametros
		 * @param DNI del propietario de la cuenta
		 * @param saldo del propietario de la cuenta
		 */
		public CuentaCorriente(String DNI, double saldo){
			this.DNI = DNI;
			this.saldo = saldo; 	
		}
		
		/**
		 * Constructor con parametros del propietario de la cuenta
		 * @param DNI  del propietario de la cuenta
		 * @param nombre  del propietario de la cuenta
		 * @param saldo  del propietario de la cuenta
		 * @param sexo  del propietario de la cuenta
		 */
		public CuentaCorriente(String DNI, String nombre, double saldo, String sexo){
			this.DNI = DNI;
			this.nombre = nombre;
			this.saldo = saldo; 
			this.sexo = Sexo.valueOf(sexo);
		}
		
		/**
		 * Obtiene el DNI
		 * @return DNI del propietario
		 */
		public String getDNI() {
			return DNI;
		}
	/**
	 * Establece el DNI del propietario
	 * @param recibe por parametro el dNI 
	 */
		public void setDNI(String dNI) {
			DNI = dNI;
		}
	/**
	 * Obtiene el nombre del propietario
	 * @return devuelve el nombre
	 */
		public String getNombre() {
			return nombre;
		}
	/**
	 * Establece el nombre del propietario
	 * @param recibe por parametros el nombre del propietario
	 */
		public void setNombre(String nombre) {
			if (!nombre.isEmpty()) {
				this.nombre = nombre;
			}
		}
	/**
	 * Obtiene el saldo de propietario de la cuenta 
	 * @return
	 */
		public double getSaldo() {
			return saldo;
		}
	/**
	 * Establece el saldo del propietario
	 * @param saldo
	 */
		public void setSaldo(double saldo) {
			if(saldo>0) {
			this.saldo = saldo;
			}
		}
	/**
	 * Obtiene el sexo del propietario
	 * @return
	 */
		public Sexo getSexo() {
			return this.sexo;
		}
		/**
		 * Establece el sexo del propietario
		 * @param Enumerado de tipo Sexo
		 */
		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}
	
		/**
		 * Metodo para retirar dinero de la cuenta
		 * @param cantidad a retirar
		 * @return devulve el saldo actualizado o un error en casi de no poder retirar la cantidad especificada
		 */
		public double sacarDinero(double cantidad) {
			boolean posible=false;
			
			if(this.saldo>cantidad) {
				posible=true;
				saldo -= cantidad;
			}else {
				mostrarError();
			}
			return this.saldo;
		}
		/**
		 * Metodo para añadir una cantidad al saldo de la cuenta del propietario
		 * @param cantidad
		 */
		public void ingresarDinero(double cantidad) {
			saldo+=cantidad;
		}
		/**
		 * Metodo para mostrar error en caso de no ser posible realizar una accion
		 */
		public void mostrarError() {
			System.out.println("Imposible ejecutar la accion deseada.");
		}
		/**
		 * Metodo para mostrar informacion sobre el propietario
		 */

		@Override
		public String toString() {
			String userInfo;
			userInfo = "Usuario: " + nombre + "\nDNI: " + DNI + "\nSaldo: " + saldo +"\nSexo:" + sexo; 
			return userInfo;
		}
		
	}


