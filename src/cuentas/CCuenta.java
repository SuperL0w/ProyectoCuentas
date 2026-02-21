package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas de ingreso y retiro.
 * Esta clase forma parte de la tarea de optimización y documentación.
 * * @author Antonio
 * @version 1.0
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Código de cuenta corriente */
    private String cuenta;
    /** Saldo actual disponible en la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto sin parámetros.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * @param nom Nombre del titular
     * @param cue Código de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo disponible en tipo double
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     * * @param cantidad La suma de dinero a añadir al saldo
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de dinero de la cuenta.
     * * @param cantidad La suma de dinero a detraer del saldo
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    // Getters y Setters para mantener el encapsulamiento

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuenta() { return cuenta; }
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getTipoInterés() { return tipoInterés; }
    public void setTipoInterés(double tipoInterés) { this.tipoInterés = tipoInterés; }
}