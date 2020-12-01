package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class Cbu {


    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("cbu")
    private Long cbu;


    public Integer getInfoFh() {
        return infoFh;
    }

    public void setInfoFh(Integer infoFh) {
        this.infoFh = infoFh;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }


    @Override
    public String toString() {
        return "Cbu [infoFh=" + infoFh + ", cbu=" + cbu + "]";
    }



}
