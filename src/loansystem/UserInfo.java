/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loansystem;

/**
 *
 * @author kiw
 */
public class UserInfo  {
    
private String Fname;
private Float Amount;
private Integer Installment;
private Float IntRate;

    /**
     * @return the Fname
     */
    public String getFname() {
        return Fname;
    }

    /**
     * @param Fname the Fname to set
     */
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    /**
     * @return the Amount
     */
    public Float getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(Float Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the Installment
     */
    public Integer getInstallment() {
        return Installment;
    }

    /**
     * @param Installment the Installment to set
     */
    public void setInstallment(Integer Installment) {
        this.Installment = Installment;
    }

    /**
     * @return the IntRate
     */
    public Float getIntRate() {
        return IntRate;
    }

    /**
     * @param IntRate the IntRate to set
     */
    public void setIntRate(Float IntRate) {
        this.IntRate = IntRate;
    }


    
}
