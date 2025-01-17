package entidades;

import java.time.LocalTime;
import java.util.Date;

public class Consultas {

    private Date data;
    private LocalTime hora;
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private Boolean estresse;

    public Consultas(Date data, LocalTime hora, int pressaoSistolica, int pressaoDiastolica, Boolean estresse) {
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoDiastolica;
        this.pressaoDiastolica = pressaoSistolica;
        this.estresse = estresse;
    }

    public Date getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public double getPresSistolica() {
        return pressaoSistolica;
    }

    public double getPresDiastolica() {
        return pressaoDiastolica;
    }

    public Boolean getEstresse() {
        return estresse;
    }

    public void setData(Date Data) {
        this.data = Data;
    }

    public void setHora(LocalTime Hora) {
        this.hora = Hora;
    }

    public void setPresSistolica(int PresSistolica) {
        this.pressaoSistolica = PresSistolica;
    }

    public void setPresDiastolica(int presDiastolica) {
        this.pressaoDiastolica = presDiastolica;
    }

    public void setEstresse(Boolean estresse) {
        this.estresse = estresse;
    }
}
