/**Clase fraccion
 * @author Carlos Alberto Mestas Escarcena
 * @version 2.0 creada el 12 de octubre del 2018
 */
public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	/**
	 *Creacion del objeto fraccion sin datos 
	 */
	Fraccion(){
	}
	Fraccion(int num,int den){
		this.setNumerador(num);
		this.setDenominador(den);
	}
	public int getNumerador() {
		return numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setNumerador(int num) {
		numerador=num;
	}
	public void setDenominador(int den) {
		denominador=den;
	}
	public Fraccion sumar(Fraccion f2) {
		Fraccion suma=new Fraccion();
		suma.setNumerador(numerador*f2.getDenominador()+denominador*f2.getNumerador());
		suma.setDenominador(denominador*f2.getDenominador());
		return suma.simplificar();
	}
	public Fraccion restar(Fraccion f2) {
		Fraccion resta=new Fraccion();
		resta.setNumerador(this.getNumerador()*f2.getDenominador()-this.getDenominador()*f2.getNumerador());
		resta.setDenominador(this.getDenominador()*f2.getDenominador());
		return resta.simplificar();
	}
	public Fraccion multiplicar(Fraccion f2) {
		Fraccion m=new Fraccion();
		m.setNumerador(this.getNumerador()*f2.getNumerador());
		m.setDenominador(this.getDenominador()*f2.getDenominador());
		return m.simplificar();
	}
	public Fraccion dividir(Fraccion f2) {
		Fraccion div=new Fraccion();
		div.setNumerador(this.getNumerador()*f2.getDenominador());
		div.setDenominador(this.getDenominador()*f2.getNumerador());
		return div.simplificar();
	}
	public Fraccion simplificar() {
		int s=mcd();
		Fraccion sim=new Fraccion(this.numerador/s,this.denominador/s);
		return sim;
	}
	private int mcd() {
		int a=Math.abs(numerador);
		int b=Math.abs(denominador);
		if(b==0) {
			return a;
		}
		int r;
		while(b!=0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public String toString() {
		return numerador+"/"+denominador;
	}
}