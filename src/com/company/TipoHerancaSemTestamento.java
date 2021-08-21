package com.company;

public class TipoHerancaSemTestamento implements TipoHeranca{
    private static TipoHerancaSemTestamento tipoHerancaSemTestamento = new TipoHerancaSemTestamento();

    private TipoHerancaSemTestamento() {};

    public static TipoHerancaSemTestamento getTipoHerancaSemTestamento(){
        return tipoHerancaSemTestamento;
    }
}
