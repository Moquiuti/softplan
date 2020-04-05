package br.com.softplan.aplication.entidades;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Moquiuti
 */
@Entity
@Table(name = "imagem")
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

    @Column(length = 100)
    private String titulo;

    private String tamanho;

    private String base64;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public Imagem(Long id, Date dataCadastro, String titulo, String tamanho, String base64) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.titulo = titulo;
        this.tamanho = tamanho;
        this.base64 = base64;
    }

    public Imagem() {
    }

}
