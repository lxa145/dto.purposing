package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class Asistencias {
    @JsonProperty("cod_asistencia")
    private CodAsistencia codAsistencia;


    @JsonProperty("deuda_total")
    private Double deudaTotal;
    @JsonProperty("deuda_ven_c_garant_a")
    private Double deudaVenCgarantA;
    @JsonProperty("deuda_tot_c_garant_a")
    private Double deudaTotCgarantA;
    @JsonProperty("deuda_ven_c_garant_b_prev")
    private Double deudaVenCgarantBprev;
    @JsonProperty("deuda_tot_c_garant_b_prev")
    private Double deudaTotCgarantBprev;
    @JsonProperty("deuda_ven_c_garant_b_no_prev")
    private Double deudaVenCgarantBnoPrev;
    @JsonProperty("deuda_tot_c_garant_b_no_prev")
    private Double deudaTotCgarantBnoPrev;
    @JsonProperty("deuda_ven_s_garant_prev")
    private Double deudaVenSgarantPrev;
    @JsonProperty("deuda_tot_s_garant_prev")
    private Double deudaTotSgarantPrev;
    @JsonProperty("deuda_ven_s_garant_no_prev")
    private Double deudaVenSgarantNoPrev;
    @JsonProperty("deuda_tot_s_garant_no_prev")
    private Double deudaTotSgarantNoPrev;
    @JsonProperty("prev_min_cred_adic")
    private Double prevMinCredAdic;
    @JsonProperty("financ_mipymes")
    private Double financMipymes;
    @JsonProperty("ult_refinanc_fh")
    private Double ultRefinancFh;

    public CodAsistencia getCodAsistencia() {
        return codAsistencia;
    }

    public void setCodAsistencia(CodAsistencia codAsistencia) {
        this.codAsistencia = codAsistencia;
    }

    public Double getDeudaTotal() {
        return deudaTotal;
    }

    public void setDeudaTotal(Double deudaTotal) {
        this.deudaTotal = deudaTotal;
    }

    public Double getDeudaVenCgarantA() {
        return deudaVenCgarantA;
    }

    public void setDeudaVenCgarantA(Double deudaVenCgarantA) {
        this.deudaVenCgarantA = deudaVenCgarantA;
    }

    public Double getDeudaTotCgarantA() {
        return deudaTotCgarantA;
    }

    public void setDeudaTotCgarantA(Double deudaTotCgarantA) {
        this.deudaTotCgarantA = deudaTotCgarantA;
    }

    public Double getDeudaVenCgarantBprev() {
        return deudaVenCgarantBprev;
    }

    public void setDeudaVenCgarantBprev(Double deudaVenCgarantBprev) {
        this.deudaVenCgarantBprev = deudaVenCgarantBprev;
    }

    public Double getDeudaTotCgarantBprev() {
        return deudaTotCgarantBprev;
    }

    public void setDeudaTotCgarantBprev(Double deudaTotCgarantBprev) {
        this.deudaTotCgarantBprev = deudaTotCgarantBprev;
    }



    public Double getDeudaVenCgarantBnoPrev() {
        return deudaVenCgarantBnoPrev;
    }

    public void setDeudaVenCgarantBnoPrev(Double deudaVenCgarantBnoPrev) {
        this.deudaVenCgarantBnoPrev = deudaVenCgarantBnoPrev;
    }

    public Double getDeudaTotCgarantBnoPrev() {
        return deudaTotCgarantBnoPrev;
    }

    public void setDeudaTotCgarantBnoPrev(Double deudaTotCgarantBnoPrev) {
        this.deudaTotCgarantBnoPrev = deudaTotCgarantBnoPrev;
    }

    public Double getDeudaVenSgarantPrev() {
        return deudaVenSgarantPrev;
    }

    public void setDeudaVenSgarantPrev(Double deudaVenSgarantPrev) {
        this.deudaVenSgarantPrev = deudaVenSgarantPrev;
    }

    public Double getDeudaTotSgarantPrev() {
        return deudaTotSgarantPrev;
    }

    public void setDeudaTotSgarantPrev(Double deudaTotSgarantPrev) {
        this.deudaTotSgarantPrev = deudaTotSgarantPrev;
    }

    public Double getDeudaVenSgarantNoPrev() {
        return deudaVenSgarantNoPrev;
    }

    public void setDeudaVenSgarantNoPrev(Double deudaVenSgarantNoPrev) {
        this.deudaVenSgarantNoPrev = deudaVenSgarantNoPrev;
    }

    public Double getDeudaTotSgarantNoPrev() {
        return deudaTotSgarantNoPrev;
    }

    public void setDeudaTotSgarantNoPrev(Double deudaTotSgarantNoPrev) {
        this.deudaTotSgarantNoPrev = deudaTotSgarantNoPrev;
    }

    public Double getPrevMinCredAdic() {
        return prevMinCredAdic;
    }

    public void setPrevMinCredAdic(Double prevMinCredAdic) {
        this.prevMinCredAdic = prevMinCredAdic;
    }

    public Double getFinancMipymes() {
        return financMipymes;
    }

    public void setFinancMipymes(Double financMipymes) {
        this.financMipymes = financMipymes;
    }

    public Double getUltRefinancFh() {
        return ultRefinancFh;
    }

    public void setUltRefinancFh(Double ultRefinancFh) {
        this.ultRefinancFh = ultRefinancFh;
    }

    @Override
    public String toString() {
        return "Asistencias [codAsistencia=" + codAsistencia + ", deudaTotal="
                + deudaTotal + ", deudaVenCgarantA=" + deudaVenCgarantA
                + ", deudaTotCgarantA=" + deudaTotCgarantA
                + ", deudaVenCgarantBprev=" + deudaVenCgarantBprev
                + ", deudaTotCgarantBprev=" + deudaTotCgarantBprev
                + ", deudaVenCgarantBnoPrev=" + deudaVenCgarantBnoPrev
                + ", deudaTotCgarantBnoPrev=" + deudaTotCgarantBnoPrev
                + ", deudaVenSgarantPrev=" + deudaVenSgarantPrev
                + ", deudaTotSgarantPrev=" + deudaTotSgarantPrev
                + ", deudaVenSgarantNoPrev=" + deudaVenSgarantNoPrev
                + ", deudaTotSgarantNoPrev=" + deudaTotSgarantNoPrev
                + ", prevMinCredAdic=" + prevMinCredAdic + ", financMipymes="
                + financMipymes + ", ultRefinancFh=" + ultRefinancFh + "]";
    }



}
