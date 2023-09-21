package exercicio2;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class exercicio1 {
        private Integer numeroDoQuarto;
        private Date checkIn;
        private Date checkOut;
        private static SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        public  exercicio1(Integer numeroDoQuarto, Date checkIn, Date checkOut){
            super();
            this.numeroDoQuarto= numeroDoQuarto;
            this.checkIn=checkIn;
            this.checkOut=checkOut;
        }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public long duracao(){
            long diferenca = checkOut.getTime()-checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);

    }
    public void atualizacaoDeDatas(Date checkIn, Date checkOut){
            this.checkIn=checkIn;
            this.checkOut=checkOut;
    }

    @Override
    public String toString() {
        return "quarto: "+numeroDoQuarto+", check in: "+dateFormat.format(checkIn)+", check out: "+dateFormat.format(checkOut)+", "+duracao()+"noites";
    }
}
