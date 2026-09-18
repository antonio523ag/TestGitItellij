import java.time.LocalDate;

public class Automobile {

    private String targa;
    private LocalDate dataImmatricolazione;

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public LocalDate getDataImmatricolazione() {
        return dataImmatricolazione;
    }

    public void setDataImmatricolazione(LocalDate dataImmatricolazione) {
        this.dataImmatricolazione = dataImmatricolazione;
    }
}
