package model;

import java.math.BigInteger;


public class rsaGM {
	
	private BigInteger e1;
	private BigInteger e2;
	private BigInteger n;
	private BigInteger C1;
	private BigInteger C2;
	private int base;
	
	public rsaGM(String E1,String E2,String c1,String c2,String N,int base) {
		this.e1 = new BigInteger(E1,base);
		this.e2 = new BigInteger(E2,base);
		this.n = new BigInteger(N,base);
		this.C1 = new BigInteger(c1,base);
	    this.C2 = new BigInteger(c2,base);
	    this.base = base;
	}
		
	public  BigInteger[] extendgcd(BigInteger a,BigInteger b){
		BigInteger[] result = new BigInteger[3];
		if(b.equals(BigInteger.ZERO)){
			result[1] = BigInteger.ONE;
			result[2] = BigInteger.ZERO;
			result[0] = a;
			return result;
		}
		result = extendgcd(b,a.remainder(b));
		BigInteger temp=result[1];
		result[1]=result[2];
		result[2]=temp.subtract(a.divide(b).multiply(result[1]));
		return result;
	}
	public  BigInteger[] inverse(BigInteger a,BigInteger b) {
		BigInteger[] result =new BigInteger[3];
		result = extendgcd(a, b);
		if(result[1].compareTo(BigInteger.ZERO)<0) {
			result[1] = result[1].mod(b);
		}
		return result;
	}
	public  String RSAgm() {
		BigInteger[] result = new BigInteger[3];
		BigInteger[] result1 = new BigInteger[3];
		BigInteger[] result2 = new BigInteger[3];
		result = extendgcd(e1, e2);
		if(!result[0].equals(BigInteger.ONE)) {
			return "-2";
		}
		if(result[1].compareTo(BigInteger.ZERO)<0) {
			result[1] = result[1].negate();
			result1 = inverse(C1, n);
			BigInteger m = ((result1[1].modPow(result[1], n)).multiply(C2.modPow(result[2], n))).mod(n);
			//System.out.println(m.toString());
			if (base==16) {
				return m.toString(16).toUpperCase();
			}
			return m.toString().toUpperCase();
		}else if (result[2].compareTo(BigInteger.ZERO)<0) {
			result[2] = result[2].negate();
			result2 = inverse(C2, n);
			BigInteger m = ((C1.modPow(result[1], n)).multiply(result2[1].modPow(result[2], n))).mod(n);
			//System.out.println(m.toString());
			if (base==16) {
				return m.toString(16).toUpperCase();
			}
			return m.toString().toUpperCase();
		}else {
			return "-1";
		}
	}
	
	public BigInteger getE1() {
		return e1;
	}
	public void setE1(BigInteger e1) {
		this.e1 = e1;
	}
	public BigInteger getE2() {
		return e2;
	}
	public void setE2(BigInteger e2) {
		this.e2 = e2;
	}
	public BigInteger getN() {
		return n;
	}
	public void setN(BigInteger n) {
		this.n = n;
	}
	public BigInteger getC1() {
		return C1;
	}
	public void setC1(BigInteger c1) {
		C1 = c1;
	}
	public BigInteger getC2() {
		return C2;
	}
	public void setC2(BigInteger c2) {
		C2 = c2;
	}

	
}
