package br.com.luscaanasta.math;



public class SimpleMath {
	
	public Double sum(Double n1, Double n2) {
			
		return n1 + n2;
	}
	
	public Double sub(Double n1, Double n2) {
	
		return n1 - n2;
	}
	
	public Double div(Double n1, Double n2) {
	
		return n1/n2;
	}
	
	public Double multi(Double n1, Double n2) {
	
		return n1*n2;
	}
	
	public Double mean(Double n1, Double n2) {
			
		Double m = (n1+n2)/2;
		return m;
	}
	
	public Double squareRoot(Double n1) {
			
		Double r = java.lang.Math.sqrt(n1);
		return r;
	}
}
