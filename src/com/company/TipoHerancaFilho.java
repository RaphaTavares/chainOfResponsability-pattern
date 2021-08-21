package com.company;

public class TipoHerancaFilho implements TipoHeranca{

    private static TipoHerancaFilho tipoHerancaFilho = new TipoHerancaFilho();

    private TipoHerancaFilho() {};

    public static TipoHerancaFilho getTipoHerancaFilho() {
        return tipoHerancaFilho;
    }
}
