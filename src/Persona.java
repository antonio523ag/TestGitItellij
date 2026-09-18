import java.time.LocalDate;

public class Persona {
    private String email;
    private String password;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private LocalDate dataNascita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
        }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPassword() {
        return password;
    }
    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
