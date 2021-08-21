package com.company;

public class FamiliarFilho extends Familiar{

    public FamiliarFilho(Familiar superior, Boolean vivo)
    {
        listaHeranca.add(TipoHerancaFilho.getTipoHerancaFilho());
        listaHeranca.add(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());
        setFamiliarSuperior(superior);
        this.vivo = vivo;
    }
    @Override
    public String getDescricaoFamiliar() {
        return "Filho";
    }
}
