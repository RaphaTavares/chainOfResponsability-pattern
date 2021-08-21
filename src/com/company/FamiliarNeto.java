package com.company;

public class FamiliarNeto extends Familiar{

    public FamiliarNeto(Familiar superior, Boolean vivo)
    {
        listaHeranca.add(TipoHerancaNeto.getTipoHerancaNeto());
        listaHeranca.add(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());
        setFamiliarSuperior(superior);
        this.vivo = vivo;
    }

    @Override
    public String getDescricaoFamiliar() {
        return "Neto";
    }
}
