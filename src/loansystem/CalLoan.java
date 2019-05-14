/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loansystem;

/**
 *
 * @author kiwzu
 */
public class CalLoan implements java.io.Serializable {

private String Fname;    
private Integer InstallmentNo;
private Float PrevPrincipal;
private String IntRate;
private Float InstallmentAmt;
private Float InstallmentPrincipal;
private Float InstallmentInt;
private Float RemainingPrincipal;
private String PayDate;



    /**
     * @return the InstallmentNo
     */
    public Integer getInstallmentNo() {
        return InstallmentNo;
    }

    /**
     * @param InstallmentNo the InstallmentNo to set
     */
    public void setInstallmentNo(Integer InstallmentNo) {
        this.InstallmentNo = InstallmentNo;
    }

    /**
     * @return the PrevPrincipal
     */
    public Float getPrevPrincipal() {
        return PrevPrincipal;
    }

    /**
     * @param PrevPrincipal the PrevPrincipal to set
     */
    public void setPrevPrincipal(Float PrevPrincipal) {
        this.PrevPrincipal = PrevPrincipal;
    }

    /**
     * @return the InstallmentAmt
     */
    public Float getInstallmentAmt() {
        return InstallmentAmt;
    }

    /**
     * @param InstallmentAmt the InstallmentAmt to set
     */
    public void setInstallmentAmt(Float InstallmentAmt) {
        this.InstallmentAmt = InstallmentAmt;
    }

    /**
     * @return the InstallmentPrincipal
     */
    public Float getInstallmentPrincipal() {
        return InstallmentPrincipal;
    }

    /**
     * @param InstallmentPrincipal the InstallmentPrincipal to set
     */
    public void setInstallmentPrincipal(Float InstallmentPrincipal) {
        this.InstallmentPrincipal = InstallmentPrincipal;
    }

    /**
     * @return the InstallmentInt
     */
    public Float getInstallmentInt() {
        return InstallmentInt;
    }

    /**
     * @param InstallmentInt the InstallmentInt to set
     */
    public void setInstallmentInt(Float InstallmentInt) {
        this.InstallmentInt = InstallmentInt;
    }

    /**
     * @return the RemainingPrincipal
     */
    public Float getRemainingPrincipal() {
        return RemainingPrincipal;
    }

    /**
     * @param RemainingPrincipal the RemainingPrincipal to set
     */
    public void setRemainingPrincipal(Float RemainingPrincipal) {
        this.RemainingPrincipal = RemainingPrincipal;
    }

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
     * @return the PayDate
     */
    public String getPayDate() {
        return PayDate;
    }

    /**
     * @param PayDate the PayDate to set
     */
    public void setPayDate(String PayDate) {
        this.PayDate = PayDate;
    }

    /**
     * @return the IntRate
     */
    public String getIntRate() {
        return IntRate;
    }


   
    public void setIntRate(String IntRate) {
        this.IntRate = IntRate;
    }
}
