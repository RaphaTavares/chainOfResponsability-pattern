package com.company;

public class TipoHerancaIrmao implements TipoHeranca{
    private static TipoHerancaIrmao tipoHerancaIrmao = new TipoHerancaIrmao();

    private TipoHerancaIrmao() {};

    public static TipoHerancaIrmao getTipoHerancaIrmao() {
        return tipoHerancaIrmao;
    }
}

