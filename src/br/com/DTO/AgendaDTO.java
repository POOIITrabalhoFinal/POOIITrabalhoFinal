
package br.com.DTO;

import java.sql.Time;
import java.sql.Date;

public class AgendaDTO {
    private int id_agenda, fk_cliente;
    private Date data_agenda;
    private Time hora;
    private String desc;

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public int getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public Date getData_agenda() {
        return data_agenda;
    }

    public void setData_agenda(Date data_agenda) {
        this.data_agenda = data_agenda;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
}
