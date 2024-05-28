/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone;

import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import funcionalidades.Telefone;

/**
 *
 * @author luizf
 */
public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando para um numero");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada");
    }

    @Override
    public void caixapostal() {
        System.out.println("Ligando caixa postal");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma musica");
       
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma musica na lista");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Adicionando nova guia");
    }

    @Override
    public void AtualziarPagina() {
        System.out.println("Atualizando a página");
    }
    
}
