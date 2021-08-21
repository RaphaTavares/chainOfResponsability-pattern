package com.company;

import java.util.ArrayList;

public abstract class Familiar {

    //vai ter qual tipo de herança o familiar pode receber
    protected ArrayList listaHeranca = new ArrayList();
    private Familiar familiarSuperior;
    protected Boolean vivo;

    public void setFamiliarSuperior(Familiar familiarSuperior) {
        this.familiarSuperior = familiarSuperior;
    }

    public abstract String getDescricaoFamiliar();

    public String receberHeranca(Heranca heranca){
        if(listaHeranca.contains(heranca.getTipoHeranca()) && this.vivo){
            return getDescricaoFamiliar();
        }
        else{
            if(familiarSuperior != null){
                return familiarSuperior.receberHeranca(heranca);
            }
            else
            {
                return "nenhum familiar elegível vivo, herança irá para o governo";
            }
        }
    }
}
