package cuentas;

public class CCuenta {


    private String nombre; /** Nombre de la cuenta */
    private String cuenta; /** Número de la cuenta */
    private double saldo; /** Saldo disponible*/
    private double tipoInteres; /**Tipo de interés*/
	/**
     * Método constructor sin parámetros
     */
    public CCuenta()
    {
    }
    /**
     * Método constructor con parámetros
     * @param nom Nombre de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo disponible
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Obtener nombre
     * @return nombre
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * Editar nombre
     * @param nombre Nombre de la cuenta
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtener número de cuenta
	 * @return número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Editar número de cuenta
	 * @param cuenta Número de la cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Obtener saldo
	 * @return saldo disponible
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Editar saldo
	 * @param saldo Saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Obtener tipo de interes
	 * @return tipo de interes
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Editar tipo de interes
	 * @param tipoInterés tipo de interes
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	/**
	 * Devuelve el saldo que hay en la cuenta
	 * @return saldo disponible
	 */
	public double estado()
    {
        return saldo;
    }
	/**
	 * Indicamos cuánto dinero se quiere ingresar
	 * @param cantidad Cantidad de dinero
	 * @throws Exception Si dinero a ingresar es menor que 0
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
   /**
    * Indicamos dinero a retirar de la cuenta
    * @param cantidad Cantidad de dinero
    * @throws Exception Si la cantidad es 0 o menor, o si el saldo es menor que la cantidad a retirar
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
