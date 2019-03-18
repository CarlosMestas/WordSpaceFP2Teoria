public class DemoFraccion {
	public static  void main(String []args) {
		Fraccion f1 = new Fraccion();
		f1.setNumerador(1);
		f1.setDenominador(2);
		
		Fraccion f2 = new Fraccion();
		f2.setNumerador(1);
		f2.setDenominador(4);
		
		Fraccion f3 = new Fraccion();
		f3.setNumerador(1);
		f3.setDenominador(2);
		
		Fraccion f4 = new Fraccion();
		f4.setNumerador(2);
		f4.setDenominador(5);
		
		Fraccion f5 = new Fraccion();
		f5.setNumerador(2);
		f5.setDenominador(3);
		
		Fraccion f6 = new Fraccion();
		
		f6=f1.sumar(f2).restar(f3).multiplicar(f4).dividir(f5);
		System.out.println(f6.toString());
				
	}
}