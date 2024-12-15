package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Consulta {

    private Date data;
    private LocalTime hora;
    private int presSistolica;
    private int presDiastolica;
    private Boolean estresse;

    public Consulta(Date data, LocalTime hora, int presSistolica, int presDiastolica, Boolean estresse) {
        this.data = data;
        this.hora = hora;
        this.presDiastolica = presDiastolica;
        this.presSistolica = presSistolica;
        this.estresse = estresse;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date Data) {
        this.data = Data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime Hora) {
        this.hora = Hora;
    }

    public double getPresSistolica() {
        return presSistolica;
    }

    public void setPresSistolica(int PresSistolica) {
        this.presSistolica = PresSistolica;
    }

    public double getPresDiastolica() {
        return presDiastolica;
    }

    public void setPresDiastolica(int presDiastolica) {
        this.presDiastolica = presDiastolica;
    }

    public Boolean getEstresse() {
        return estresse;
    }

    public void setEstresse(Boolean estresse) {
        this.estresse = estresse;
    }
}
