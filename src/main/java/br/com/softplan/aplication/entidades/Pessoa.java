package br.com.softplan.aplication.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author Moquiuti
 */
@Entity
@Table(name = "pessoa")
@NamedQueries({
        @NamedQuery(name = "Pessoa.findByCpf",
                query = "SELECT p FROM Pessoa p WHERE p.cpf = :p0")
})
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nome não pode ser vazio")
    @Column(length = 150)
    private String nome;

    @NotEmpty(message = "Email não pode ser vazio")
    @Column(length = 400)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Imagem imagem;

    @Column(length = 11)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date nascimento;

    private Boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id) &&
                nome.equals(pessoa.nome) &&
                email.equals(pessoa.email) &&
                imagem.equals(pessoa.imagem) &&
                cpf.equals(pessoa.cpf) &&
                nascimento.equals(pessoa.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, imagem, cpf, nascimento);
    }
}
