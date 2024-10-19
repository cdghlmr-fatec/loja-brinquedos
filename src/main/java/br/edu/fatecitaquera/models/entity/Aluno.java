package br.edu.fatecitaquera.models.entity;

import java.time.LocalDate;  // Melhor usar LocalDate
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_aluno")
public class Aluno {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ra;
    
    @Column(name="nome_aluno", nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String email;
    
    @Column(name="data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    
    private String endereco;
    private String periodo;
    
    // Construtor padrão (necessário para o JPA)
    public Aluno() {
    }

    // Construtor sem 'ra' porque é gerado automaticamente
    public Aluno(String nome, String email, LocalDate dataNascimento, String endereco, String periodo) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.periodo = periodo;
    }

    // Getters e Setters
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
