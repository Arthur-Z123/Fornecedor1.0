/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model.bean;

import static javassist.CtMethod.ConstParameter.integer;
import javax.swing.JOptionPane;

/**
 *
 * @author soni
 */
public class Fornecedor {

    private Integer id;
    private String razaoSocial;
    private String nomeFantasia;
    private String telefone;
    private String email;
    private String gerente;

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.razaoSocial = "efewf";
        fornecedor.nomeFantasia = "wefwef";
        fornecedor.telefone = "wefwef";
        fornecedor.email = "efwef";
        fornecedor.gerente = "efwefwef";
        
        System.out.print(args);
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

}
