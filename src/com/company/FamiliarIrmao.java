package com.company;

public class FamiliarIrmao extends Familiar{

    public FamiliarIrmao(Familiar superior, Boolean vivo)
    {
        listaHeranca.add(TipoHerancaIrmao.getTipoHerancaIrmao());
        listaHeranca.add(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());
        setFamiliarSuperior(superior);
        this.vivo = vivo;
    }

    @Override
    public String getDescricaoFamiliar() {
        return "Irmão";
    }
}
