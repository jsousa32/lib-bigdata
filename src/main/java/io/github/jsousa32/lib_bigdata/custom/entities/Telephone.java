package io.github.jsousa32.lib_bigdata.custom.entities;

public class Telephone {
    
    private String telephone;

    private Boolean isMain;

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }
    
    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Boolean getIsMain() {
        return isMain;
    }
}
