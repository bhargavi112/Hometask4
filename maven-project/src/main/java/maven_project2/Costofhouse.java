package maven_project2;

public class Costofhouse {
	public double estimatedcost(String mat,double area,boolean automate) {
		double cost=0;
		if(mat=="standardmat" && automate==false)
			cost=area*1200;
		else if(mat=="abovestdmat" && automate==false)
			cost=area*1500;
		else if(mat=="highstdmat" && automate==false)
			cost=area*1800;
		else if(mat=="highstdmat" && automate==true)
			cost=area*2500;
	return cost;
	} 
}
