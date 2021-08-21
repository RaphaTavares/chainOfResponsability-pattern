package com.company.test;

import com.company.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HerancaTest {

    //Para efeitos da atividade, considerei que caso uma herança fosse especificada para um "Neto", por exemplo, e o mesmo não estivesse vivo,
    //mesmo que houvesse um irmão ou um filho, a herança iria para o governo

    @Test
    void deveRetornarFilhoParaHerancaFilhoComFamilia(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaFilho.getTipoHerancaFilho());

        assertEquals("Filho", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarFilhoParaHerancaFilhoSemFamilia(){
        FamiliarNeto neto = new FamiliarNeto(null, false);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, false);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaFilho.getTipoHerancaFilho());

        assertEquals("Filho", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarGovernoParaHerancaFilhoSemFilho(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, false);

        Heranca heranca = new Heranca(TipoHerancaFilho.getTipoHerancaFilho());

        assertEquals("nenhum familiar elegível vivo, herança irá para o governo", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarIrmaoParaHerancaIrmaoComFamilia(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaIrmao.getTipoHerancaIrmao());

        assertEquals("Irmão", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarIrmaoParaHerancaIrmaoSemFamilia(){
        FamiliarNeto neto = new FamiliarNeto(null, false);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, false);

        Heranca heranca = new Heranca(TipoHerancaIrmao.getTipoHerancaIrmao());

        assertEquals("Irmão", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarGovernoParaHerancaIrmaoSemIrmao(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, false);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaIrmao.getTipoHerancaIrmao());

        assertEquals("nenhum familiar elegível vivo, herança irá para o governo", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarNetoParaHerancaNetoComFamilia(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaNeto.getTipoHerancaNeto());

        assertEquals("Neto", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarNetoParaHerancaNetoSemFamilia(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, false);
        FamiliarFilho filho = new FamiliarFilho(irmao, false);

        Heranca heranca = new Heranca(TipoHerancaNeto.getTipoHerancaNeto());

        assertEquals("Neto", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarGovernoParaHerancaNetosemNeto(){
        FamiliarNeto neto = new FamiliarNeto(null, false);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaNeto.getTipoHerancaNeto());

        assertEquals("nenhum familiar elegível vivo, herança irá para o governo", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarFilhoParaHerancaSemTestamento(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, true);

        Heranca heranca = new Heranca(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());

        assertEquals("Filho", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarIrmaoParaHerancaSemTestamento(){
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, true);
        FamiliarFilho filho = new FamiliarFilho(irmao, false);

        Heranca heranca = new Heranca(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());

        assertEquals("Irmão", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarNetoParaHerancaSemTestamento() {
        FamiliarNeto neto = new FamiliarNeto(null, true);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, false);
        FamiliarFilho filho = new FamiliarFilho(irmao, false);

        Heranca heranca = new Heranca(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());

        assertEquals("Neto", filho.receberHeranca(heranca));
    }

    @Test
    void deveRetornarGovernoParaHerancaSemTestamento() {
        FamiliarNeto neto = new FamiliarNeto(null, false);
        FamiliarIrmao irmao = new FamiliarIrmao(neto, false);
        FamiliarFilho filho = new FamiliarFilho(irmao, false);

        Heranca heranca = new Heranca(TipoHerancaSemTestamento.getTipoHerancaSemTestamento());

        assertEquals("nenhum familiar elegível vivo, herança irá para o governo", filho.receberHeranca(heranca));
    }
}
