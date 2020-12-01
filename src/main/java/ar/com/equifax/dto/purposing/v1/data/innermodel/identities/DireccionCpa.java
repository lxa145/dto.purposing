package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DireccionCpa {

    @JsonProperty("cpa")
    private String cpa;
    @JsonProperty("coord_x")
    private String coordx;
    @JsonProperty("coord_y")
    private String coordy;


    public String getCpa() {
        return cpa;
    }

    public void setCpa(String cpa) {
        this.cpa = cpa;
    }

    public String getCoordx() {
        return coordx;
    }

    public void setCoordx(String coordx) {
        this.coordx = coordx;
    }

    public String getCoordy() {
        return coordy;
    }

    public void setCoordy(String coordy) {
        this.coordy = coordy;
    }


    @Override
    public String toString() {
        return "DireccionCpa [cpa=" + cpa + ", coordx=" + coordx + ", coordy="
                + coordy + "]";
    }



}
