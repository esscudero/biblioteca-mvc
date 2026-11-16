package guilhermeescudero.biblioteca.models;

public class Emprestimo {
    private String usuario;
    private String dataRetirada;
    private String dataDevolvido;

    public String getDataDevolvido() {
        return dataDevolvido;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public void setDataDevolvido(String dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
}
