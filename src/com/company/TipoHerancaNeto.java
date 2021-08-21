package com.company;

public class TipoHerancaNeto implements TipoHeranca{
    private static TipoHerancaNeto tipoHerancaNeto = new TipoHerancaNeto();

    private TipoHerancaNeto() {};

    public static TipoHerancaNeto getTipoHerancaNeto() {
        return tipoHerancaNeto;
    }
}
