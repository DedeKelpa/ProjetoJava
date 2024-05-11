/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class Investidor {
    private String nome, CPF, senha;
    private float saldoReal = 0, saldoBitcoin= 0, saldoEthereum = 0, saldoRipple = 0;
    private ArrayList <String> extrato = new ArrayList<String>();

    public Investidor() {
    }
    public Investidor(String nome, String CPF, String senha){
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
        
    }

    public Investidor(String nome, String CPF, String senha, float saldoReal, float saldoBitcoin, float saldoEthereum, float saldoRipple, ArrayList extrato) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
        this.saldoReal = saldoReal;
        this.saldoBitcoin = saldoBitcoin;
        this.saldoEthereum = saldoEthereum;
        this.saldoRipple = saldoRipple;
        this.extrato = new ArrayList<>();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldoReal() {
        return saldoReal;
    }

    public void setSaldoReal(float saldoReal) {
        this.saldoReal = saldoReal;
    }

    public float getSaldoBitcoin() {
        return saldoBitcoin;
    }

    public void setSaldoBitcoin(float saldoBitcoin) {
        this.saldoBitcoin = saldoBitcoin;
    }

    public float getSaldoEthereum() {
        return saldoEthereum;
    }

    public void setSaldoEthereum(float saldoEthereum) {
        this.saldoEthereum = saldoEthereum;
    }

    public float getSaldoRipple() {
        return saldoRipple;
    }

    public void setSaldoRipple(float saldoRipple) {
        this.saldoRipple = saldoRipple;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }
    


    
    
    
}
