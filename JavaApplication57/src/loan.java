
public final class loan {
    
    //Constractor
    
    public loan (double prencipal,int duration, double annualIntrestRate ){
        this.setPrecipal(prencipal);
        this.setDuration(duration);
         this.setAnnualIntrstRate(annualIntrestRate);
        
        
    }
    
    
    
    
    private double Precipal;

    public double getPrecipal() {
        return Precipal;
    }

    public void setPrecipal(double Precipal) {
        this.Precipal =Math.max(Precipal, 0);
    }

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.max(duration,0);
// Annual Intrest
    }
    private double annualIntrestRate;

    public double getAnnualIntrestRate() {
        return annualIntrestRate;
    }

    public void setAnnualIntrstRate(double annualIntrestRate) {
        this.annualIntrestRate = Math.max(annualIntrestRate, 0);
    }
// Monthly Intrest Rate 
    public double getMonthlyIntrestRate(){
        return this.getAnnualIntrestRate()/12;
    }
// Monthly Payment 
    
    public double getMonthlyPayments(){
        double P=this.getPrecipal();
        double J=this.getMonthlyIntrestRate()/100;
        int n = this.getDuration();
        double M = P*J/(1-Math.pow(1+J,-n));
        return M;
        //return this.getMonthlyIntrestRate()/(1- Math.pow(1+this.getMonthlyIntrestRate(),-this.getDuration()));
    }
    // Total Payment
    public double getTotalPayment(){
       return getMonthlyPayments()*this.getDuration();
    }
    // Total intrest
    public double getTotalIntrest(){
        return this.getTotalPayment()-this.getPrecipal();}
    
    // Annual Intrest
    public double getMonthlyIntrest(){
            return this.getTotalIntrest()/12;
    }
    public double getAnnualIntrst(){
        return 12*this.getMonthlyIntrest();
    }
}
