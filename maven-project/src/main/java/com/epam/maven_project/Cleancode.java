package com.epam.maven_project;

public class Cleancode {
	public double sinterest(double p,double t,double r) {
		double si;
		si=(p*t*r)/100;
		return si;
	}
	public double cinterest(double p,double t,double r) {
		double ci;
		ci=p*Math.pow(1.0+r/100.0,t)-p;
		return ci;
	}
}
